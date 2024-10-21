package dataIntStream;

import Utilities.Utiles;
import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var cantidad = new Faker().number().numberBetween(10, 20);
        final var array = Utiles.generarArrayIntAletario(cantidad, 20, 50);

        System.out.printf("Numero generado: %s%n", Arrays.toString(array));

        final var resultado = Arrays
                .stream(array)
                .map(x -> x * 2)
                .toArray();

        System.out.printf("Ver resultado  : %s%n", Arrays.toString(resultado));
    }
}
