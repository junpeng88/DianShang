package myMapper;

import java.util.HashMap;
import java.util.List;

import myEntity.OBJECT_SKU;
import myEntity.T_MALL_ATTR;
import myEntity.T_MALL_ATTR_VALUE;
import myEntity.T_MALL_SKU;
import myEntity.T_MALL_USER;

public interface Search_Mapper {

	public List<T_MALL_SKU> select_sku_product_by_fenlei2(String fenlei2_id);

	public List<T_MALL_ATTR> select_attr_value_by_fenlei2(String fenlei2_id);

	public List<T_MALL_SKU> select_sku_product_by_value(HashMap<Object, Object> hashMap);

	public List<String> select_valueid_by_attrid(HashMap<Object, Object> map);

	public List<OBJECT_SKU> select_object_sku(String sku_id);

}
