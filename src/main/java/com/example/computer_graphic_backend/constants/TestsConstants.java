package com.example.computer_graphic_backend.constants;


import com.example.computer_graphic_backend.data.materials.tests.Answer;
import com.example.computer_graphic_backend.data.materials.tests.Test;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class TestsConstants {
    private List<Test> testList = new ArrayList<>();
    @PostConstruct
    public void postConstruct(){
        testList.add(new Test("TestQuestion1",
                List.of(new Answer("A1",false),
                        new Answer("A2",false),
                        new Answer("A3",false),
                        new Answer("A4",true))));

        testList.add(new Test("TestQuestion2",
                List.of(new Answer("A1",false),
                        new Answer("A2",false),
                        new Answer("A3",false),
                        new Answer("A4",true))));

        testList.add(new Test("TestQuestion3",
                List.of(new Answer("A1",false),
                        new Answer("A2",false),
                        new Answer("A3",false),
                        new Answer("A4",true))));

        testList.add(new Test("TestQuestion4",
                List.of(new Answer("A1",false),
                        new Answer("A2",false),
                        new Answer("A3",false),
                        new Answer("A4",true))));

    }
}


