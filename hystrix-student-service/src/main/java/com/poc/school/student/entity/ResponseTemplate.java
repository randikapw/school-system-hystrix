package com.poc.school.student.entity;

public class ResponseTemplate<T> {
	public T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ResponseTemplate(T data) {
		super();
		this.data = data;
	}
	
	public static <U> ResponseTemplate<U> get(U t){
		return new ResponseTemplate<U>(t);
	}

}
