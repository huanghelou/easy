package com.seeyon.form.dao;

import com.seeyon.form.bean.FormDataBean;

public interface FormDataDao {

	/**
	 * ���FormData��Ϣ
	 * @param formDataBean
	 */
	void addFormData(FormDataBean formDataBean);
	
	/**
	 * ����IDɾ��FormData
	 * @param id
	 */
	void deleteFormData(long id);
	
	/**
	 * ͨ��ID����FormData
	 * @param id
	 * @return
	 */
	FormDataBean findFormDataById(long id);
	
	/**
	 * ����FormData
	 * @param formDataBean
	 */
	void updateFormData(FormDataBean formDataBean);
	
	
}
