package org.springBootApp.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<topics> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public topics getTopic(@PathVariable int id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/topics")
	public void addTopic(@RequestBody topics topic) {
		topicService.add(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/topics/{id}")
	public void updateTopic(@RequestBody topics topic,@PathVariable int id) {
		topicService.update(topic, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void delete(@PathVariable int id) {
		topicService.delete(id);
	}

}
