package cn.edu.zzti.entity;

public class CartDO {
	
	/*
	 * CartDO��ʵ�ֶԹ��ﳵ�ķ�װ,����ϵͳ����Ҫ��,���ﳵӦ�ð�����Ʒ����,��Ʒ����,�۸����Ϣ.
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
