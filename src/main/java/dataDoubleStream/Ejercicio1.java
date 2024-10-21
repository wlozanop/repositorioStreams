package dataDoubleStream;

import Utilities.Utiles;
import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var n = new Faker().number().numberBetween(300, 500);
        final var array = Utiles.generarArrayDoubleAletario(n, 1000, 10000);

        System.out.println("Generar Números  : " + Arrays.toString(array));

        final var arrayDivision = Arrays
                .stream(array)
                .map(x -> x / 1000)
                .toArray();

        System.out.println("Ver resultado division  : " + Arrays.toString(arrayDivision));
    }
}
