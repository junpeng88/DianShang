package myEntity;

import java.util.List;

public class T_MALL_PRODUCT {

	private String id;
	private String pname;
	private String oneid;
	private String twoid;
	private String tmid;
	private String pimage;
	private List<T_MALL_IMAGE> limg;

	public List<T_MALL_IMAGE> getLimg() {
		return limg;
	}

	public void setLimg(List<T_MALL_IMAGE> limg) {
		this.limg = limg;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getOneid() {
		return oneid;
	}

	public void setOneid(String oneid) {
		this.oneid = oneid;
	}

	public String getTwoid() {
		return twoid;
	}

	public void setTwoid(String twoid) {
		this.twoid = twoid;
	}

	public String getTmid() {
		return tmid;
	}

	public void setTmid(String tmid) {
		this.tmid = tmid;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

}
