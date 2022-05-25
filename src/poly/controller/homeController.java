package poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

	@RequestMapping("index")
	public String index() {
		return "client/index";
	}
	
	@RequestMapping("trangNap")
	public String trangNap() {
		return "client/trangNap";
	}
	
	@RequestMapping("LSThanhToan")
	public String LSThanhToan() {
		return "client/LSThanhToan";
	}
	
	@RequestMapping("login")
	public String login() {
		return "client/login";
	}
}
