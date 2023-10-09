package com.example.computer_graphic_backend.services;


import com.example.computer_graphic_backend.data.Fractal;
import com.example.computer_graphic_backend.data.NewtonFractal;
import com.example.computer_graphic_backend.data.VicsekFractal;
import com.example.computer_graphic_backend.models.NewtonRequest;
import com.example.computer_graphic_backend.models.ViscekRequest;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

@Service
public class FractalsServices {

    public byte[] buildViscek(ViscekRequest viscekRequest){
        Fractal fractal = new VicsekFractal(viscekRequest.getIterations());
        return convertBufferedImageToBytes(fractal.getImage());
    }

    public byte[] buildNewton(NewtonRequest newtonRequest){
        Fractal fractal =
                new NewtonFractal(newtonRequest.getZoom(),newtonRequest.getConstant(), newtonRequest.getIterations());
        return convertBufferedImageToBytes(fractal.getImage());
    }

    private byte[] convertBufferedImageToBytes(BufferedImage image) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "jpg", baos); // Замініть "jpg" на формат вашого зображення, наприклад, "png" або "gif".
            baos.flush();
            byte[] imageBytes = baos.toByteArray();
            baos.close();
            return imageBytes;
        } catch (IOException e) {
            // Обробити виняток, якщо щось пішло не так
            e.printStackTrace();
            return null; // або повернути пустий масив байтів або обробити помилку по-іншому
        }
    }
}



