package dataIntStream;

import Utilities.Utiles;
import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var cantidad = new Faker().number().numberBetween(20, 30);
        final var array = Utiles.generarArrayIntAletario(cantidad, 10, 50);

        System.out.printf("números generados: %s%n", Arrays.toString(array));

        final var listaOrdenado = Arrays
                .stream(array)
                .sorted()
                .toArray();

        System.out.printf("Números ordenados: %s%n", Arrays.toString(listaOrdenado));
    }
}
