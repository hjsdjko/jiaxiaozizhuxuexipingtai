package com.entity.view;

import com.entity.KaoshiYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 考试预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kaoshi_yuyue")
public class KaoshiYuyueView extends KaoshiYuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 预约状态的值
		*/
		private String kaoshiYuyueValue;



		//级联表 kaoshi
			/**
			* 考试 的 教练
			*/
			private Integer kaoshiJiaolianId;
			/**
			* 考试编号
			*/
			private String kaoshiUuidNumber;
			/**
			* 考试名称
			*/
			private String kaoshiName;
			/**
			* 考试类型
			*/
			private Integer kaoshiTypes;
				/**
				* 考试类型的值
				*/
				private String kaoshiValue;
			/**
			* 考试时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date shangkeTime;
			/**
			* 考试地点
			*/
			private String shangkeAddress;
			/**
			* 考试内容
			*/
			private String kaoshiContent;

		//级联表 yonghu
			/**
			* 学号
			*/
			private String yonghuUuidNumber;
			/**
			* 学员姓名
			*/
			private String yonghuName;
			/**
			* 学员手机号
			*/
			private String yonghuPhone;
			/**
			* 学员身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 学员头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public KaoshiYuyueView() {

	}

	public KaoshiYuyueView(KaoshiYuyueEntity kaoshiYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, kaoshiYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 预约状态的值
			*/
			public String getKaoshiYuyueValue() {
				return kaoshiYuyueValue;
			}
			/**
			* 设置： 预约状态的值
			*/
			public void setKaoshiYuyueValue(String kaoshiYuyueValue) {
				this.kaoshiYuyueValue = kaoshiYuyueValue;
			}






















				//级联表的get和set kaoshi

					/**
					* 获取：考试 的 教练
					*/
					public Integer getKaoshiJiaolianId() {
						return kaoshiJiaolianId;
					}
					/**
					* 设置：考试 的 教练
					*/
					public void setKaoshiJiaolianId(Integer kaoshiJiaolianId) {
						this.kaoshiJiaolianId = kaoshiJiaolianId;
					}


					/**
					* 获取： 考试编号
					*/
					public String getKaoshiUuidNumber() {
						return kaoshiUuidNumber;
					}
					/**
					* 设置： 考试编号
					*/
					public void setKaoshiUuidNumber(String kaoshiUuidNumber) {
						this.kaoshiUuidNumber = kaoshiUuidNumber;
					}

					/**
					* 获取： 考试名称
					*/
					public String getKaoshiName() {
						return kaoshiName;
					}
					/**
					* 设置： 考试名称
					*/
					public void setKaoshiName(String kaoshiName) {
						this.kaoshiName = kaoshiName;
					}

					/**
					* 获取： 考试类型
					*/
					public Integer getKaoshiTypes() {
						return kaoshiTypes;
					}
					/**
					* 设置： 考试类型
					*/
					public void setKaoshiTypes(Integer kaoshiTypes) {
						this.kaoshiTypes = kaoshiTypes;
					}


						/**
						* 获取： 考试类型的值
						*/
						public String getKaoshiValue() {
							return kaoshiValue;
						}
						/**
						* 设置： 考试类型的值
						*/
						public void setKaoshiValue(String kaoshiValue) {
							this.kaoshiValue = kaoshiValue;
						}

					/**
					* 获取： 考试时间
					*/
					public Date getShangkeTime() {
						return shangkeTime;
					}
					/**
					* 设置： 考试时间
					*/
					public void setShangkeTime(Date shangkeTime) {
						this.shangkeTime = shangkeTime;
					}

					/**
					* 获取： 考试地点
					*/
					public String getShangkeAddress() {
						return shangkeAddress;
					}
					/**
					* 设置： 考试地点
					*/
					public void setShangkeAddress(String shangkeAddress) {
						this.shangkeAddress = shangkeAddress;
					}

					/**
					* 获取： 考试内容
					*/
					public String getKaoshiContent() {
						return kaoshiContent;
					}
					/**
					* 设置： 考试内容
					*/
					public void setKaoshiContent(String kaoshiContent) {
						this.kaoshiContent = kaoshiContent;
					}
















				//级联表的get和set yonghu

					/**
					* 获取： 学号
					*/
					public String getYonghuUuidNumber() {
						return yonghuUuidNumber;
					}
					/**
					* 设置： 学号
					*/
					public void setYonghuUuidNumber(String yonghuUuidNumber) {
						this.yonghuUuidNumber = yonghuUuidNumber;
					}

					/**
					* 获取： 学员姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学员姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 学员手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 学员手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 学员身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学员身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 学员头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 学员头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}






}
