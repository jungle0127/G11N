package com.ps.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.ps.datetime.util.FormatData_ko;
import com.ps.datetime.util.FormatData_pt_BR;

public class ValidatePortugueseBrazilianDateFormat {
	public void printData(String key){
		FormatData_pt_BR df = new FormatData_pt_BR();
		String[] strs = df.getStringArray(key);
		SimpleDateFormat sdFormat;
		for(String item : strs){
			System.out.println("======================");
			System.out.println(key);
			System.out.println(item);
			sdFormat = new SimpleDateFormat(item,Locale.FRENCH);
			System.out.println(sdFormat.format(new Date()));
			System.out.println("======================");
		}
	}
	public void printItem(String key){
		FormatData_pt_BR df = new FormatData_pt_BR();
		String[] strs = df.getStringArray(key);
		System.out.println("----------------------");
		System.out.println("***" + key + "***");
		for(String item : strs){
			System.out.println(item);
		}
		System.out.println("----------------------");
	}
	public static void main(String[] args) {
		ValidatePortugueseBrazilianDateFormat vfd = new ValidatePortugueseBrazilianDateFormat();
		vfd.printItem("MonthNames");
		vfd.printItem("MonthAbbreviations");
		vfd.printItem("DayNames");
		vfd.printItem("DayAbbreviations");
		vfd.printData("TimePatterns");
		vfd.printData("DatePatterns");
	}

}