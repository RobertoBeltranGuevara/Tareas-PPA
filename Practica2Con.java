// Importación de la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

// Definición de la clase principal
public class Practica2Con {
    // Método principal, punto de entrada del programa
    public static void main(String[] args) {
        // Creación del objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingresa el primer numero: ");
        String operand1 = scanner.nextLine(); // Leer el primer número como cadena

        // Solicitar al usuario que ingrese el operador (+, -, *, /)
        System.out.print("Ingresa el operador (+, -, *, /): ");
        String operator = scanner.nextLine(); // Leer el operador como cadena

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo numero: ");
        String operand2 = scanner.nextLine(); // Leer el segundo número como cadena

        // Bloque try-catch para manejar posibles errores
        try {
            // Convertir las cadenas de los números a enteros
            int num1 = Integer.parseInt(operand1);
            int num2 = Integer.parseInt(operand2);
            int result = 0; // Variable para almacenar el resultado de la operación

            // Realizar la operación según el operador ingresado
            switch (operator.charAt(0)) { // Usar el primer carácter del operador
                case '+': 
                    result = num1 + num2; // Suma
                    break;
                case '-': 
                    result = num1 - num2; // Resta
                    break;
                case '*': 
                    result = num1 * num2; // Multiplicación
                    break;
                case '/': 
                    result = num1 / num2; // División
                    break;
                default: 
                    System.out.println("Operador invalido"); // Mensaje de error si el operador no es válido
                    return; // Salir del programa si el operador es inválido
            }

            // Mostrar el resultado de la operación
            System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
        } 
        // Capturar excepción si los números no son válidos
        catch (NumberFormatException e) {
            System.out.println("Error: los numeros deben de ser enteros.");
        } 
        // Capturar excepción si se intenta dividir entre cero
        catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre 0.");
        }
    }
}