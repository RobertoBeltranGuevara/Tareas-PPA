import java.io.*;
import java.nio.file.*;

public class Practica3Problema1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java EliminarCadena <cadena> <archivo>");
            return;
        }

        String cadenaEliminar = args[0];
        String nombreArchivo = args[1];

        try {
            // Leer el archivo completo
            String contenido = new String(Files.readAllBytes(Paths.get(nombreArchivo)));

            // Eliminar todas las apariciones de la cadena
            String contenidoModificado = contenido.replace(cadenaEliminar, "");

            // Sobrescribir el archivo con el contenido modificado
            Files.write(Paths.get(nombreArchivo), contenidoModificado.getBytes());

            System.out.println("El texto '" + cadenaEliminar + "' ha sido eliminado del archivo " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
