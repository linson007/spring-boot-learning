package com.linsoft.springbootsampleapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	/*List<Topic> topics  = new ArrayList<Topic>
	(Arrays.asList(
			new Topic("java","java tut","java desc"),
			 new Topic("angular","angular tut","angular desc") 
			))
			;*/
	
	
	public List<Topic> getAlltopics()
	{
		List<Topic> topics = new ArrayList<>();
		 topicRepository.findAll().forEach(topics::add);
		 return topics;
	}

	public Topic getTopic(String id) {
		 return topicRepository.findById(id).get();
		
		//return topics.stream().filter( t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {

			topicRepository.save(topic);
			//topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		
		topicRepository.save(topic);
		/*for(int i = 0; i< topics.size(); i++)
		{
			if(topics.get(i).getId().equalsIgnoreCase(id))
			{
				topics.set(i, topic);
			}
		}*/
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		//System.out.println("id"+id);
		topicRepository.deleteById(id);;
		/*for(int i = 0; i< topics.size(); i++)
		{
			System.out.println("topics.get(i).getId()"+topics.get(i).getId());
			if(topics.get(i).getId().equalsIgnoreCase(id))
			{
				topics.remove(i);
				System.out.println("removedd..");
			}
		}*/
	}
	
	
	
	
	
}
