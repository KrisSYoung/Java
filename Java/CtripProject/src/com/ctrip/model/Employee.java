package com.ctrip.model;

public class Employee {
	private String id;
	private String code;
	private String name;
	
	//这个变量存放在静态堆区
	private static int count=0;
    public Employee(){
    	count++;
    };
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
