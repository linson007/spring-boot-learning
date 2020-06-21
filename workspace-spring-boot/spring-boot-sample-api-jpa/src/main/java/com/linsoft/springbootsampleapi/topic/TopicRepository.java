package com.linsoft.springbootsampleapi.topic;

import org.springframework.data.repository.CrudRepository;
														//Entity Generic , Primary key Generic
public interface TopicRepository extends CrudRepository<Topic, String >{

	//getAllTopics()
	//getTopc(Sting id)
	//UpdateTopic(Topic)
	//deletTopic(String id)
	
	
}
