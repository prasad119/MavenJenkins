package com.sample.jenMaven;

public class Source {
	public String responce(String value){
		try{
			return "Hello"+" "+value;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
