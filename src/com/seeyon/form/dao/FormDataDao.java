package com.seeyon.form.dao;

import com.seeyon.form.bean.FormDataBean;

public interface FormDataDao {

	/**
	 * 添加FormData信息
	 * @param formDataBean
	 */
	void addFormData(FormDataBean formDataBean);
	
	/**
	 * 根据ID删除FormData
	 * @param id
	 */
	void deleteFormData(long id);
	
	/**
	 * 通过ID查找FormData
	 * @param id
	 * @return
	 */
	FormDataBean findFormDataById(long id);
	
	/**
	 * 更新FormData
	 * @param formDataBean
	 */
	void updateFormData(FormDataBean formDataBean);
	
	
}
