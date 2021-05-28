package com.example.scrum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.example.scrum.adapter.ScrumAdapterService;
import com.example.scrum.dto.request.AddBacklogItemRequest;
import com.example.scrum.dto.response.AddBacklogItemResponse;

@RestController
@RequestScope
@RequestMapping("/products")
public class ScrumController {
	@Autowired
	private ScrumAdapterService adapterService;
	
	@PostMapping("/{productId}/backlogitems")
	public AddBacklogItemResponse addItem(@RequestBody AddBacklogItemRequest request) {
		return adapterService.addBacklogItem(request);
	}
}
