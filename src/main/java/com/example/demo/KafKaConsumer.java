package com.example.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafKaConsumer.class);
	
	HashMap<Double,Object> userList = new HashMap<>();

	@KafkaListener(topics = "Save", groupId = "group_id")
	public void consumeSave(Object message) {
		userList.put(Math.random(), message);
		LOGGER.info(String.format("Message received -> %s", message));
	}

	@KafkaListener(topics = "FindAll", groupId = "group_id")
	public void consumeFindAll(String message) {
		LOGGER.info(String.format("Message received -> %s", message));
	}
	
	
}