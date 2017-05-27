package com.ps.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTimeFormat {
	/**
     * All Dates are normalized to UTC, it is up the client code to convert to the appropriate TimeZone.
     */
	private TimeZone UTC;
	/**
     * @see <a href="http://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations">Combined Date and Time Representations</a>
     */
	private String ISO_8601_24H_FULL_FORMAT;
	/**
     * 0001-01-01T00:00:00.000Z
     */
	private Date BEGINNING_OF_TIME;
	/**
	 * 292278994-08-17T07:12:55.807Z
	 */
	private Date END_OF_TIME;
	public DateTimeFormat(){		
		this.ISO_8601_24H_FULL_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
		this.UTC = TimeZone.getTimeZone("UTC");
	    TimeZone.setDefault(UTC);
	    final Calendar c = new GregorianCalendar(UTC);
        c.set(1, 0, 1, 0, 0, 0);
        c.set(Calendar.MILLISECOND, 0);
        BEGINNING_OF_TIME = c.getTime();
        c.setTime(new Date(Long.MAX_VALUE));
        END_OF_TIME = c.getTime();
	}
	public void printDateFormats() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(this.ISO_8601_24H_FULL_FORMAT);
		sdf.setTimeZone(this.UTC);
		System.out.println("sdf.format(BEGINNING_OF_TIME) = " + sdf.format(BEGINNING_OF_TIME));
		System.out.println("sdf.format(END_OF_TIME) = " + sdf.format(END_OF_TIME));
        System.out.println("sdf.format(new Date()) = " + sdf.format(new Date()));
        System.out.println("sdf.parse(\"2015-04-28T14:23:38.521Z\") = " + sdf.parse("2015-04-28T14:23:38.521Z"));
        System.out.println("sdf.parse(\"0001-01-01T00:00:00.000Z\") = " + sdf.parse("0001-01-01T00:00:00.000Z"));
        System.out.println("sdf.parse(\"292278994-08-17T07:12:55.807Z\") = " + sdf.parse("292278994-08-17T07:12:55.807Z"));
	}
    public static void main(String[] args) throws Exception
    {
    	DateTimeFormat dt = new DateTimeFormat();
    	dt.printDateFormats();
    	Instant instant = Instant.parse( "2010-10-02T12:23:23Z" ); 
    	Date date = java.util.Date.from( instant );
    	System.out.println(date);
    }
}