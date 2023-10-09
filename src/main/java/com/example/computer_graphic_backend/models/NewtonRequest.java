package com.example.computer_graphic_backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewtonRequest {
    private int iterations;
    private int constant;
    private int zoom;
}
