package com.seeyon.form.bean;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class FormDataBean {

	/**
	 * FormData的ID
	 */
	private long id;
	
	/**
	 * 状态:0.正常    1.草稿     2.锁定
	 */
	private int state;
	
	/**
	 * 修改时间
	 */
	private Date modifyDate;
	
	/**
	 * 表单中的表格
	 */
    private FormTableBean formTable;

    /**
     * 单据一行值存储对象	key:字段名称 value:字段值
     */
    private Map<String, Object> dataValue = new LinkedHashMap<String, Object>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public FormTableBean getFormTable() {
		return formTable;
	}

	public void setFormTable(FormTableBean formTable) {
		this.formTable = formTable;
	}

	public Map<String, Object> getDataValue() {
		return dataValue;
	}

	public void setDataValue(Map<String, Object> dataValue) {
		this.dataValue = dataValue;
	}
    
    
}
