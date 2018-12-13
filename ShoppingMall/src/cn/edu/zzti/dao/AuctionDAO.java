package cn.edu.zzti.dao;

import java.sql.SQLException;
import java.util.List;

import cn.edu.zzti.entity.AuctionDO;

//商品操作
public interface AuctionDAO extends BaseDAO {
	
	/*
	 * 该接口定义了商品基本操作的相关方法,包括获取全部商品信息.
	 * 获取指定商品信息,添加商品信息及删除指定商品信息.
	 */
	
	//从数据源中获取指定id对应的商品信息
	public AuctionDO getAuction(String id) throws SQLException;
	
	//添加一条商品信息到数据源中
	public void addAuction(AuctionDO auction) throws SQLException;
	
	//获取数据源中的全部的商品列表
	public List<AuctionDO> getAll() throws SQLException;
	
	//通过商品id删除一条商品记录
	public void deleteAuction(String id) throws SQLException;
	
	//修改数据源中指定商品信息
	public void updateAuction(AuctionDO auction) throws SQLException;
	
}
