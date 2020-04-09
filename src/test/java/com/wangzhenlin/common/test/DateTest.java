package com.wangzhenlin.common.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.wangzhenlin.common.utils.DateUtil;

/**
 * 测试日期
 * @author Administrator
 *
 */
public class DateTest {

	public void testGetAge() {
		Calendar c = Calendar.getInstance();
		c.set(2000, 11, 11);
		int i = DateUtil.getAget(c.getTime());
		System.out.println(i);
	}
	
	public void testGetMonrhEnd() {
		Calendar c = Calendar.getInstance();
		c.set(2005, 11, 11);
		Date init = DateUtil.getMonthEnd(c.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(init));
	}  
	
	public void testGetMonthlnit() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 11, 11);
		Date init = DateUtil.getMonthEnd(c.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(init));
	}
	
}
