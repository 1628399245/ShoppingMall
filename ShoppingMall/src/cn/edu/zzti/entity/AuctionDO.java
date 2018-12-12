package cn.edu.zzti.entity;

import java.util.UUID;

public class AuctionDO {

	private String id;
	private String title;
	private String description;
	private float price;

	public AuctionDO() {
		super();
	}
	
	public AuctionDO(String title,String description,float price) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.id = UUID.randomUUID().toString();
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "AuctionDO [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price + "]";
	}
	
	
}
