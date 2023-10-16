package com.example.computer_graphic_backend.data.fractals;

import lombok.Data;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Data
public class Fractal {

    protected static final int WIDTH = 500;
    protected static final int HEIGHT = 500;
    protected BufferedImage image;

    public Fractal() {
        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    }

    public void saveFractalAsPNG(String filePath) {
        try {
            File file = new File(filePath);
            ImageIO.write(image, "png", file);
            System.out.println("Fractal saved as " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}