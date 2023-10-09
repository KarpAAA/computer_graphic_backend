package com.example.computer_graphic_backend.controllers;


import com.example.computer_graphic_backend.models.NewtonRequest;
import com.example.computer_graphic_backend.models.ViscekRequest;
import com.example.computer_graphic_backend.services.FractalsServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lab1")
@CrossOrigin(origins = "http://localhost:8080")
public class LabController {
    private final FractalsServices fractalsServices;

    @PostMapping("/viscek")
    public ResponseEntity<byte[]> buildViscek(@RequestBody ViscekRequest viscekRequest){
        return ResponseEntity.ok(fractalsServices.buildViscek(viscekRequest));
    }

    @PostMapping("/newton")
    public ResponseEntity<byte[]> buildNewton(@RequestBody NewtonRequest newtonRequest){
        return ResponseEntity.ok(fractalsServices.buildNewton(newtonRequest));
    }
}
