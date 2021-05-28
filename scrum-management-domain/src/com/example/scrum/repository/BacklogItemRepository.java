package com.example.scrum.repository;

import com.example.scrum.domain.BacklogItem;

public interface BacklogItemRepository {
	public BacklogItem findById(long id);
	public void save(BacklogItem item);
}
