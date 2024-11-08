package pokemones;

import leerArchivo.JsonReader;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaJson = JsonReader.getPokemon();

        final var pokemon = listaJson
                .stream()
                .filter(x -> x.getTipo().equals("AIRE"))
                .filter(x -> !x.macho())
                .toList();

        System.out.println("Lista pokemon: \n" + pokemon);
    }
}
