package com.seeyon.form.bean;

import java.util.Date;

public class FormBean {

	/**
	 * ��ID
	 */
	private long formId;
	
	/**
	 * ������
	 */
	private String formName;
	
	/**
	 * ������
	 */
	private int formType;
	
	/**
	 * ��������
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
