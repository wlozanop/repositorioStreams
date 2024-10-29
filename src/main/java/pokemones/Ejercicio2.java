package pokemones;

import leerArchivo.JsonReader;
import modelo.Pokemon;

import java.util.Comparator;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var listaJson = JsonReader.getPokemon();

        final var ordenarPokemon = listaJson
                .stream()
                .filter(x -> x.getTipo().equals("ELECTRICIDAD"))
                .sorted(Comparator.comparingInt(Pokemon::getNivel).reversed())
                .toList();
        System.out.println("Lista de Pokemon: \n" + ordenarPokemon);
    }
}
