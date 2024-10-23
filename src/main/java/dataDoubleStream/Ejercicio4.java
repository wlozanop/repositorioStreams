package dataDoubleStream;

import Utilities.Utiles;
import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var n = new Faker().number().numberBetween(400, 500);
        final var array = Utiles.generarArrayDoubleAletario(n, 1000, 1500);

        System.out.printf("números generados: %s%n", Arrays.toString(array));

        final var arrayOrdenado = Arrays
                .stream(array)
                .sorted()
                .toArray();

        System.out.printf("Números ordenados: %s%n", Arrays.toString(arrayOrdenado));
    }
}
