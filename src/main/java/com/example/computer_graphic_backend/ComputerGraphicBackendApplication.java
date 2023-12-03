package com.example.computer_graphic_backend;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.logging.Level.INFO;

@SpringBootApplication
public class ComputerGraphicBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputerGraphicBackendApplication.class, args);
    }

}
