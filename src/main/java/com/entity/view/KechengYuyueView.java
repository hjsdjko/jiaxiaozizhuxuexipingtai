package com.entity.view;

import com.entity.KechengYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kecheng_yuyue")
public class KechengYuyueView extends KechengYuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 预约状态的值
		*/
		private String kechengYuyueYesnoValue;



		//级联表 kecheng
			/**
			* 课程 的 教练
			*/
			private Integer kechengJiaolianId;
			/**
			* 课程编号
			*/
			private String kechengUuidNumber;
			/**
			* 课程名称
			*/
			private String kechengName;
			/**
			* 课程类型
			*/
			private Integer kechengTypes;
				/**
				* 课程类型的值
				*/
				private String kechengValue;
			/**
			* 上课时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date shangkeTime;
			/**
			* 上课地点
			*/
			private String shangkeAddress;
			/**
			* 课程内容
			*/
			private String kechengContent;

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

	public KechengYuyueView() {

	}

	public KechengYuyueView(KechengYuyueEntity kechengYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, kechengYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 预约状态的值
			*/
			public String getKechengYuyueYesnoValue() {
				return kechengYuyueYesnoValue;
			}
			/**
			* 设置： 预约状态的值
			*/
			public void setKechengYuyueYesnoValue(String kechengYuyueYesnoValue) {
				this.kechengYuyueYesnoValue = kechengYuyueYesnoValue;
			}




























				//级联表的get和set kecheng

					/**
					* 获取：课程 的 教练
					*/
					public Integer getKechengJiaolianId() {
						return kechengJiaolianId;
					}
					/**
					* 设置：课程 的 教练
					*/
					public void setKechengJiaolianId(Integer kechengJiaolianId) {
						this.kechengJiaolianId = kechengJiaolianId;
					}


					/**
					* 获取： 课程编号
					*/
					public String getKechengUuidNumber() {
						return kechengUuidNumber;
					}
					/**
					* 设置： 课程编号
					*/
					public void setKechengUuidNumber(String kechengUuidNumber) {
						this.kechengUuidNumber = kechengUuidNumber;
					}

					/**
					* 获取： 课程名称
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}

					/**
					* 获取： 课程类型
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}

					/**
					* 获取： 上课时间
					*/
					public Date getShangkeTime() {
						return shangkeTime;
					}
					/**
					* 设置： 上课时间
					*/
					public void setShangkeTime(Date shangkeTime) {
						this.shangkeTime = shangkeTime;
					}

					/**
					* 获取： 上课地点
					*/
					public String getShangkeAddress() {
						return shangkeAddress;
					}
					/**
					* 设置： 上课地点
					*/
					public void setShangkeAddress(String shangkeAddress) {
						this.shangkeAddress = shangkeAddress;
					}

					/**
					* 获取： 课程内容
					*/
					public String getKechengContent() {
						return kechengContent;
					}
					/**
					* 设置： 课程内容
					*/
					public void setKechengContent(String kechengContent) {
						this.kechengContent = kechengContent;
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
