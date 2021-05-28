package com.example.scrum.domain;

import java.util.Set;

// Ubiqiutious Language
// Rules: i) Design Small Aggregates ii) @Transactional method change at most 1 aggregate
@Aggregate(identity = "productId")
public class Product {
	private ProductId productId;
	private TenantId tenantId;
	/* Old version
	private Set<Sprint> sprints;
	private Set<Release> releases;
	private Set<BacklogItem> backlogItems;
	*/
	private ProductInfo info;

	public BacklogItem planBacklogItem(String summary,String category,StoryPoint storyPoint) {
		return new BacklogItem();
	}
	public Release scheduleRelease(String name,String description) {
		return new Release();
	}
	public Sprint scheduleSprint(String name,String goal) {
		return new Sprint();
	}
	
}
