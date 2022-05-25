package poly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import poly.dao.*;
import poly.entity.*;

@Controller
public class Demo {
	
	String url;
	Integer bookID;
	TaiKhoanEntity clientLogin = null;
	
	@Autowired
	private UserDAO userDAO;

	//show ten sau login
	@ModelAttribute("clientLogin")
	public TaiKhoanEntity getClient(){
		return clientLogin;
	}
	

	
	@RequestMapping(value="/loginn",method = RequestMethod.POST)
	public String handleLogin(ModelMap model,@RequestParam("username") String username,
								@RequestParam("password") String password) {
		if (username.trim().length() == 0||password.trim().length() == 0) {
			model.addAttribute("message", "Vui lòng nhập username và password!");
		}
		else {
			TaiKhoanEntity client = userDAO.findUser(username, password);	
			try {
				
				if(client==null){
					model.addAttribute("message", "Username hoặc password không chính xác, vui lòng kiểm tra lại!");	
					System.out.println("dang nhap that bai"+client);

				}
				
				if(client!=null && client.getRole()==0){
					System.out.println("Thành công"+client);
					clientLogin = client;
					model.addAttribute("clientLogin",clientLogin);
					System.out.println(clientLogin);
					return "client/index";
				
				}				
				if(client!=null && client.getRole()!=0){
					System.out.println("Thành công");
					clientLogin = client;
					model.addAttribute("clientLogin",clientLogin);
					if(url.equals("index")) {
						return "admin/admin";
					}
					if(url.equals("detail")) {
						return "redirect:/detail/"+bookID;
					}								
				}
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		return "client/login";
	}

		
}
