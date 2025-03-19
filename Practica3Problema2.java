import java.io.*;
import java.nio.file.*;

public class Practica3Problema2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java ContadorArchivo <archivo>");
            return;
        }

        String nombreArchivo = args[0];
        int numLineas = 0, numPalabras = 0, numCaracteres = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                numLineas++;
                numCaracteres += linea.length(); // Cuenta caracteres incluyendo espacios
                numPalabras += linea.trim().isEmpty() ? 0 : linea.trim().split("\\s+").length;
            }

            System.out.println("Archivo: " + nombreArchivo);
            System.out.println("Líneas: " + numLineas);
            System.out.println("Palabras: " + numPalabras);
            System.out.println("Caracteres: " + numCaracteres);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

