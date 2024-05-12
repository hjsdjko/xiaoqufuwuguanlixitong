package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ChatEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 客服聊天
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("chat")
public class ChatView extends ChatEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 状态的值
	*/
	@ColumnInfo(comment="状态的字典表值",type="varchar(200)")
	private String zhuangtaiValue;
	/**
	* 数据类型的值
	*/
	@ColumnInfo(comment="数据类型的字典表值",type="varchar(200)")
	private String chatValue;

	//级联表 住户
		/**
		* 住户姓名
		*/

		@ColumnInfo(comment="住户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 住户手机号
		*/

		@ColumnInfo(comment="住户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 住户身份证号
		*/

		@ColumnInfo(comment="住户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 住户照片
		*/

		@ColumnInfo(comment="住户照片",type="varchar(200)")
		private String yonghuPhoto;



	public ChatView() {

	}

	public ChatView(ChatEntity chatEntity) {
		try {
			BeanUtils.copyProperties(this, chatEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 状态的值
	*/
	public String getZhuangtaiValue() {
		return zhuangtaiValue;
	}
	/**
	* 设置： 状态的值
	*/
	public void setZhuangtaiValue(String zhuangtaiValue) {
		this.zhuangtaiValue = zhuangtaiValue;
	}
	//当前表的
	/**
	* 获取： 数据类型的值
	*/
	public String getChatValue() {
		return chatValue;
	}
	/**
	* 设置： 数据类型的值
	*/
	public void setChatValue(String chatValue) {
		this.chatValue = chatValue;
	}


	//级联表的get和set 住户

		/**
		* 获取： 住户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 住户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 住户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 住户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 住户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 住户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 住户照片
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 住户照片
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}


	@Override
	public String toString() {
		return "ChatView{" +
			", zhuangtaiValue=" + zhuangtaiValue +
			", chatValue=" + chatValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			"} " + super.toString();
	}
}