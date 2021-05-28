package com.example.scrum.repository;

import com.example.scrum.event.BacklogItemCreatedEvent;

public interface BacklogItemCreatedEventRepository {
	public void saveEvent(BacklogItemCreatedEvent event);

	public void remove(BacklogItemCreatedEvent backlogItemCreatedEvent);
}
