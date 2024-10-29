package pokemones;

import leerArchivo.JsonReader;
import modelo.Pokemon;

import java.util.Comparator;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaJson = JsonReader.getPokemon();

        final var ordenarPokemon = listaJson
                .stream()
                .filter(x -> x.getUbicacion().equals("CERULEAN CITY"))
                .sorted(Comparator.comparing(Pokemon::getNombre))
                .toList();

        System.out.println("Ordenar de Pokemon: \n" + ordenarPokemon);
    }
}
