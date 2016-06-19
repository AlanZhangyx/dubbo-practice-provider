package com.ddup.dubbo.service.api;

import com.ddup.dubbo.service.dto.req.PersonDescriptionDTO;
import com.ddup.dubbo.service.dto.resp.PersonDTO;

public interface PersonService {
	
	public PersonDTO queryPerson(PersonDescriptionDTO requestDto);
	
}
