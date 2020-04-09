package com.wangzhenlin.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 * @author Administrator
 *
 */
public class DateUtil {

	private static Date date;

	public static int getAget(Date birthday){
		
		//获取当前系统日期
		Calendar c = Calendar.getInstance();
		int yearNow = c.get(Calendar.YEAR);
		int monthNow = c.get(Calendar.MONDAY);
		int dateNow = c.get(Calendar.DAY_OF_MONTH);
		c.setTime(birthday);
		int yeaBirth = c.get(Calendar.YEAR);
		int mothBrith = c.get(Calendar.MONDAY);
		int dateBrith = c.get(Calendar.DAY_OF_MONTH);
		//年龄
		int age = yearNow-yeaBirth;
		//出生月份
		if (mothBrith>monthNow) {
			age--;
		}
		//年龄减
		if (mothBrith == monthNow && dateBrith > dateNow) {
			age--;
		}
		return age;
	}
	
	/**
	 * 返回指定月份
	 * @param date
	 * @return
	 */
	public static Date getMonthEnd(Date date) {
		Calendar c = Calendar.getInstance();
		//传入日期初始化
		c.setTime(date);
		//月份加一
		c.add(Calendar.MONTH, 1);
		Date init = getMonthEnd(c.getTime());
		c.setTime(init);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	
	/**
	 * 返回指定月份时间
	 * @return
	 */
	public static Date getMonthlnit(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	
	/**
	 * 
	 * @param minDate
	 * @param maxDate
	 * @return
	 */
	public static Date random(Date minDate,Date maxDate) {
		long t1 = minDate.getTime();
		long t2 = maxDate.getTime();
		long t3 = (long) (Math.random()*(t2-t1+t1)+t1);
		return new Date(3);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			Date date = DateUtil.random(new Date(900000000), new Date());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(sdf.format(date));
		}
	}
	
}
