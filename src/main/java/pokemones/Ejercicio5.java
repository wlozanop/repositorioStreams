package pokemones;

import leerArchivo.JsonReader;
import modelo.Pokemon;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var map = JsonReader.getPokemon();

        final var pokemonMap = map
                .stream()
                .collect(Collectors.toMap(Pokemon::getId, Function.identity()));

        final var pokemon1 = pokemonMap.get("PKM-2");
        final var pokemon2 = pokemonMap.get("PKM-8");

        System.out.printf("Sumar las defensas de 2 pokemones: %.02f", pokemon1.getDefensa() + pokemon2.getDefensa());
    }
}
