
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 考试预约
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/kaoshiYuyue")
public class KaoshiYuyueController {
    private static final Logger logger = LoggerFactory.getLogger(KaoshiYuyueController.class);

    @Autowired
    private KaoshiYuyueService kaoshiYuyueService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private KaoshiService kaoshiService;
    @Autowired
    private YonghuService yonghuService;

    @Autowired
    private JiaolianService jiaolianService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("学员".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("教练".equals(role))
            params.put("jiaolianId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = kaoshiYuyueService.queryPage(params);

        //字典表数据转换
        List<KaoshiYuyueView> list =(List<KaoshiYuyueView>)page.getList();
        for(KaoshiYuyueView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        KaoshiYuyueEntity kaoshiYuyue = kaoshiYuyueService.selectById(id);
        if(kaoshiYuyue !=null){
            //entity转view
            KaoshiYuyueView view = new KaoshiYuyueView();
            BeanUtils.copyProperties( kaoshiYuyue , view );//把实体数据重构到view中

                //级联表
                KaoshiEntity kaoshi = kaoshiService.selectById(kaoshiYuyue.getKaoshiId());
                if(kaoshi != null){
                    BeanUtils.copyProperties( kaoshi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setKaoshiId(kaoshi.getId());
                }
                //级联表
                YonghuEntity yonghu = yonghuService.selectById(kaoshiYuyue.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody KaoshiYuyueEntity kaoshiYuyue, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,kaoshiYuyue:{}",this.getClass().getName(),kaoshiYuyue.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("学员".equals(role))
            kaoshiYuyue.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<KaoshiYuyueEntity> queryWrapper = new EntityWrapper<KaoshiYuyueEntity>()
            .eq("kaoshi_id", kaoshiYuyue.getKaoshiId())
            .eq("yonghu_id", kaoshiYuyue.getYonghuId())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        KaoshiYuyueEntity kaoshiYuyueEntity = kaoshiYuyueService.selectOne(queryWrapper);
        if(kaoshiYuyueEntity==null){
            kaoshiYuyue.setInsertTime(new Date());
            kaoshiYuyue.setCreateTime(new Date());
            kaoshiYuyueService.insert(kaoshiYuyue);
            return R.ok();
        }else {
            return R.error(511,"该学员已经预约过此次考试了");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody KaoshiYuyueEntity kaoshiYuyue, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,kaoshiYuyue:{}",this.getClass().getName(),kaoshiYuyue.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("学员".equals(role))
//            kaoshiYuyue.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<KaoshiYuyueEntity> queryWrapper = new EntityWrapper<KaoshiYuyueEntity>()
            .notIn("id",kaoshiYuyue.getId())
            .andNew()
            .eq("kaoshi_id", kaoshiYuyue.getKaoshiId())
            .eq("yonghu_id", kaoshiYuyue.getYonghuId())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        KaoshiYuyueEntity kaoshiYuyueEntity = kaoshiYuyueService.selectOne(queryWrapper);
        kaoshiYuyue.setUpdateTime(new Date());
        if(kaoshiYuyueEntity==null){
            kaoshiYuyueService.updateById(kaoshiYuyue);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"该学员已经预约过此次考试了");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        kaoshiYuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<KaoshiYuyueEntity> kaoshiYuyueList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("../../upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            KaoshiYuyueEntity kaoshiYuyueEntity = new KaoshiYuyueEntity();
//                            kaoshiYuyueEntity.setKaoshiId(Integer.valueOf(data.get(0)));   //考试 要改的
//                            kaoshiYuyueEntity.setYonghuId(Integer.valueOf(data.get(0)));   //学员 要改的
//                            kaoshiYuyueEntity.setInsertTime(date);//时间
//                            kaoshiYuyueEntity.setKaoshiYuyueTypes(Integer.valueOf(data.get(0)));   //预约状态 要改的
//                            kaoshiYuyueEntity.setKaoshiYuyueChengji(data.get(0));                    //考试成绩 要改的
//                            kaoshiYuyueEntity.setKaoshiYuyueText(data.get(0));                    //成绩备注 要改的
//                            kaoshiYuyueEntity.setUpdateTime(sdf.parse(data.get(0)));          //最后更新时间 要改的
//                            kaoshiYuyueEntity.setCreateTime(date);//时间
                            kaoshiYuyueList.add(kaoshiYuyueEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        kaoshiYuyueService.insertBatch(kaoshiYuyueList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
