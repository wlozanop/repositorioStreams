package usuario;

import leerArchivo.ExcellReader;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcellReader.getUsuariosList();

        final var usuario1 = listaUsuarios
                .stream()
                .filter(x -> x.getId().equals("USR-11"))
                .findFirst()
                .orElseThrow();

        final var usuario2 = listaUsuarios
                .stream()
                .filter(x -> x.getId().equals("USR-18"))
                .findFirst()
                .orElseThrow();

        System.out.printf("Sumar edades: %d", usuario1.obtenerEdad() + usuario2.obtenerEdad());
    }
}
