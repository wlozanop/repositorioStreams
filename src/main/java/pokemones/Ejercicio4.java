package pokemones;

import leerArchivo.JsonReader;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var listaJson = JsonReader.getPokemon();

        final var mapPokemon = listaJson
                .stream()
                .map(x -> x.aumentarHp(500))
                .toList();

        System.out.println("Aumentar el HP de los Pokemon: \n" + mapPokemon);
    }
}
