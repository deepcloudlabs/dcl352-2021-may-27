package com.example.scrum.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.scrum.api.ScrumService;
import com.example.scrum.dto.request.AddBacklogItemRequest;
import com.example.scrum.dto.response.AddBacklogItemResponse;

@Service
public class ScrumAdapterService {

	@Autowired
	private ScrumService scrumService;
	
	@Transactional
	public AddBacklogItemResponse addBacklogItem(AddBacklogItemRequest request) {
		scrumService.planProductBacklogItem(0, 0);
		return new AddBacklogItemResponse();
	}

}
