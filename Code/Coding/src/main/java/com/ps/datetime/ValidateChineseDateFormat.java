package com.ps.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import com.ps.datetime.util.FormatData_zh;

/*
 * http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8u40-b25/sun/text/resources/zh/FormatData_zh.java?av=f
 * 
 */

public class ValidateChineseDateFormat {
	public void printData(String key){
		FormatData_zh df = new FormatData_zh();
		String[] strs = df.getStringArray(key);
		SimpleDateFormat sdFormat;
		for(String item : strs){
			System.out.println("======================");
			System.out.println(key);
			System.out.println(item);
			sdFormat = new SimpleDateFormat(item);
			System.out.println(sdFormat.format(new Date()));
			System.out.println("======================");
		}
	}
	public static void main(String[] args) {
		ValidateChineseDateFormat vcdf = new ValidateChineseDateFormat();
		vcdf.printData("MonthNames");
		vcdf.printData("standalone.MonthNames");
		vcdf.printData("MonthAbbreviations");
		vcdf.printData("standalone.MonthAbbreviations");
		vcdf.printData("MonthNarrows");
		vcdf.printData("standalone.MonthNarrows");
		vcdf.printData("DayNames");
		vcdf.printData("standalone.DayNames");
		vcdf.printData("DayAbbreviations");
		vcdf.printData("standalone.DayAbbreviations");
		vcdf.printData("DayNarrows");
		vcdf.printData("standalone.DayNarrows");
		vcdf.printData("AmPmMarkers");
		vcdf.printData("Eras");
		//vcdf.printData("buddhist.Eras");
		vcdf.printData("japanese.Eras");
		vcdf.printData("TimePatterns");
		vcdf.printData("DatePatterns");
		vcdf.printData("buddhist.DatePatterns");
		vcdf.printData("japanese.DatePatterns");
		
		SimpleDateFormat sdf = new SimpleDateFormat("GGGGy\u5e74MM\u6708d\u65e5EEEE");
		System.out.println(sdf.format(new Date()));
		sdf = new SimpleDateFormat("ahh'\u65f6'mm'\u5206'ss'\u79d2' z");
		System.out.println(sdf.format(new Date()));
		
		
	}

}
