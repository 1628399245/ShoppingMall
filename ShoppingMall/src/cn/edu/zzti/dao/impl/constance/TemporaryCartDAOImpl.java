package cn.edu.zzti.dao.impl.constance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.edu.zzti.dao.TemporaryCartDAO;
import cn.edu.zzti.entity.AuctionDO;
import cn.edu.zzti.entity.CartDO;

public class TemporaryCartDAOImpl implements TemporaryCartDAO {
	
	/*
	 * TemporaryCartDAO��ʵ��:����HashMap<String,Map<String,CartDO>>�洢��ʱ���ﳵ�е�������Ʒ.
	 * ����,username��Ϊ���HashMap�ļ�,���ڼ�¼�ĸ��û�ʹ�õĹ��ﳵ.
	 * ���ڲ�Map�еļ�������Ʒ��,�������ﳵ�д�ŵ����ĸ���Ʒ.
	 * �ڲ�Map�е�ֵ�������Ʒ������,���û�����ʱ���ﳵ����Ӹ���Ʒ������.
	 * ����,ɾ��,���¹��ﳵ��Ҫ����Ը��ڲ�Map����Ӧ����ɾ�Ĳ���.
	 */
	
	private static Map<String,Map<String,CartDO>> cartList = new HashMap<String,Map<String,CartDO>>();

	@Override
	public void addToCart(String username, AuctionDO auctionDO) {
		
		Map<String,CartDO> userCart = cartList.get(username);
		if(userCart == null) {
			userCart = new HashMap<String,CartDO>();
			cartList.put(username, userCart);
		}
		if(!userCart.containsKey(auctionDO.getId())) {
			userCart.put(auctionDO.getId(), new CartDO());
		}
		CartDO cart = userCart.get(auctionDO.getId());
		cart.setAuctionDO(auctionDO);
		cart.setNumber(cart.getNumber()+1);
		cart.setTotlePrice(cart.getTotlePrice()+auctionDO.getPrice());
		
	}

	@Override
	public void removeFromCart(String username, String auctionId) {
		
		Map<String,CartDO> userCart = cartList.get(username);
		if(userCart != null) {
			userCart.remove(auctionId);
		}
		
	}

	@Override
	public List<CartDO> getAllFromCart(String username) {
		
		List<CartDO> list = new ArrayList<CartDO>();
		Map<String,CartDO> userCart = cartList.get(username);
		
		if(userCart != null) {
			list = new ArrayList<CartDO>(userCart.values());
		}
		return list;

	}

}
