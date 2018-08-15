package org.baiHoo.db.formatUtils;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatUtils {
	public static final String formatDate(Long time){
		if(time==null) return "";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(new Date(time));
	}
	public static final String formatTime(Long time){
		if(time==null) return "";
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		return dateFormat.format(new Date(time));
	}
	public static final String formatDatatime(Long time){
		if(time==null) return "";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(new Date(time));
	}
	
	public static final Long parseDate(String dateCharacter){
		if(dateCharacter==null) return 0l;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = dateFormat.parse(dateCharacter);
			return date.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static final Date formatDate(String dateCharacter){
		try {
			if(dateCharacter==null) return new Date();
			DateFormat dateFormat =null ;
			Date date;
			Pattern pattern = Pattern.compile("(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)");   
			Matcher matcher = pattern.matcher(dateCharacter);
			if(matcher.find()) {
				 dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			}else {
				pattern = Pattern.compile("(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})/(((0[13578]|1[02])/(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)/(0[1-9]|[12][0-9]|30))|(02/(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))/02/29)"); 
				 matcher = pattern.matcher(dateCharacter);
				 if(matcher.find()) {
						dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				 }
			}
			if(dateFormat !=null) {
				date = dateFormat.parse(dateCharacter);
				return date;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Date();
	}
	public static  final String  formatMoney(Double price){
		if(price ==null)
			return  "非法格式";
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(price);
	}
}
