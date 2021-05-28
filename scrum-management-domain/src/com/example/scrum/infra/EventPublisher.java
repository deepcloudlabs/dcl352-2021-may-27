package com.example.scrum.infra;

public interface EventPublisher<E> {
	public void publish(E event) throws Throwable;	
}
