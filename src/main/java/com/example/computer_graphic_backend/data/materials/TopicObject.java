package com.example.computer_graphic_backend.data.materials;


import com.example.computer_graphic_backend.controllers.MaterialsController;
import lombok.Data;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class TopicObject extends RepresentationModel<TopicObject> {
    private String topic;
    private List<String> subtopics;


    public TopicObject(String topic, List<String> subtopics) {
        this.topic = topic;
        this.subtopics = subtopics;

        List<Link> links = subtopics
                .stream()
                .map(sub -> Link.of(MvcUriComponentsBuilder
                                .fromMethodCall(
                                        MvcUriComponentsBuilder.on(MaterialsController.class)
                                        .getSubtopicInfo(topic,sub))
                        .buildAndExpand()
                        .toUriString()).withRel(sub)
                )
                .collect(Collectors.toList());
        add(links);
    }
}
