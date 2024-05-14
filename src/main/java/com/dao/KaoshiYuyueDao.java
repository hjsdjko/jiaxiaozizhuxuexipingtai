package com.dao;

import com.entity.KaoshiYuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshiYuyueView;

/**
 * 考试预约 Dao 接口
 *
 * @author 
 */
public interface KaoshiYuyueDao extends BaseMapper<KaoshiYuyueEntity> {

   List<KaoshiYuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
