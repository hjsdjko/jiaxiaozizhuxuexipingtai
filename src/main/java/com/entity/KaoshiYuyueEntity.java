package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 考试预约
 *
 * @author 
 * @email
 */
@TableName("kaoshi_yuyue")
public class KaoshiYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KaoshiYuyueEntity() {

	}

	public KaoshiYuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

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
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "KaoshiYuyue{" +
            "id=" + id +
            ", kaoshiId=" + kaoshiId +
            ", yonghuId=" + yonghuId +
            ", insertTime=" + insertTime +
            ", kaoshiYuyueTypes=" + kaoshiYuyueTypes +
            ", kaoshiYuyueChengji=" + kaoshiYuyueChengji +
            ", kaoshiYuyueText=" + kaoshiYuyueText +
            ", updateTime=" + updateTime +
            ", createTime=" + createTime +
        "}";
    }
}
