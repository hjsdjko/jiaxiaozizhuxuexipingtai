package com.entity.vo;

import com.entity.KechengYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课程预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kecheng_yuyue")
public class KechengYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 课程
     */

    @TableField(value = "kecheng_id")
    private Integer kechengId;


    /**
     * 学员
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 课程预约内容
     */

    @TableField(value = "kecheng_yuyue_content")
    private String kechengYuyueContent;


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

    @TableField(value = "kecheng_yuyue_yesno_types")
    private Integer kechengYuyueYesnoTypes;


    /**
     * 预约回复
     */

    @TableField(value = "kecheng_yuyue_yesno_text")
    private String kechengYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "kecheng_yuyue_shenhe_time")
    private Date kechengYuyueShenheTime;


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
	 * 设置：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 获取：课程
	 */

    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
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
	 * 设置：课程预约内容
	 */
    public String getKechengYuyueContent() {
        return kechengYuyueContent;
    }


    /**
	 * 获取：课程预约内容
	 */

    public void setKechengYuyueContent(String kechengYuyueContent) {
        this.kechengYuyueContent = kechengYuyueContent;
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
    public Integer getKechengYuyueYesnoTypes() {
        return kechengYuyueYesnoTypes;
    }


    /**
	 * 获取：预约状态
	 */

    public void setKechengYuyueYesnoTypes(Integer kechengYuyueYesnoTypes) {
        this.kechengYuyueYesnoTypes = kechengYuyueYesnoTypes;
    }
    /**
	 * 设置：预约回复
	 */
    public String getKechengYuyueYesnoText() {
        return kechengYuyueYesnoText;
    }


    /**
	 * 获取：预约回复
	 */

    public void setKechengYuyueYesnoText(String kechengYuyueYesnoText) {
        this.kechengYuyueYesnoText = kechengYuyueYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getKechengYuyueShenheTime() {
        return kechengYuyueShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setKechengYuyueShenheTime(Date kechengYuyueShenheTime) {
        this.kechengYuyueShenheTime = kechengYuyueShenheTime;
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
