package org.springBootApp.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<topics> l;
	
	public TopicService() {
		l = new ArrayList<>();
		l.add(new topics(1,"Data Structures","Anurag Singh"));
		l.add(new topics(2,"Algorithms","Robin Singh"));
		l.add(new topics(3,"Object Oriented","Akash Singh"));
	}
	
	public List<topics> getAllTopics() {
		return this.l;
	}
	
	public topics getTopic(int id) {
		for (topics i : l) {
			if(i.getId() == id) {
				return i;
			}
		}
		
		topics i = new topics(-1, "Not found" , "No one");
		return i;
	}

	public void add(topics topic) {
		// TODO Auto-generated method stub
		l.add(topic);
	}
	
	public void update(topics topic , int id) {
		for(topics i : l) {
			if(i.getId() == id) {
				i.setSubject(topic.getSubject());
				i.setTeacher(topic.getTeacher());
				return;
			}
		}
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		for(topics i : l) {
			if(i.getId() == id) {
				l.remove(i);
				return;
			}
		}
	}

}
