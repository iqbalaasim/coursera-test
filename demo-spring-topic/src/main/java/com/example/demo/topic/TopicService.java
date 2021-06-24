package com.example.demo.topic;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			
			new Topic("Hello","Aasim","Good Boy"),
			new Topic("Java","Jayant","Good Boy"),
			new Topic("C","Goutam","Good Boy"),
			new Topic("Python","Aryan","Good Boy")
			
			));
	
	public List<Topic> fill(){
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
		
	}
	
	public void addTopic(Topic topic) {
		
		topicRepository.save(topic);
		//topics.add(topi);
	}
	
	
	public void update(String id, Topic topic) {
//		for(int i=0;i<topics.size();i++) {
//			Topic t=topics.get(i);
//		if(t.getId().equals(id)) {
//			topics.set(i, topi);
		topicRepository.save(topic);
		
		
			//return;
		}
		
		
	

	public void delete(String id) {
		topicRepository.deleteById(id);
		
		
	}
	
	
	
		
	
}
