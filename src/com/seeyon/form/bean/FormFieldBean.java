package com.seeyon.form.bean;

public class FormFieldBean {

	/**
	 * ID
	 */
	private Long id;
	
	/**
     * 表单字段名称
     */
    private String name;

    /**
     * 显示名称
     */
    private String display;

    /**
     * 字段类型,varchar、decimal、longtext、datetime、timestamp
     */
    private String fieldType;

    /**
     * 字段长度.
     */
    private String fieldLength;

    /**
     * 小数位.
     */
    private String digitNum;

    /**
     * 是否为空.
     */
    private boolean isNull;

    /**
     * 字段数据是否唯一.
     */
    private boolean isUnique = Boolean.FALSE;

    /**
     * 字段所属表的名字.
     */
    private String ownerTableName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getFieldLength() {
		return fieldLength;
	}

	public void setFieldLength(String fieldLength) {
		this.fieldLength = fieldLength;
	}

	public String getDigitNum() {
		return digitNum;
	}

	public void setDigitNum(String digitNum) {
		this.digitNum = digitNum;
	}

	public boolean isNull() {
		return isNull;
	}

	public void setNull(boolean isNull) {
		this.isNull = isNull;
	}

	public boolean isUnique() {
		return isUnique;
	}

	public void setUnique(boolean isUnique) {
		this.isUnique = isUnique;
	}

	public String getOwnerTableName() {
		return ownerTableName;
	}

	public void setOwnerTableName(String ownerTableName) {
		this.ownerTableName = ownerTableName;
	}
    
    
}
