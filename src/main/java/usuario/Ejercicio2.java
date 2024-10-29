package usuario;

import leerArchivo.ExcellReader;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcellReader.getUsuariosList();

        final var usuario = listaUsuarios
                .stream()
                .filter(x -> x.getCorreo().contains("GMAIL.COM"))
                .toList();

        System.out.printf("Usuarios filtrados por correo: " + usuario);
    }
}
