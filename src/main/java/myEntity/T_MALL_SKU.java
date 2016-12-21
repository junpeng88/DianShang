package myEntity;

import java.util.Date;

public class T_MALL_SKU {

	private String id;
	private String sku_name;
	private String product_id;
	private int kucun;
	private float price;
	private Date create_time;
	T_MALL_PRODUCT product;

	public T_MALL_PRODUCT getProduct() {
		return product;
	}

	public void setProduct(T_MALL_PRODUCT product) {
		this.product = product;
	}

	public String getSku_name() {
		return sku_name;
	}

	public void setSku_name(String sku_name) {
		this.sku_name = sku_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public int getKucun() {
		return kucun;
	}

	public void setKucun(int kucun) {
		this.kucun = kucun;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

}
