package com.etz.courseapi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etz.courseapi.model.Topic;
import com.etz.courseapi.repository.TopicRepo;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepo topicRepo;
	
	//List of all topics methods
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll()
		.forEach(topics::add);
		return topics;
		
	}
	
	//getting a topic using an ID
	public Topic getTopic(String id) {
		return topicRepo.findById(id).get();
		}

	//Save i.e adding a topic
	public void addTopic(Topic topic) {
		topicRepo.save(topic);
		
		
	}

	//to update a topic
	public void updateTopic(String id, Topic topic) {
		topicRepo.save(topic);
		
	}

	public void deleteTopic(String id) {
		topicRepo.deleteById(id);
	}

	

}
