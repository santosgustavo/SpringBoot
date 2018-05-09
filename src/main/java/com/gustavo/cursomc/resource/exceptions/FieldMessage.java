package com.gustavo.cursomc.resource.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable{
	private static final long serialVersionUID = 1L;

	private String fieldName;
	private String meddage;
	
	public FieldMessage() {
		
	}

	public FieldMessage(String fieldName, String meddage) {
		super();
		this.fieldName = fieldName;
		this.meddage = meddage;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMeddage() {
		return meddage;
	}

	public void setMeddage(String meddage) {
		this.meddage = meddage;
	}
	
	
}
