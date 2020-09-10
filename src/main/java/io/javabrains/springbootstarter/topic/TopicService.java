package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Java Framework", "Java Framework Description"),
			new Topic("javascript", "Javascript Framework", "Javascript Framework Description")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		for(Topic t: topics) {
			if(t.getId().equals(id))
				return t;
		}
		return null;
		
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		
		for(int i = 0; i< topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
//		for(Topic t: topics) {
//			if(t.getId().equals(id)) {
//				System.out.println("============\t"+id);
//				System.out.println(":::::::::::\t"+t.getId());
//				topics.remove(t.getId());
//			}
//		}
		
		topics.removeIf(t -> t.getId().equals(id));
		
	}
	
	
}
