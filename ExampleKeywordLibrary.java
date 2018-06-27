package com.mycompany.app;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class ExampleKeywordLibrary {
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";
	
	public String verifyImport() {
		String joku = "Hello World!";
		return joku;
	}
	
	public int getTimestamp(){
		return (int) (System.currentTimeMillis() / 1000L);
	}
	
	public String getSystemTimezone() {
		return (String) (System.getProperty("user.timezone"));
	}
	
	public String getLongTime(String separator) {
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH"+separator+"mm"+separator+"ss");
        return (String) (sdf.format(cal.getTime()));
	}
	
	public String getShortTime(String separator) {
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH"+separator+"mm");
        return (String) (sdf.format(cal.getTime()));
	}
	
	public String getLongDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return (String) (dateFormat.format(date));
	}
	
	public String getShortDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		return (String) (dateFormat.format(date));
	}
	
	public String getDateByLocale() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
		String formatted = dateFormat.format("27/6/2018");
		return formatted;
	}
}