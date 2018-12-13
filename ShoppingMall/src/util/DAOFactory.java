package util;

import cn.edu.zzti.dao.AuctionDAO;
import cn.edu.zzti.dao.BaseDAO;
import cn.edu.zzti.dao.PersonalInfoDAO;
import cn.edu.zzti.dao.UserDAO;

public class DAOFactory {
	
	/*
	  * 使用简单工厂模式来代替关键字"new",使得每个DAO对象在内存中只存在一个,其他类之间对DAO类对象产生共享.
	  * 而DAOFactory就是创建DAO对象的工厂类,因为该类只负责产生DAO对象.
	  * 所以将BaseDAO,作为所有DAO的根基类,利用反射技术,生成DAO对象.
	 */
	
	public static final String AUCTION_DAO_CLASS_NAME = "cn.edu.zzti.dao.impl.constance.AuctionDAOImpl";
	public static final String PERSONALINFO_DAO_CLASS_NAME = "cn.edu.zzti.dao.impl.constance.PersonalInfoDAOImpl";
	public static final String USER_DAO_CLASS_NAME = "cn.edu.zzti.dao.impl.constance.UserDAOImpl";
	public static final String TEMPORARY_DAO_CLASS_NAME = "cn.edu.zzti.dao.impl.constance.TemporaryCartDAOImpl";

	private DAOFactory factory = new DAOFactory();
	private DAOFactory() {};
	private static AuctionDAO auctionDAO;
	private static PersonalInfoDAO personalDAO;
	private static UserDAO userDAO;

	public static BaseDAO getDAO(String className) {
		if(className != null && !"".equals(className)) {
			
			try {
				
				Class<? extends BaseDAO> clazz = (Class<? extends BaseDAO>) Class.forName(className);
				return clazz.newInstance();
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
				
			} catch (InstantiationException e) {
				
				e.printStackTrace();
				
			} catch (IllegalAccessException e) {
				
				e.printStackTrace();
			}
		}
		return null;
	}
	
}
