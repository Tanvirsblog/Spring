package com.xworkz.newspaper.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xwokrkz.newspaper.dao.NewsPaperDAO;
import com.xworkz.newspaper.aap.dto.NewsPaperDTO;
import com.xworkz.newspaper.entity.NewsPaperEntity;

@Component
public class NewsPaperServiceImpl implements NewsPaperService {
	@Autowired
	private NewsPaperDAO newsPaperDAO;

	public NewsPaperServiceImpl() {
		System.out.println("Service layer is create" + this.getClass().getSimpleName());

	}

	public boolean validateNewsPaperDTO(NewsPaperDTO newsPaperDTO) {
		System.out.println("Invoked validateNewsPaperDTO()");
		boolean flag = false;

		if (newsPaperDTO.getNewspapername() != null && !newsPaperDTO.getNewspapername().isEmpty()) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Invalid NewsPaperName");
			return flag;
		}
		if (newsPaperDTO.getLanguage() != null && !newsPaperDTO.getLanguage().isEmpty()) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Invalid Language");
			return flag;
		}
		if (newsPaperDTO.getPrice() > 0) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Invalid Price");
			return flag;
		}
		if (newsPaperDTO.getNoOfPages() > 0) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Invalid No Of Pages");
			return flag;
		}
		return flag;
	}

	public boolean saveNewsPaperDTO(NewsPaperDTO newsPaperDTO) {
		NewsPaperEntity newsPaperEntity = new NewsPaperEntity();
		BeanUtils.copyProperties(newsPaperDTO, newsPaperEntity);
		boolean result = this.newsPaperDAO.saveNewsPaperEntity(newsPaperEntity);
		return result;
	}

	public NewsPaperDTO getNewsPaperDTO(String newsPaperName) {
		System.out.println("Invoked getNewsPaperDTO()");
		NewsPaperEntity entity = this.newsPaperDAO.getNewsPaperEntity(newsPaperName);
		NewsPaperDTO dto = new NewsPaperDTO();
		BeanUtils.copyProperties(entity, dto);
		return dto;

	}

	public boolean validateNewsPaperName(String searchNewsPaper) {
		System.out.println("Invoked validateNewsPaperName()");
		boolean flag = false;

		if (!searchNewsPaper.isEmpty() && searchNewsPaper != null) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Invalid NewsPaperName");
			return flag;
		}

		return false;
	}
}
