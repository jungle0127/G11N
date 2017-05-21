package com.ps.unicode;

public class Transformer {
	public void printChinese(){
		for(int beginIndex = 0x4e00;beginIndex <= 0x9Fff; beginIndex++){
			System.out.println(Character.toChars(beginIndex));
		}
		System.out.println(Character.toChars(0x9fd5));
		Integer.toHexString(Character.codePointAt("张", 0));
	}
}
