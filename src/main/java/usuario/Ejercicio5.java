package usuario;

import leerArchivo.ExcellReader;
import modelo.Usuario;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var usuario = ExcellReader.getUsuariosList();

        final var map = usuario
                .stream()
                .collect(Collectors.toMap(Usuario::getId, Function.identity()));

        final var usuario1 = map.get("USR-3");
        final var usuario2 = map.get("USR-11");

        System.out.printf("Suma de edades: %d", usuario1.getEdad() + usuario2.getEdad());
    }
}
