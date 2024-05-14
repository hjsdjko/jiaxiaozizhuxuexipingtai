package com.entity.model;

import com.entity.KaoshiYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 考试预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaoshiYuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 考试
     */
    private Integer kaoshiId;


    /**
     * 学员
     */
    private Integer yonghuId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 预约状态
     */
    private Integer kaoshiYuyueTypes;


    /**
     * 考试成绩
     */
    private Double kaoshiYuyueChengji;


    /**
     * 成绩备注
     */
    private String kaoshiYuyueText;


    /**
     * 最后更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：考试
	 */
    public Integer getKaoshiId() {
        return kaoshiId;
    }


    /**
	 * 设置：考试
	 */
    public void setKaoshiId(Integer kaoshiId) {
        this.kaoshiId = kaoshiId;
    }
    /**
	 * 获取：学员
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学员
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：预约状态
	 */
    public Integer getKaoshiYuyueTypes() {
        return kaoshiYuyueTypes;
    }


    /**
	 * 设置：预约状态
	 */
    public void setKaoshiYuyueTypes(Integer kaoshiYuyueTypes) {
        this.kaoshiYuyueTypes = kaoshiYuyueTypes;
    }
    /**
	 * 获取：考试成绩
	 */
    public Double getKaoshiYuyueChengji() {
        return kaoshiYuyueChengji;
    }


    /**
	 * 设置：考试成绩
	 */
    public void setKaoshiYuyueChengji(Double kaoshiYuyueChengji) {
        this.kaoshiYuyueChengji = kaoshiYuyueChengji;
    }
    /**
	 * 获取：成绩备注
	 */
    public String getKaoshiYuyueText() {
        return kaoshiYuyueText;
    }


    /**
	 * 设置：成绩备注
	 */
    public void setKaoshiYuyueText(String kaoshiYuyueText) {
        this.kaoshiYuyueText = kaoshiYuyueText;
    }
    /**
	 * 获取：最后更新时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 设置：最后更新时间
	 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
