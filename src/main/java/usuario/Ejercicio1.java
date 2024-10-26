package usuario;

import leerArchivo.ExcellReader;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcellReader.getUsuariosList();

        final var usuario = listaUsuarios
                .stream()
                .filter(x -> x.getPeso() > 50)
                .filter(x -> x.getNombre().startsWith("R"))
                .filter(x -> x.getApellido().endsWith("O"))
                .toList();

        System.out.println("Ver información encontrado: \n" + usuario);
    }
}
