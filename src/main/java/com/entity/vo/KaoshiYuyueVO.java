package com.entity.vo;

import com.entity.KaoshiYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 考试预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kaoshi_yuyue")
public class KaoshiYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 考试
     */

    @TableField(value = "kaoshi_id")
    private Integer kaoshiId;


    /**
     * 学员
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 预约状态
     */

    @TableField(value = "kaoshi_yuyue_types")
    private Integer kaoshiYuyueTypes;


    /**
     * 考试成绩
     */

    @TableField(value = "kaoshi_yuyue_chengji")
    private Double kaoshiYuyueChengji;


    /**
     * 成绩备注
     */

    @TableField(value = "kaoshi_yuyue_text")
    private String kaoshiYuyueText;


    /**
     * 最后更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "update_time")
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：考试
	 */
    public Integer getKaoshiId() {
        return kaoshiId;
    }


    /**
	 * 获取：考试
	 */

    public void setKaoshiId(Integer kaoshiId) {
        this.kaoshiId = kaoshiId;
    }
    /**
	 * 设置：学员
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学员
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：预约状态
	 */
    public Integer getKaoshiYuyueTypes() {
        return kaoshiYuyueTypes;
    }


    /**
	 * 获取：预约状态
	 */

    public void setKaoshiYuyueTypes(Integer kaoshiYuyueTypes) {
        this.kaoshiYuyueTypes = kaoshiYuyueTypes;
    }
    /**
	 * 设置：考试成绩
	 */
    public Double getKaoshiYuyueChengji() {
        return kaoshiYuyueChengji;
    }


    /**
	 * 获取：考试成绩
	 */

    public void setKaoshiYuyueChengji(Double kaoshiYuyueChengji) {
        this.kaoshiYuyueChengji = kaoshiYuyueChengji;
    }
    /**
	 * 设置：成绩备注
	 */
    public String getKaoshiYuyueText() {
        return kaoshiYuyueText;
    }


    /**
	 * 获取：成绩备注
	 */

    public void setKaoshiYuyueText(String kaoshiYuyueText) {
        this.kaoshiYuyueText = kaoshiYuyueText;
    }
    /**
	 * 设置：最后更新时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：最后更新时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
