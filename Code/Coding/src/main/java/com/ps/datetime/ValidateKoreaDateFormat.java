package com.ps.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.ps.datetime.util.FormatData_ko;

public class ValidateKoreaDateFormat {
	public void printData(String key){
		FormatData_ko df = new FormatData_ko();
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
		FormatData_ko df = new FormatData_ko();
		String[] strs = df.getStringArray(key);
		System.out.println("----------------------");
		System.out.println("***" + key + "***");
		for(String item : strs){
			System.out.println(item);
		}
		System.out.println("----------------------");
	}
	public static void main(String[] args) {
		ValidateKoreaDateFormat vfd = new ValidateKoreaDateFormat();
		vfd.printItem("MonthNames");
		vfd.printItem("MonthAbbreviations");
		vfd.printItem("DayNames");
		vfd.printItem("DayAbbreviations");
		vfd.printData("TimePatterns");
		vfd.printData("DatePatterns");
	}

}
