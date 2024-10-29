package pokemones;

import leerArchivo.JsonReader;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var listaJson = JsonReader.getPokemon();

        final var listaPokemon = listaJson
                .stream()
                .map(x -> x.getHp() + 500)
                .toList();

        System.out.println("Lista pokemon aumentado el HP: \n" + listaPokemon);
    }
}
