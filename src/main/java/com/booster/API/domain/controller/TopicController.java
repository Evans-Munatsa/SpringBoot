package com.booster.API.domain.controller;

import com.booster.API.domain.Services.TopicService;
import com.booster.API.domain.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{name}")
    public Topic getTopic(@PathVariable String name) {
       return topicService.getTopic(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/add")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void upTopic(@RequestBody Topic topic, @PathVariable long id ) {
        topicService.updateTopic(id, topic);
    }


    @RequestMapping(method = RequestMethod.DELETE ,value = "/topics/{id}")
    public void deleteTopic(@PathVariable long id) {
        topicService.deleteTopic(id);
    }
}
