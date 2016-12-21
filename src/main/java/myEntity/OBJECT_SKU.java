package myEntity;

import java.util.List;

public class OBJECT_SKU {

	private String sku_id;

	private String sku_name;

	private String pname;

	private String product_id;

	private List<T_MALL_ATTR_VALUE> l_attr_value;

	private List<OBJECT_ATTR_VALUE> l_attr_value_name;

	private List<T_MALL_IMAGE> l_image;

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getSku_id() {
		return sku_id;
	}

	public void setSku_id(String sku_id) {
		this.sku_id = sku_id;
	}

	public String getSku_name() {
		return sku_name;
	}

	public void setSku_name(String sku_name) {
		this.sku_name = sku_name;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<T_MALL_ATTR_VALUE> getL_attr_value() {
		return l_attr_value;
	}

	public void setL_attr_value(List<T_MALL_ATTR_VALUE> l_attr_value) {
		this.l_attr_value = l_attr_value;
	}

	public List<OBJECT_ATTR_VALUE> getL_attr_value_name() {
		return l_attr_value_name;
	}

	public void setL_attr_value_name(List<OBJECT_ATTR_VALUE> l_attr_value_name) {
		this.l_attr_value_name = l_attr_value_name;
	}

	public List<T_MALL_IMAGE> getL_image() {
		return l_image;
	}

	public void setL_image(List<T_MALL_IMAGE> l_image) {
		this.l_image = l_image;
	}

}
