package myService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import myEntity.T_MALL_ATTR;
import myEntity.T_MALL_SKU;
import myEntity.T_MALL_USER;
import myMapper.Login_Mapper;

@Service
public class LoginService {

	@Autowired
	Login_Mapper login_Mapper;

	public T_MALL_USER login(T_MALL_USER user) {
		T_MALL_USER select_user = login_Mapper.select_user(user);
		return select_user;
	}

}
