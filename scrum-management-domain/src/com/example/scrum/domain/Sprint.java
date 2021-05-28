package com.example.scrum.domain;

@Aggregate(identity="sprintId")
public class Sprint {
	private SprintId sprintId;
	private ProductId productId;
}
