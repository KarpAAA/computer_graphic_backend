package com.example.computer_graphic_backend.data;

import java.awt.*;

public class NewtonFractal extends Fractal {
    private static final double TOLERANCE = 1e-5;
    private final int zoom;
    private final int constant;
    private final int iterations;

    public NewtonFractal(int zoom, int constant, int iterations) {
        this.zoom = zoom;
        this.constant = constant;
        this.iterations = iterations;
        calculateNewtonFractal();
    }
    private Complex function(Complex z) {

        return z.pow(4).add(new Complex(constant, 0));
    }
    private Complex functionDerivative(Complex z) {

        return z.pow(3).multiply(new Complex(4, 0));
    }
    private void calculateNewtonFractal() {

        double xMin = -2.0 / zoom;
        double xMax = 2.0 / zoom;
        double yMin = -2.0 / zoom;
        double yMax = 2.0 / zoom;

        for (int x = 0; x < WIDTH; x++) {

            for (int y = 0; y < HEIGHT; y++) {

                double real = xMin + (xMax - xMin) * x / WIDTH;
                double imaginary = yMin + (yMax - yMin) * y / HEIGHT;
                Complex z = new Complex(real, imaginary);
                int iteration = 0;

                while (iteration < iterations) {

                    Complex f = function(z);
                    Complex fPrime = functionDerivative(z);
                    if (fPrime.abs() < 1e-6) break;
                    z = z.subtract(f.divide(fPrime));

                    if (f.abs() < TOLERANCE) {
                        int color = Color.HSBtoRGB((float) iteration / iterations, 1, 1);
                        image.setRGB(x, y, color);
                        break;
                    }

                    iteration++;
                }
            }
        }
    }
    private static class Complex {
        private final double real;
        private final double imag;

        public Complex(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }

        public Complex add(Complex other) {
            return new Complex(this.real + other.real, this.imag + other.imag);
        }

        public Complex subtract(Complex other) {
            return new Complex(this.real - other.real, this.imag - other.imag);
        }

        public Complex multiply(Complex other) {
            return new Complex(this.real * other.real - this.imag * other.imag, this.real * other.imag + this.imag * other.real);
        }

        public Complex divide(Complex other) {
            double denominator = other.real * other.real + other.imag * other.imag;
            return new Complex((this.real * other.real + this.imag * other.imag) / denominator,
                    (this.imag * other.real - this.real * other.imag) / denominator);
        }

        public Complex pow(int exponent) {
            Complex result = new Complex(1, 0);
            Complex base = this;

            for (int i = 0; i < exponent; i++) {
                result = result.multiply(base);
            }

            return result;
        }
        public double abs() {
            return Math.sqrt(real * real + imag * imag);
        }
    }
}
