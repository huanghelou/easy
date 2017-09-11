package com.seeyon.form.bean;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class FormDataBean {

	/**
	 * FormData��ID
	 */
	private long id;
	
	/**
	 * ״̬:0.����    1.�ݸ�     2.����
	 */
	private int state;
	
	/**
	 * �޸�ʱ��
	 */
	private Date modifyDate;
	
	/**
	 * ���еı��
	 */
    private FormTableBean formTable;

    /**
     * ����һ��ֵ�洢����	key:�ֶ����� value:�ֶ�ֵ
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
