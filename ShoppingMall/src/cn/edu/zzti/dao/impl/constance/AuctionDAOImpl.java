package cn.edu.zzti.dao.impl.constance;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.edu.zzti.dao.AuctionDAO;
import cn.edu.zzti.entity.AuctionDO;

public class AuctionDAOImpl implements AuctionDAO{
	
	private static Map <String,AuctionDO> auctionList =new HashMap<String,AuctionDO>();
	static {
		for(int i=0;i<20;i++) {
			AuctionDO auc =new AuctionDO("ÉÌÆ·"+i,"description"+i,100+(int)(Math.random()*100));
			auctionList.put(auc.getId(),auc);
		}
	}
	@Override
	public AuctionDO getAuction(String id) throws SQLException {
		// TODO Auto-generated method stub
		return auctionList.get(id);
	}
	@Override
	public void addAuction(AuctionDO auction) throws SQLException {
		// TODO Auto-generated method stub
		auctionList.put(auction.getId(), auction);
		
	}
	@Override
	public List<AuctionDO> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return new ArrayList<AuctionDO>(auctionList.values());
	}
	@Override
	public void deleteAuction(String id) throws SQLException {
		// TODO Auto-generated method stub
		auctionList.remove(id);
		
	}
	@Override
	public void updateAuction(AuctionDO auction) throws SQLException {
		// TODO Auto-generated method stub
		auctionList.put(auction.getId(), auction);
	}

}
