package usuario;

import parse.ParseUsuario;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var mapUsuario = ParseUsuario.getUsuarioLista();
        final var usuario1 = mapUsuario.get("USR-11");
        final var usuario2 = mapUsuario.get("USR-19");

        System.out.printf("Sumar edades: %d", usuario1.obtenerEdad() + usuario2.obtenerEdad());
    }
}
