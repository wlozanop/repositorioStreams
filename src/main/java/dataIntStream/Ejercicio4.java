package dataIntStream;

import Utilities.Utiles;
import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var cantidad = new Faker().number().numberBetween(20, 30);
        final var array = Utiles.generarArrayIntAletario(cantidad, 10, 50);

        System.out.println("números generados: " + Arrays.toString(array));

        final var resultado = Arrays
                .stream(array)
                .sorted()
                .toArray();

        System.out.println("Orden de números : " + Arrays.toString(resultado));
    }
}
