package util;

public class StringUtil {
	
	/*
	 * StringUtil类,来提供字符串判断空的静态方法供其他类使用.
	 */
	
	public static boolean isEmpty(String str) {
		
		if("".equals(str)||str == null) {
			return true;
		}
		return false;
	}

}
