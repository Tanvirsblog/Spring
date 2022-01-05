package com.xwokrkz.newspaper.dao;

import com.xworkz.newspaper.aap.dto.NewsPaperDTO;
import com.xworkz.newspaper.entity.NewsPaperEntity;

public interface NewsPaperDAO {
	
	
	boolean saveNewsPaperEntity(NewsPaperEntity newsPaperEntity);

	NewsPaperEntity getNewsPaperEntity(String newsPaperName);
	

}
