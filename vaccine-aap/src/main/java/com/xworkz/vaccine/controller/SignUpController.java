package com.xworkz.vaccine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.vaccine.dto.SignUpDTO;
import com.xworkz.vaccine.service.SingUpService;

@Controller
@RequestMapping("/")
public class SignUpController {

	@Autowired
	private SingUpService singupservice;

	public SignUpController() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	@RequestMapping("/Submit.do")
	public String onSubmitbuttonClicked(@RequestParam(value="params",required=false) SignUpDTO SignUpDTO, Model model) {
		System.out.println("Invoked onSubmitbuttonClicked() ");
		if (this.singupservice.validateAlltheField(SignUpDTO)) {
			String password = this.singupservice.encryptPassword();
			boolean isSaved = this.singupservice.saveSignUpDTO(SignUpDTO);
			if(isSaved) {
				model.addAttribute("validationMessage","details have been saved");
			}else {
				model.addAttribute("validationMessage","details not saved");
			}
			return "/WEB-INF/pages/Login.jsp";

		}
		return "/WEB-INF/pages/SignUp.jsp";

	}
}
