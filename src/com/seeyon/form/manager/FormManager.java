package com.seeyon.form.manager;

import com.seeyon.form.bean.FormBean;
import com.seeyon.form.dao.FormDataDao;

public class FormManager {
	
	private FormDataDao formDataDao;

	public FormBean getEditForm(long id){
		return new FormBean();
	}
}
