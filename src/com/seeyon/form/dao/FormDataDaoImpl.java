package com.seeyon.form.dao;

import java.util.LinkedHashMap;
import java.util.Map;

import com.seeyon.form.bean.FormDataBean;

public class FormDataDaoImpl implements FormDataDao{

	private Map<Long, FormDataBean> map = new LinkedHashMap<Long, FormDataBean>();
	
	@Override
	public void addFormData(FormDataBean formDataBean) {
		Long id = formDataBean.getId();
		map.put(id, formDataBean);
		
	}

	@Override
	public void deleteFormData(long id) {

		if(null != map.get(id)){
			map.remove(id);
		}
	}

	@Override
	public FormDataBean findFormDataById(long id) {
		return map.get(id);
	}

	@Override
	public void updateFormData(FormDataBean formDataBean) {
		Long id = formDataBean.getId();
		if(null != map.get(id)){
			map.remove(id);
			map.put(id, formDataBean);
		}
		
	}

}
