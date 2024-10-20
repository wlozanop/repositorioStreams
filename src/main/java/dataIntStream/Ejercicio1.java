package dataIntStream;

import Utilities.Utiles;
import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var cantidad = new Faker().number().numberBetween(10, 20);
        final var array = Utiles.generarArrayIntAletario(cantidad, 20, 50);

        System.out.println("Numero generado: " + Arrays.toString(array));

        final var resultado = Arrays
                .stream(array)
                .map(x -> x * 2)
                .toArray();

        System.out.println("Ver resultado  : " + Arrays.toString(resultado));
    }
}
