package com.example.world.service.business;

import java.util.List;

import com.example.world.domain.Country;
import com.example.world.service.WorldService;

public class StandardWorldService implements WorldService {

	@Override
	public List<Country> findRichCountries() {
		return List.of();
	}

}
