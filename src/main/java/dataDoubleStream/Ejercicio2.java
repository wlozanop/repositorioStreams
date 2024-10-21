package dataDoubleStream;

import Utilities.Utiles;
import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var n = new Faker().number().numberBetween(400, 450);
        final var array = Utiles.generarArrayDoubleAletario(n, 1000, 1200);

        System.out.printf("Números generados       : %s%n", Arrays.toString(array));

        final var arrayDuplicados = Arrays
                .stream(array)
                .distinct()
                .toArray();

        System.out.printf("Resultado sin duplicados: %s", Arrays.toString(arrayDuplicados));
    }
}
