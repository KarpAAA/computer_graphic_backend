package com.example.computer_graphic_backend.data.materials;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Material {
    private String topic;
    private String subTopic;
    private String text;
    private byte[] image;
}
