package com.example.computer_graphic_backend.data.materials.tests;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TestDTO {
    private String question;
    private List<AnswerDTO> answerList;

    public TestDTO(Test test) {
        this.question = test.getQuestion();

        this.answerList  = test.getAnswerList()
                .stream()
                .map(a -> new AnswerDTO(a.getAnswer()))
                .toList();
    }
}
