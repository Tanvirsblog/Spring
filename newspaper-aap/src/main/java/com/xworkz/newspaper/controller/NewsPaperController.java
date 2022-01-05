package com.xworkz.newspaper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.newspaper.aap.dto.NewsPaperDTO;
import com.xworkz.newspaper.service.NewsPaperService;

@Component
@RequestMapping("/")
public class NewsPaperController {
	
	@Autowired
	private NewsPaperService newsPaperService;

	public NewsPaperController() {
		System.out.println(this.getClass().getSimpleName() + "createdController");
	}

	@RequestMapping("/submitnewspaper.do")
	public String onSubmitClick(@ModelAttribute NewsPaperDTO NewsPaperDTO, Model model) {
		System.out.println("Invoked on SubmitClicked()");

		if (this.newsPaperService.validateNewsPaperDTO(NewsPaperDTO)) {
			boolean isSaved = this.newsPaperService.saveNewsPaperDTO(NewsPaperDTO);
			if (isSaved) {
				model.addAttribute("validationMassage", "NewsPaper details have been saved");

			} else {
				model.addAttribute("validationMassage", "Could not save  Data Try Again");
			}
		} else {
			model.addAttribute("validationMassage", "Invalid Data Try Again");
		}

		return "/Welcome.jsp";

	}
	@RequestMapping("/searchNewspaper.do")
	public String onSearchClick(@RequestParam String searchNewsPaper, Model model) {
		System.out.println("Invoked on SearchClicked()");
		
		if (this.newsPaperService.validateNewsPaperName(searchNewsPaper)) {
			NewsPaperDTO newsPaperDTO = this.newsPaperService.getNewsPaperDTO(searchNewsPaper);
			if (newsPaperDTO != null) {
				model.addAttribute("NEWSPAPERNAME",newsPaperDTO.getNewspapername());
				model.addAttribute("PRICE",newsPaperDTO.getPrice());
				model.addAttribute("LANGUAGE",newsPaperDTO.getLanguage());
				model.addAttribute("NOOFPAGES",newsPaperDTO.getNoOfPages());
				
				return "/Welcome.jsp";
			} else {
				model.addAttribute("NOTFOUND","newsPaper not found enter valid newspapername");
				return "/Welcome.jsp";
			}
		}else {
			model.addAttribute("searchvalidationMessage","Invalid newspaper,try again");
		}	return "/Welcome.jsp";
		
		}

}
