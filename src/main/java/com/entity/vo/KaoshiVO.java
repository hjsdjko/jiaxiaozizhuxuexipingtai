package com.entity.vo;

import com.entity.KaoshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 考试
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kaoshi")
public class KaoshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 教练
     */

    @TableField(value = "jiaolian_id")
    private Integer jiaolianId;


    /**
     * 考试编号
     */

    @TableField(value = "kaoshi_uuid_number")
    private String kaoshiUuidNumber;


    /**
     * 考试名称
     */

    @TableField(value = "kaoshi_name")
    private String kaoshiName;


    /**
     * 考试类型
     */

    @TableField(value = "kaoshi_types")
    private Integer kaoshiTypes;


    /**
     * 考试时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shangke_time")
    private Date shangkeTime;


    /**
     * 考试地点
     */

    @TableField(value = "shangke_address")
    private String shangkeAddress;


    /**
     * 考试内容
     */

    @TableField(value = "kaoshi_content")
    private String kaoshiContent;


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
	 * 设置：教练
	 */
    public Integer getJiaolianId() {
        return jiaolianId;
    }


    /**
	 * 获取：教练
	 */

    public void setJiaolianId(Integer jiaolianId) {
        this.jiaolianId = jiaolianId;
    }
    /**
	 * 设置：考试编号
	 */
    public String getKaoshiUuidNumber() {
        return kaoshiUuidNumber;
    }


    /**
	 * 获取：考试编号
	 */

    public void setKaoshiUuidNumber(String kaoshiUuidNumber) {
        this.kaoshiUuidNumber = kaoshiUuidNumber;
    }
    /**
	 * 设置：考试名称
	 */
    public String getKaoshiName() {
        return kaoshiName;
    }


    /**
	 * 获取：考试名称
	 */

    public void setKaoshiName(String kaoshiName) {
        this.kaoshiName = kaoshiName;
    }
    /**
	 * 设置：考试类型
	 */
    public Integer getKaoshiTypes() {
        return kaoshiTypes;
    }


    /**
	 * 获取：考试类型
	 */

    public void setKaoshiTypes(Integer kaoshiTypes) {
        this.kaoshiTypes = kaoshiTypes;
    }
    /**
	 * 设置：考试时间
	 */
    public Date getShangkeTime() {
        return shangkeTime;
    }


    /**
	 * 获取：考试时间
	 */

    public void setShangkeTime(Date shangkeTime) {
        this.shangkeTime = shangkeTime;
    }
    /**
	 * 设置：考试地点
	 */
    public String getShangkeAddress() {
        return shangkeAddress;
    }


    /**
	 * 获取：考试地点
	 */

    public void setShangkeAddress(String shangkeAddress) {
        this.shangkeAddress = shangkeAddress;
    }
    /**
	 * 设置：考试内容
	 */
    public String getKaoshiContent() {
        return kaoshiContent;
    }


    /**
	 * 获取：考试内容
	 */

    public void setKaoshiContent(String kaoshiContent) {
        this.kaoshiContent = kaoshiContent;
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
