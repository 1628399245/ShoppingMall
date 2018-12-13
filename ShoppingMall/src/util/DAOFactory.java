package util;

import cn.edu.zzti.dao.AuctionDAO;
import cn.edu.zzti.dao.BaseDAO;
import cn.edu.zzti.dao.PersonalInfoDAO;
import cn.edu.zzti.dao.UserDAO;

public class DAOFactory {
	
	/*
	  * ʹ�ü򵥹���ģʽ������ؼ���"new",ʹ��ÿ��DAO�������ڴ���ֻ����һ��,������֮���DAO������������.
	  * ��DAOFactory���Ǵ���DAO����Ĺ�����,��Ϊ����ֻ�������DAO����.
	  * ���Խ�BaseDAO,��Ϊ����DAO�ĸ�����,���÷��似��,����DAO����.
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
