package com.ddup.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.ddup.dubbo.service.api.PersonService;
import com.ddup.dubbo.service.dto.req.PersonDescriptionDTO;
import com.ddup.dubbo.service.dto.resp.PersonDTO;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Override
	public PersonDTO queryPerson(PersonDescriptionDTO requestDto) {
		PersonDTO respDto = new PersonDTO();
		respDto.setAge(26);
		respDto.setName("艾伦张");
		return respDto;
	}

}
