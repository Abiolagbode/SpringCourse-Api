package com.etz.courseapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.etz.courseapi.model.Topic;

public interface TopicRepo extends CrudRepository<Topic, String> {
	
	//getAllTopic ()
	
	//giveId (String id)
	
	//updateTopic (Topic t)
	
	//DeleteTopic (String id)

}
