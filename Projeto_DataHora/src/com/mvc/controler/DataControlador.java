package com.mvc.controler;

import com.mvc.model.Data;

public class DataControlador {
	
	public String getDataCerta() {
		Data data = new Data();
		return data.getData();
	}

}
