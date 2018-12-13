package cn.edu.zzti.dao;

import java.util.List;

import cn.edu.zzti.entity.AuctionDO;
import cn.edu.zzti.entity.CartDO;

public interface TemporaryCartDAO extends BaseDAO{
	
	/*
	 * PersonalInfoDAO�ӿڼ̳���BaseDAO�ӿ�.
	  * �����˻�ȡ���˻�����Ϣ�����ø��˻�����Ϣ�Ȼ�������.
	 */
	
	//�����Ʒ����ʱ���ﳵ��
	public void addToCart(String username,AuctionDO auctionDO);
	
	//����ʱ���ﳵ��ɾ��һ����Ʒ��¼
	public void removeFromCart(String username,String auctionId);
	
	//����ʱ���ﳵ�н����е���Ʒ������Ϣ��ȡ����
	public List<CartDO> getAllFromCart(String username);

}
