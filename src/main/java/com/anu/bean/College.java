package com.anu.bean;

import java.util.Arrays;

public class College {
	//property name
	private int stuId[];
	private String stuName[];
	private String stuAddr[];
	
		//setter method
	public void setStuId(int[] stuId) {
		this.stuId = stuId;
	}
	public void setStuName(String[] stuName) {
		this.stuName = stuName;
	}
	public void setStuAddr(String[] stuAddr) {
		this.stuAddr = stuAddr;
	}
	
	
	@Override
	public String toString() {
		return "College [stuId=" + Arrays.toString(stuId) + ", stuName=" + Arrays.toString(stuName) + ", stuAddr="
				+ Arrays.toString(stuAddr) + "]";
	}
	
	
		
}
