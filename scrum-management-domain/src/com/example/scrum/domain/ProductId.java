package com.example.scrum.domain;

@ValueObject
public final class ProductId {
	private final long id;

	private ProductId(long id) {
		this.id = id;
	}
	
	public static ProductId of(long id) {
		return new ProductId(id);
	}

	public long getId() {
		return id;
	}
	
}
