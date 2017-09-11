package com.seeyon.form.bean;

import java.util.LinkedHashMap;
import java.util.Map;

public class FormTableBean {

	/**
	 * FormTable的ID
	 */
	private Long id;
	
	/**
	 * 表单表名称
	 */
	private String tableName;
	
	/**
	 * 表单ID
	 */
	private Long formId;
	
	/**
	 * 表单字段map,key:FormFieldBean.name
	 */
	private Map<String, FormFieldBean> fieldMap = new LinkedHashMap<String, FormFieldBean>();

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Long getFormId() {
		return formId;
	}

	public void setFormId(Long formId) {
		this.formId = formId;
	}

	public Map<String, FormFieldBean> getFieldMap() {
		return fieldMap;
	}

	public void setFieldMap(Map<String, FormFieldBean> fieldMap) {
		this.fieldMap = fieldMap;
	}
	
	
}
