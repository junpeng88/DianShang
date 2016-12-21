package myEntity;

import java.util.Date;

public class T_MALL_ATTR_VALUE {
	private String id;
	private String attr_id;
	private String value_id;
	private String product_id;
	private String is_sku;
	private Date create_time;
	private String sku_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttr_id() {
		return attr_id;
	}

	public void setAttr_id(String attr_id) {
		this.attr_id = attr_id;
	}

	public String getValue_id() {
		return value_id;
	}

	public void setValue_id(String value_id) {
		this.value_id = value_id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getIs_sku() {
		return is_sku;
	}

	public void setIs_sku(String is_sku) {
		this.is_sku = is_sku;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getSku_id() {
		return sku_id;
	}

	public void setSku_id(String sku_id) {
		this.sku_id = sku_id;
	}

}
