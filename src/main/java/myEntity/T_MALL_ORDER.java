package myEntity;

public class T_MALL_ORDER {
	private String id;
	private String product_name;
	private double product_count;
	private String name;
	private float total_price;
	private String status;
	private String user_id;
	private String product_id;
	private String wuliu_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getProduct_count() {
		return product_count;
	}

	public void setProduct_count(double product_count) {
		this.product_count = product_count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTotal_price() {
		return total_price;
	}

	public void setTotal_price(float total_price) {
		this.total_price = total_price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getWuliu_id() {
		return wuliu_id;
	}

	public void setWuliu_id(String wuliu_id) {
		this.wuliu_id = wuliu_id;
	}

}
