package cn.edu.zzti.entity;

public class CartDO {
	
	/*
	 * CartDO类实现对购物车的封装,根据系统功能要求,购物车应该包括商品名称,商品数量,价格等信息.
	 */
	
	private AuctionDO auctionDO;
	private double totlePrice;
	private int number;
	
	public AuctionDO getAuctionDO() {
		return auctionDO;
	}
	public void setAuctionDO(AuctionDO auctionDO) {
		this.auctionDO = auctionDO;
	}
	public double getTotlePrice() {
		return totlePrice;
	}
	public void setTotlePrice(double totlePrice) {
		this.totlePrice = totlePrice;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
