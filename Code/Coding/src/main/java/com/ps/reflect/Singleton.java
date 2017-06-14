package com.ps.reflect;
/*
 * Double Check Idiom 
 */
public class Singleton {
	private volatile static Singleton instance;
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		if(null == instance){
			synchronized(Singleton.class){
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	public String getName(){
		return this.toString();
	}
}
