package com.seeyon.form.bean;

import java.util.Date;

public class FormBean {

	/**
	 * 表单ID
	 */
	private long formId;
	
	/**
	 * 表单名称
	 */
	private String formName;
	
	/**
	 * 表单类型
	 */
	private int formType;
	
	/**
	 * 创建日期
	 */
	private Date creatDate;
	
	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		this.formName = formName;
	}
	public int getFormType() {
		return formType;
	}
	public void setFormType(int formType) {
		this.formType = formType;
	}
	public long getFormId() {
		return formId;
	}
	public void setFormId(long formId) {
		this.formId = formId;
	}
	public Date getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	
	
	
}
