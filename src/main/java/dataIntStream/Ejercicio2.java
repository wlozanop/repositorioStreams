package dataIntStream;

import com.github.javafaker.Faker;
import utilities.Utiles;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var cantidad = new Faker().number().numberBetween(10, 20);
        final var array = Utiles.generarArrayIntAletario(cantidad, 30, 50);

        System.out.printf("Numeros generados: %s%n", Arrays.toString(array));

        final var resultado = Arrays
                .stream(array)
                .distinct()
                .toArray();

        System.out.printf("Ver resultado    : %s", Arrays.toString(resultado));
    }
}
