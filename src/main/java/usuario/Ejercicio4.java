package usuario;

import leerArchivo.ExcellReader;
import modelo.Usuario;

import java.util.Comparator;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcellReader.getUsuariosList();

        final var usuarios = listaUsuarios
                .stream()
                .sorted(Comparator.comparing(Usuario::getApellido).reversed())
                .toList();

        System.out.printf("Lista de usuarios en orden descendente: %s%n", usuarios);
    }
}
