package com.ps.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.ps.datetime.util.FormatData_de;

public class ValidateGermanDateFormat {
	public void printData(String key){
		FormatData_de df = new FormatData_de();
		String[] strs = df.getStringArray(key);
		SimpleDateFormat sdFormat;
		for(String item : strs){
			System.out.println("======================");
			System.out.println(key);
			System.out.println(item);
			sdFormat = new SimpleDateFormat(item,Locale.GERMAN);
			System.out.println(sdFormat.format(new Date()));
			System.out.println("======================");
		}
	}
	public void printItem(String key){
		FormatData_de df = new FormatData_de();
		String[] strs = df.getStringArray(key);
		for(String item : strs){
			System.out.println("----------------------");
			System.out.println("***" + key + "***");
			System.out.println(item);
			System.out.println("----------------------");
		}
	}
	public static void main(String[] args) {
		ValidateGermanDateFormat vcdf = new ValidateGermanDateFormat();
		vcdf.printItem("MonthNames");
		vcdf.printItem("MonthAbbreviations");
		vcdf.printItem("MonthNarrows");
		vcdf.printItem("DayNames");
		vcdf.printItem("DayAbbreviations");
		vcdf.printItem("standalone.DayAbbreviations");
		vcdf.printItem("DayNarrows");
		vcdf.printItem("Eras");
		vcdf.printItem("short.Eras");
		vcdf.printData("TimePatterns");
		vcdf.printData("DatePatterns");
		
//		vcdf.printItem("NumberElements");
	}

}
