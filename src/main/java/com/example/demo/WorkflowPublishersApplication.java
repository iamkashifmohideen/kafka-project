package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WorkflowPublishersApplication {
	@Autowired
	private KafkaTemplate<String, Object> template;

	private String topicName = "Save";//Single User
	private String topicName1 = "FindAll";

//	@PostMapping("/saveData")
//	public String publishMessages(@RequestBody UserObject body) {
//		template.send(topicName, "This is the first topic " + body);
//		return "Data Saved";
//	}
	
	@GetMapping("/publish/all/{name}")
	public String publishAllMessages(@PathVariable String name) {
		template.send(topicName1, "This is the genera topic " + name);
		return "Data Published";
	}

	public static void main(String[] args) {
		SpringApplication.run(WorkflowPublishersApplication.class, args);
	}

}
