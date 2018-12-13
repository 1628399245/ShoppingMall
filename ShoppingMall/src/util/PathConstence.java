package util;

public class PathConstence {
	
	/*
	    * 为了在文件路径变化后,代码中的路径能够及时更新,并且与最新路径统一.
	    * 这里将文件中代表路径的字面值统一配置到一个类中,以常量形式存在.
	  * 
	  * JSP_MANAGE_BASE 代表简易购物商城系统的后台页面路径
	  * JSP_WEB_BASE 代表简易购物商城系统的前台页面路径
	  * M_SERVLET_BASE 代表简易购物商城系统的后台Servlet根路径
	  * W_SERVLET_BASE 代表简易购物商城系统的前台Servlet根路径
	 */
	
	public static final String JSP_MANAGE_BASE = "/jsp/manage";
	public static final String JSP_WEB_BASE = "/jsp/web";
	public static final String M_SERVLET_BASE = "/manage";
	public static final String W_SERVLET_BASE = "/web";

}
