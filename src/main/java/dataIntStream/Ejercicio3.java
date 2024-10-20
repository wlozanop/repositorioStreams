package dataIntStream;

import Utilities.Utiles;
import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var cantidad = new Faker().number().numberBetween(20, 30);
        final var array = Utiles.generarArrayIntAletario(cantidad, 10, 50);

        System.out.println("Números generados: " + Arrays.toString(array));

        final var resultado = Arrays
                .stream(array)
                .sum();

        System.out.println("Suma total: " + resultado);
    }
}
