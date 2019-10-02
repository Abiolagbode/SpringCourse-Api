package com.etz.courseapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.etz.courseapi.model.Topic;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;

	//get all topics
	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		return topicService.getAllTopics();
		
	}
	
	//Get Once topic using an ID
	@RequestMapping("/topics/{id}")
	public Topic getOneTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	//using Post request to addTopic
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		System.out.println("Added");
	}
	
	//using Put request to addTopic
		@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
		public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
			topicService.updateTopic(id,topic);
			System.out.println("Updated");
		}
	
		//using delete request to addTopic
		@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
		public void deleteTopic(@PathVariable String id) {
			topicService.deleteTopic(id);
				}
}
