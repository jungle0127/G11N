package com.ps.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.ps.datetime.util.FormatData_ja;

public class ValidateJapaneseDateFormat {
	public void printData(String key){
		FormatData_ja df = new FormatData_ja();
		String[] strs = df.getStringArray(key);
		SimpleDateFormat sdFormat;
		for(String item : strs){
			System.out.println("======================");
			System.out.println(key);
			System.out.println(item);
			sdFormat = new SimpleDateFormat(item,Locale.JAPANESE);
			System.out.println(sdFormat.format(new Date()));
			System.out.println("======================");
		}
	}
	public void printItem(String key){
		FormatData_ja df = new FormatData_ja();
		String[] strs = df.getStringArray(key);
		for(String item : strs){
			System.out.println("----------------------");
			System.out.println("***" + key + "***");
			System.out.println(item);
			System.out.println("----------------------");
		}
	}
	public static void main(String[] args) {
		ValidateJapaneseDateFormat vcdf = new ValidateJapaneseDateFormat();
		vcdf.printData("MonthNames");
		vcdf.printData("MonthAbbreviations");
		vcdf.printData("DayNames");
		vcdf.printData("DayAbbreviations");
		vcdf.printData("DayNarrows");
		vcdf.printData("AmPmMarkers");
		vcdf.printData("Eras");
		vcdf.printData("buddhist.Eras");
		vcdf.printData("japanese.Eras");
		vcdf.printData("TimePatterns");
		vcdf.printData("DatePatterns");
		vcdf.printData("japanese.DatePatterns");
		
		vcdf.printItem("NumberElements");
		vcdf.printItem("japanese.FirstYear");
		vcdf.printItem("japanese.Eras");
		
		SimpleDateFormat sdf = new SimpleDateFormat("GGGGy\u5e74MM\u6708d\u65e5EEEE");
		System.out.println(sdf.format(new Date()));
		sdf = new SimpleDateFormat("ahh'\u65f6'mm'\u5206'ss'\u79d2' z");
		System.out.println(sdf.format(new Date()));
	}

}