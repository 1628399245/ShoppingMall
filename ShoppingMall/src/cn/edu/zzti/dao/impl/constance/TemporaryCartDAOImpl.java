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
	 * TemporaryCartDAO的实现:利用HashMap<String,Map<String,CartDO>>存储临时购物车中的所有商品.
	 * 其中,username作为外层HashMap的键,用于记录哪个用户使用的购物车.
	 * 而内层Map中的键代表商品号,表明购物车中存放的是哪个商品.
	 * 内层Map中的值代表该商品的数量,即用户在临时购物车中添加该商品的数量.
	 * 增加,删除,更新购物车主要是针对该内层Map作相应的增删改操作.
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
