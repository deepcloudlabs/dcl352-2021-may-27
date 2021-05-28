package com.example.scrum.adapter;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scrum.event.BacklogItemCreatedEvent;
import com.example.scrum.infra.EventPublisher;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EventPublisherRabbitMQAdapter implements EventPublisher<BacklogItemCreatedEvent> {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	@Autowired
	private ObjectMapper objectMapper;
	
	@Override
	public void publish(BacklogItemCreatedEvent event) throws Throwable {
		rabbitTemplate.convertAndSend("scrum-exchange", null, objectMapper.writeValueAsString(event));
	}

}
