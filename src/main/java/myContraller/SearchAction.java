package myContraller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import myEntity.MODEL_T_MALL_ATTR_VALUE;
import myEntity.OBJECT_SKU;
import myEntity.T_MALL_ATTR;
import myEntity.T_MALL_SKU;
import myEntity.T_MALL_VALUE;
import myService.SearchService;

@Controller
public class SearchAction {
	@Autowired
	SearchService searchService;

	@RequestMapping(value = "/search_product_by_fenlei2/{fenlei2_id}/{fenlei1_id}", method = RequestMethod.GET)
	public String search_product_by_fenlei2(@PathVariable String fenlei2_id, @PathVariable String fenlei1_id,
			ModelMap model) {
		model.addAttribute("fenlei2_id", fenlei2_id);
		// model.addAttribute("fenlei1_id", fenlei1_id);
		Map<Object, Object> product_by_fenlei2 = searchService.getProduct_by_fenlei2(fenlei2_id);
		model.addAttribute("lsku", (List<T_MALL_SKU>) product_by_fenlei2.get("lsku"));
		model.addAttribute("lav", (List<T_MALL_ATTR>) product_by_fenlei2.get("lav"));
		return "mall_search";
	}

	@RequestMapping(value = "/search_product_by_value", method = RequestMethod.POST)
	public String search_product_by_value(String fenlei2_id, MODEL_T_MALL_ATTR_VALUE lav, ModelMap map) {
		List<T_MALL_SKU> lsku = searchService.getProduct_by_value(fenlei2_id, lav.getLav());
		map.addAttribute("lsku", lsku);
		return "mall_product_content";
	}

	@RequestMapping(value = "/search_product_by_skuid/{sku_id}", method = RequestMethod.GET)
	public String get_object_sku(@PathVariable String sku_id, ModelMap map) {
		List<OBJECT_SKU> get_object_sku = searchService.get_object_sku(sku_id);
		return "mall_sku_detail";

	}

}
