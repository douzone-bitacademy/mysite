package com.douzone.mysite.dto;

public class JsonResult {
	private String result;  /* "success" or "fail" */
	private Object data;    /* if success, Data set */
	private String message; /* if fail, Error Message set */
	
	private JsonResult(Object data) {
		result = "success";
		this.data = data;
	}

	private JsonResult(String message) {
		result = "fail";
		this.message = message;
	}

	public static JsonResult success(Object data) {
		return new JsonResult(data);
	}

	public static JsonResult fail(String message) {
		return new JsonResult(message);
	}
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
