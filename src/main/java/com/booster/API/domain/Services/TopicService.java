package com.booster.API.domain.Services;

import com.booster.API.domain.models.Topic;
import org.springframework.stereotype.Service;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic((long) 1, "Spring Framework", "Spring framework"),
            new Topic( (long) 2, "Spring Framework2", "Spring framework2"),
            new Topic( (long) 3, "Spring Framework3", "Spring framework3"),
            new Topic( (long) 4, "Spring Framework4", "Spring framework4")
            ));

    public List<Topic> getAllTopics(){
        return  topics;
    }

    public Topic getTopic(String name){
        return topics.stream().filter(t -> t.getName().equals(name)).findFirst().get();
    }


    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(long id, Topic topic) {
        for (int i = 0; i < topics.size(); i++){
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(long id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
