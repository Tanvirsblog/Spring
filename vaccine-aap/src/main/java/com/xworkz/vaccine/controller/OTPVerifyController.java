package com.xworkz.vaccine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.vaccine.service.RegisterService;

@Controller
@RequestMapping("/")
public class OTPVerifyController {
	@Autowired
	private RegisterService registerService;

	public OTPVerifyController() {
		System.out.println(this.getClass().getSimpleName() + "createdController");
	}

	@RequestMapping("/Proceed.do")
	public String onProccedClicked(@RequestParam int otp, Model model) {
		System.out.println("Invoked onProccedClicked()");
		boolean result = this.registerService.verifyOTP(otp, RegisterController.email);
		if (result) {
			model.addAttribute("msg", "otp is matched");
			return "/WEB-INF/pages/SignUp.jsp";
		} else {
			model.addAttribute("msg", "otp is not matched");
			return "/WEB-INF/pages/VerifyOTP.jsp";
		}

	}

	@RequestMapping("/resendOTP.do")
	public String resendOTP() {
		System.out.println("Invoked resendOTP()");
		int otp = this.registerService.getOTP();

			boolean isOTPSent = this.registerService.sendOTP(RegisterController.email, otp);
			   int newotp = otp;
			boolean isupdateOTP =this.registerService.updateOTPByEmail(RegisterController.email, newotp);

				System.out.println("table updated");
				return "/WEB-INF/pages/VerifyOTP.jsp";
	}
}