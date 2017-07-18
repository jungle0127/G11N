package com.ps.datetime;

import java.text.DateFormat;
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
		System.out.println("----------------------");
		System.out.println("***" + key + "***");
		for(String item : strs){
			System.out.println(item);
		}
		System.out.println("----------------------");
	}
	public static void main(String[] args) {
		ValidateJapaneseDateFormat vcdf = new ValidateJapaneseDateFormat();
		vcdf.printItem("MonthNames");
		vcdf.printItem("MonthAbbreviations");
		vcdf.printItem("DayNames");
		vcdf.printItem("DayAbbreviations");
		vcdf.printItem("DayNarrows");
		vcdf.printItem("AmPmMarkers");
		vcdf.printItem("Eras");
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
		
		Date mDate = new Date();
		Locale locale = new Locale("ja","JP");
		
		String fullTime = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,locale).format(mDate);
		System.out.println(fullTime);
		String longTime = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,locale).format(mDate);
		System.out.println(longTime);
		String mediumTime = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM,locale).format(mDate);
		System.out.println(mediumTime);
		String shortTime = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT,locale).format(mDate);
		System.out.println(shortTime);
	}

}
