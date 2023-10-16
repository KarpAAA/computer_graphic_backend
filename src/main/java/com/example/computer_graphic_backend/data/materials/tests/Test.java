package com.example.computer_graphic_backend.data.materials.tests;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Test {
    private String question;
    private List<Answer> answerList;
}
