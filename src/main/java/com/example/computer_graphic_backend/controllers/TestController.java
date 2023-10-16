package com.example.computer_graphic_backend.controllers;


import com.example.computer_graphic_backend.constants.TestsConstants;
import com.example.computer_graphic_backend.data.materials.tests.Answer;
import com.example.computer_graphic_backend.data.materials.tests.TestDTO;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8080")
public class TestController {
    private final TestsConstants testsConstants;

    @GetMapping()
    public ResponseEntity<?>  getAllTests(){
        return ResponseEntity.ok(testsConstants
                .getTestList()
                .stream()
                .map(TestDTO::new)
                .toList());
    }

    @GetMapping("/check")
    public ResponseEntity<?> checkTest(@PathParam("question") @NonNull String question,
                                         @PathParam("answer") @NonNull String answer){
        return ResponseEntity.ok(
                testsConstants
                        .getTestList()
                        .stream()
                        .filter(test -> test.getQuestion().equals(question))
                        .findFirst().get()
                        .getAnswerList()
                        .stream()
                        .filter(a -> a.getAnswer().equals(answer))
                        .map(Answer::isCorrect)
        );
    }
}
