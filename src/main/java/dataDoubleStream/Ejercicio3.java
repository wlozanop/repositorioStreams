package dataDoubleStream;

import com.github.javafaker.Faker;
import utilities.Utiles;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var n = new Faker().number().numberBetween(400, 500);
        final var array = Utiles.generarArrayDoubleAletario(n, 1000, 2000);

        System.out.printf("Números generados: %s%n", Arrays.toString(array));

        final var arraySuma = Arrays
                .stream(array)
                .sum();

        System.out.printf("Suma total: %s%n", arraySuma);
    }
}
