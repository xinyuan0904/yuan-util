package com.yuan.util.string;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 * @ClassName StrUtils
 * @author kongxy
 * @date 2018年8月23日
 * @version 1.0
 */
public class StrUtils {

	/**
	 * 首字母转为大写
	 * @MethodName firstCapital 
	 * @param str
	 * @author kongxy
	 * @return void
	 */
	public static String firstCapital(String str){
		if(StringUtils.isEmpty(str)){
			return str;
		}
		str = str.trim();
		return str.substring(0,1).toUpperCase()+str.substring(1);
	}
	
	public static void main(String[] args) {
		System.out.println("|"+firstCapital("  s "));
	}
}
