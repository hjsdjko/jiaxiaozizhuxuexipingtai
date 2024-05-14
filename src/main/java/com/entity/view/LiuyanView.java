package com.entity.view;

import com.entity.LiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 留言板
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("liuyan")
public class LiuyanView extends LiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




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

		//级联表 jiaolian
			/**
			* 教练工号
			*/
			private String jiaolianUuidNumber;
			/**
			* 教练姓名
			*/
			private String jiaolianName;
			/**
			* 教练手机号
			*/
			private String jiaolianPhone;
			/**
			* 教练身份证号
			*/
			private String jiaolianIdNumber;
			/**
			* 教练头像
			*/
			private String jiaolianPhoto;
			/**
			* 电子邮箱
			*/
			private String jiaolianEmail;

	public LiuyanView() {

	}

	public LiuyanView(LiuyanEntity liuyanEntity) {
		try {
			BeanUtils.copyProperties(this, liuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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




				//级联表的get和set jiaolian

					/**
					* 获取： 教练工号
					*/
					public String getJiaolianUuidNumber() {
						return jiaolianUuidNumber;
					}
					/**
					* 设置： 教练工号
					*/
					public void setJiaolianUuidNumber(String jiaolianUuidNumber) {
						this.jiaolianUuidNumber = jiaolianUuidNumber;
					}

					/**
					* 获取： 教练姓名
					*/
					public String getJiaolianName() {
						return jiaolianName;
					}
					/**
					* 设置： 教练姓名
					*/
					public void setJiaolianName(String jiaolianName) {
						this.jiaolianName = jiaolianName;
					}

					/**
					* 获取： 教练手机号
					*/
					public String getJiaolianPhone() {
						return jiaolianPhone;
					}
					/**
					* 设置： 教练手机号
					*/
					public void setJiaolianPhone(String jiaolianPhone) {
						this.jiaolianPhone = jiaolianPhone;
					}

					/**
					* 获取： 教练身份证号
					*/
					public String getJiaolianIdNumber() {
						return jiaolianIdNumber;
					}
					/**
					* 设置： 教练身份证号
					*/
					public void setJiaolianIdNumber(String jiaolianIdNumber) {
						this.jiaolianIdNumber = jiaolianIdNumber;
					}

					/**
					* 获取： 教练头像
					*/
					public String getJiaolianPhoto() {
						return jiaolianPhoto;
					}
					/**
					* 设置： 教练头像
					*/
					public void setJiaolianPhoto(String jiaolianPhoto) {
						this.jiaolianPhoto = jiaolianPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getJiaolianEmail() {
						return jiaolianEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setJiaolianEmail(String jiaolianEmail) {
						this.jiaolianEmail = jiaolianEmail;
					}



}
