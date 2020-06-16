package com.linsoft.springbootsampleapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics  = new ArrayList<Topic>
	(Arrays.asList(
			new Topic("java","java tut","java desc"),
			 new Topic("angular","angular tut","angular desc") 
			))
			;
	
	
	public List<Topic> getAlltopics()
	{
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter( t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {

			topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		
		for(int i = 0; i< topics.size(); i++)
		{
			if(topics.get(i).getId().equalsIgnoreCase(id))
			{
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		System.out.println("id"+id);
		for(int i = 0; i< topics.size(); i++)
		{
			System.out.println("topics.get(i).getId()"+topics.get(i).getId());
			if(topics.get(i).getId().equalsIgnoreCase(id))
			{
				topics.remove(i);
				System.out.println("removedd..");
			}
		}
	}
	
	
	
	
	
}
