package usuario;

import leerArchivo.ExcellReader;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcellReader.getUsuariosList();

        final var usuario = listaUsuarios
                .stream()
                .filter(x -> x.getPais().equals("CHINA"))
                .toList();

        System.out.printf("Usuarios filtrados por pais: \n" + usuario);
    }
}
