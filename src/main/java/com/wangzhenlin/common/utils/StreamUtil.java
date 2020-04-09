package com.wangzhenlin.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 流处理工具类
 * @author Administrator
 *
 */  
public class StreamUtil {

	public static List<String> read(InputStream inputStream) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(inputStream));
		List<String> list = new ArrayList<String>();
		String str = "";
		while((str=read.readLine())!=null){
			list.add(str);
		}
		return list;
	}
	
}
