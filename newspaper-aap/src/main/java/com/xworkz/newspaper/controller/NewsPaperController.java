package com.xworkz.newspaper.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.newspaper.aap.dto.NewsPaperDTO;

@Component
@RequestMapping("/")
public class NewsPaperController {

	public NewsPaperController() {
		System.out.println(this.getClass().getSimpleName() + "createdController");
	}
	@RequestMapping("/submitnewspaper.do")
	public String onSubmitClick(NewsPaperDTO NewsPaperDTO,Model model) {
		
		
		model.addAttribute("NAME",NewsPaperDTO.getNewspapername() );
		model.addAttribute("PRICE",NewsPaperDTO.getPrice() );
		model.addAttribute("LANGUAGE",NewsPaperDTO.getLanguage() );
		model.addAttribute("NOOFPAGES",NewsPaperDTO.getNoOfPages() );
		
		return "/WEB-INF/Pages/NewsPaperDetails.jsp";
	}
	
}
