package poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class nhanController {

	@RequestMapping("nhan")
	public String index() {
		return "client/thongKe";
	}
}
