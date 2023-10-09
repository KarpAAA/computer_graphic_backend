package com.example.computer_graphic_backend.data;

import java.awt.*;

public class VicsekFractal extends Fractal {

    private int depth = 0;

    public VicsekFractal(int depth) {
        super();
        this.depth = depth;
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, WIDTH, HEIGHT);
        g2d.dispose();
        drawVicsekX(0, 0, WIDTH, HEIGHT, this.depth);
    }

    private void drawVicsekX(int x, int y, int width, int height, int depth) {

        if (depth == 0) {

            Graphics2D g2d = image.createGraphics();
            g2d.setColor(Color.BLACK);
            g2d.fillRect(x, y, width, height);
            g2d.dispose();

        } else {

            int thirdWidth = width / 3;
            int thirdHeight = height / 3;
            int twoThirdWidth = 2 * thirdWidth;
            int twoThirdHeight = 2 * thirdHeight;

            drawVicsekX(x, y, thirdWidth, thirdHeight, depth - 1); // Top-left
            drawVicsekX(x + twoThirdWidth, y, thirdWidth, thirdHeight, depth - 1); // Top-right
            drawVicsekX(x, y + twoThirdHeight, thirdWidth, thirdHeight, depth - 1); // Bottom-left
            drawVicsekX(x + twoThirdWidth, y + twoThirdHeight, thirdWidth, thirdHeight, depth - 1); // Bottom-right

            // Recursively draw the "X" pattern in the central square
            drawVicsekX(x + thirdWidth, y + thirdHeight, thirdWidth, thirdHeight, depth - 1); // Center
        }
    }
}
