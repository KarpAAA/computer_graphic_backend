package com.example.computer_graphic_backend.controllers;


import com.example.computer_graphic_backend.constants.MaterialsConstants;
import com.example.computer_graphic_backend.data.materials.Material;
import com.example.computer_graphic_backend.data.materials.TopicObject;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materials")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8080")
public class MaterialsController {
    private final MaterialsConstants materialsConstants;

    @GetMapping("/topic")
    public ResponseEntity<Material> getSubtopicInfo(
            @PathParam("topic") @NonNull String topic,
            @PathParam("subtopic") @NonNull String subtopic) {
        return ResponseEntity.ok(materialsConstants.getMaterials().stream()
                .filter(material -> material.getTopic().equals(topic) && material.getSubTopic().equals(subtopic))
                .findFirst().get());
    }

    @GetMapping()
    public ResponseEntity<?> getAllTopics() {
        List<TopicObject> topicObjects = materialsConstants
                .getMaterials()
                .stream()
                .map(m ->
                        new TopicObject(m.getTopic(),
                                materialsConstants
                                        .getMaterials()
                                        .stream()
                                        .filter(material -> material.getTopic().equals(m.getTopic()))
                                        .map(Material::getSubTopic)
                                        .toList()))
                .distinct()
                .toList();

        return ResponseEntity
                .ok()
                .body(topicObjects);
    }
}
