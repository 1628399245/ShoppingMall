package cn.edu.zzti.dao;

import java.util.List;

import cn.edu.zzti.entity.AuctionDO;
import cn.edu.zzti.entity.CartDO;

public interface TemporaryCartDAO extends BaseDAO{
	
	/*
	 * PersonalInfoDAO接口继承自BaseDAO接口.
	  * 定义了获取个人基本信息和设置个人基本信息等基本方法.
	 */
	
	//添加商品到临时购物车中
	public void addToCart(String username,AuctionDO auctionDO);
	
	//从临时购物车中删除一条商品记录
	public void removeFromCart(String username,String auctionId);
	
	//从临时购物车中将所有的商品购物信息获取出来
	public List<CartDO> getAllFromCart(String username);

}
