package myService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myEntity.OBJECT_SKU;
import myEntity.T_MALL_ATTR;
import myEntity.T_MALL_ATTR_VALUE;
import myEntity.T_MALL_SKU;
import myEntity.T_MALL_VALUE;
import myMapper.Search_Mapper;

@Service
public class SearchService {
	@Autowired
	Search_Mapper search_Mapper;

	/***
	 * 二级分类检索
	 * 
	 * @param fenlei2_id
	 * @return
	 */
	public Map<Object, Object> getProduct_by_fenlei2(String fenlei2_id) {
		List<T_MALL_SKU> lsku = search_Mapper.select_sku_product_by_fenlei2(fenlei2_id);
		List<T_MALL_ATTR> lav = search_Mapper.select_attr_value_by_fenlei2(fenlei2_id);
		HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
		hashMap.put("lsku", lsku);
		hashMap.put("lav", lav);
		return hashMap;
	}

	/***
	 * 按二级分类的下属具体属性值进行分类属性检索
	 * 
	 * @param fenlei2_id
	 * @param lav
	 * @return
	 */
	public List<T_MALL_SKU> getProduct_by_value(String fenlei2_id, List<T_MALL_ATTR_VALUE> lav) {

		// 按分类属性值选择后，剩余属性值进行检索
		HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
		hashMap.put("fenlei2_id", fenlei2_id);

		StringBuffer sql = new StringBuffer();

		if (null != lav) {
			// 拼装符合筛选条件的sku的sql
			sql.append("and b.id in ( select sku_0.sku_id from ");
			for (int i = 0; i < lav.size(); i++) {
				sql.append("(select sku_id from t_mall_attr_value where attr_id =" + lav.get(i).getAttr_id()
						+ " and value_id=" + lav.get(i).getValue_id() + ") sku_" + i);
				if (lav.size() > 1 && i < (lav.size() - 1)) {
					sql.append(" , ");
				}
			}
			if (lav.size() > 1) {
				sql.append(" where ");
			}
			for (int i = 0; i < lav.size(); i++) {
				if (lav.size() > 1 && i > 0) {
					sql.append("sku_" + i + ".sku_id=sku_" + (i - 1) + ".sku_id");
				}
				if (i < (lav.size() - 1) && i > 0) {
					sql.append(" and ");
				}
			}
			sql.append(")");
			hashMap.put("sql", sql.toString());
		} else {
			hashMap.put("sql", "");
		}

		// 调用mapper，传入拼装的sql
		List<T_MALL_SKU> lsku = search_Mapper.select_sku_product_by_value(hashMap);
		return lsku;
	}

	public List<OBJECT_SKU> get_object_sku(String sku_id) {
		List<OBJECT_SKU> select_object_sku = search_Mapper.select_object_sku(sku_id);

		return select_object_sku;
	}
}
