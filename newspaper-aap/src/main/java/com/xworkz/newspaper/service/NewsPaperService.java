package com.xworkz.newspaper.service;

import com.xworkz.newspaper.aap.dto.NewsPaperDTO;

public interface NewsPaperService {

	boolean validateNewsPaperDTO(NewsPaperDTO newsPaperDTO);

	boolean saveNewsPaperDTO(NewsPaperDTO newsPaperDTO);

	boolean validateNewsPaperName(String searchNewsPaper);

	NewsPaperDTO getNewsPaperDTO(String searchNewsPaper);
}
