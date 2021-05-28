package com.example.scrum.api.business;

import com.example.scrum.api.ScrumService;
import com.example.scrum.domain.ProductId;
import com.example.scrum.domain.StoryPoint;
import com.example.scrum.event.BacklogItemCreatedEvent;
import com.example.scrum.infra.EventPublisher;
import com.example.scrum.repository.BacklogItemCreatedEventRepository;
import com.example.scrum.repository.BacklogItemRepository;
import com.example.scrum.repository.ProductRepository;

public class StandardScrumService implements ScrumService {

	private  ProductRepository productRepo;
	private  BacklogItemRepository backlogItemRepo;
	private  EventPublisher<BacklogItemCreatedEvent> eventPublisher;
	private  BacklogItemCreatedEventRepository backlogItemCreatedEventRepo;
	
	public StandardScrumService() {
	}

	// Dependency Injection through setters
	public void setProductRepo(ProductRepository productRepo) {
		this.productRepo = productRepo;
	}
	
	public void setBacklogItemRepo(BacklogItemRepository backlogItemRepo) {
		this.backlogItemRepo = backlogItemRepo;
	}
	
	public void setEventPublisher(EventPublisher<BacklogItemCreatedEvent> eventPublisher) {
		this.eventPublisher = eventPublisher;
	}
	
	public void setBacklogItemCreatedEventRepo(BacklogItemCreatedEventRepository backlogItemCreatedEventRepo) {
		this.backlogItemCreatedEventRepo = backlogItemCreatedEventRepo;
	}

	@Override
	//@Transactional
	public void planProductBacklogItem(long tenantId, long productId) {
		var product = productRepo.findById(ProductId.of(productId));
		var backlogItem = product.planBacklogItem("", "", new StoryPoint());
		// Create event
		var backlogItemCreatedEvent = new BacklogItemCreatedEvent();
		backlogItemCreatedEventRepo.saveEvent(backlogItemCreatedEvent);
		// Dispatch Event
		try {
			eventPublisher.publish(backlogItemCreatedEvent);
			backlogItemCreatedEventRepo.remove(backlogItemCreatedEvent);
		} catch (Throwable e) {
			// log
		}
	
		backlogItemRepo.save(backlogItem);
	}


}
