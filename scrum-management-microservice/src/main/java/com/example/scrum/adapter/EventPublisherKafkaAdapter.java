package com.example.scrum.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.scrum.event.BacklogItemCreatedEvent;
import com.example.scrum.infra.EventPublisher;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EventPublisherKafkaAdapter implements EventPublisher<BacklogItemCreatedEvent> {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	@Autowired
	private ObjectMapper objectMapper;
	
	@Override
	public void publish(BacklogItemCreatedEvent event) throws Throwable {
		kafkaTemplate.send("scrum", objectMapper.writeValueAsString(event));
	}

}
