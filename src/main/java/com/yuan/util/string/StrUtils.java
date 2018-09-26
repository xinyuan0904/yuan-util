package com.yuan.util.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

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
	
	/**
	 * map内字符进行
	 * 参数名根据ASCII码从小到大排序（字典序），用|连接
	 * @MethodName getAscString 
	 * @param jsonMap
	 * @return
	 * @author kongxy
	 * @return String
	 */
	public static String getAscString(Map<String, String> jsonMap) {
//		Collections.sort(keys);
//		LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
//		for(int i=0;i<keys.size();i++){
//			if(StringUtils.isNotEmpty(keys.get(i))){
//				map.put(keys.get(i), jsonMap.get(keys.get(i)));	
//			}
//		}
		Collection<String> keyset= jsonMap.keySet();   
		List<String> list=new ArrayList<String>(keyset);  
		Collections.sort(list);
		
		String rawString="";
		for(int i=0;i<list.size();i++){  
			if(i==(list.size()-1)){
				if(!StringUtils.isEmpty(jsonMap.get(list.get(i)))){
					rawString+=list.get(i)+"="+jsonMap.get(list.get(i));
				}
			}else{
				if(!StringUtils.isEmpty(jsonMap.get(list.get(i)))){
				rawString+=list.get(i)+"="+jsonMap.get(list.get(i))+"|";
				}
			}
		}  
		return rawString;
	}
}
