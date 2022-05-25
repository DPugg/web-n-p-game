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
public class userController {
	
	@Autowired
	private UserDAO userDAO;

	TheNapEntity napThe = null;
	
	@ModelAttribute("napThe")
	public TheNapEntity getCard(){
		return napThe;
	}

	
	@RequestMapping(value="/nap",method = RequestMethod.POST)
	public String handleNap(ModelMap model,
							@RequestParam(required=false, defaultValue ="cardCode") String cardCode) {
		if (cardCode.trim().length() == 0) {
			model.addAttribute("message", "nhan du thong tin");
			System.out.println(cardCode);
		}
		else {
			TheNapEntity nap = userDAO.findCard(cardCode);	
			try {
				
				if(nap==null){
					model.addAttribute("message", "mã thẻ không đúng!");		
					System.out.println(cardCode);
				}
				
				else{
					System.out.println("Thành công");
					System.out.println(cardCode+" "+nap.getMucGia());
					if(nap.getMucGia()==20000) {
						model.addAttribute("tienAo", "40");		
					}
					if(nap.getMucGia()==50000) {
						model.addAttribute("tienAo", "100");		
					}
					if(nap.getMucGia()==100000) {
						model.addAttribute("tienAo", "210");		
					}
					if(nap.getMucGia()==200000) {
						model.addAttribute("tienAo", "420");		
					}
					if(nap.getMucGia()==500000) {
						model.addAttribute("tienAo", "1100");		
					}
					
					
					
					//hien thi thong tin the
					//xoa the do khoi DB
					napThe = nap;
					model.addAttribute("napThe",napThe);
					
					return "client/trangNap";
				}										
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		return "client/trangNap";
	}
		
}
