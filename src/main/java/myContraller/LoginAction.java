package myContraller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import myEntity.T_MALL_ATTR;
import myEntity.T_MALL_SKU;
import myEntity.T_MALL_USER;
import myService.LoginService;

@Controller
public class LoginAction {

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/to_login.action", method = RequestMethod.GET)
	public String to_login() {
		// 此处可以做session数量判断，完成网站人数上限功能
		return "login";

	}

	@RequestMapping(value = "/login.action", method = RequestMethod.POST)
	public String login(T_MALL_USER user, HttpSession httpSession, ModelMap model) {
		T_MALL_USER login = loginService.login(user);
		if (login == null) {
			String err = "用户名或者密码错误";
			model.addAttribute("err", err);
			return "login";
		} else {
			httpSession.setAttribute("user", login);
			return "redirect:/index.jsp";
		}

	}

}
