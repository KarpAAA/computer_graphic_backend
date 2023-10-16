package com.example.computer_graphic_backend.constants;


import com.example.computer_graphic_backend.data.materials.Material;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class MaterialsConstants {
    private List<Material> materials = new ArrayList<>();


    @PostConstruct
    public void postConstructMethod(){

        materials.add(new Material("Introduction", "SubInto1", "text1", new byte[]{}));
        materials.add(new Material("Introduction", "SubInto2", "text2", new byte[]{}));
        materials.add(new Material("Introduction", "SubInto3", "text3", new byte[]{}));

        materials.add(new Material("Fractals", "SubInto1", "text1", new byte[]{}));
        materials.add(new Material("Fractals", "SubInto2", "text2", new byte[]{}));
        materials.add(new Material("Fractals", "SubInto3", "text3", new byte[]{}));

        materials.add(new Material("ColorScheme", "SubInto1", "text1", new byte[]{}));
        materials.add(new Material("ColorScheme", "SubInto2", "text2", new byte[]{}));
        materials.add(new Material("ColorScheme", "SubInto3", "text3", new byte[]{}));

        materials.add(new Material("MovingImages", "SubInto1", "text1", new byte[]{}));
        materials.add(new Material("MovingImages", "SubInto2", "text2", new byte[]{}));
        materials.add(new Material("MovingImages", "SubInto3", "text3", new byte[]{}));

    }
}
