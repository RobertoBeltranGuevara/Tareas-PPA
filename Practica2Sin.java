// Importación de la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

// Definición de la clase principal
public class Practica2Sin {
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

        // Validar si los operandos son números enteros
        if (!isNumeric(operand1) || !isNumeric(operand2)) {
            System.out.println("Error: los numeros deben ser enteros.");
            return; // Salir del programa si los operandos no son números válidos
        }

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
                // Verificar si el divisor es cero
                if (num2 == 0) {
                    System.out.println("Error: no se puede dividir entre 0.");
                    return; // Salir del programa si se intenta dividir entre cero
                }
                result = num1 / num2; // División
                break;
            default: 
                System.out.println("Operador invalido"); // Mensaje de error si el operador no es válido
                return; // Salir del programa si el operador es inválido
        }

        // Mostrar el resultado de la operación
        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }

    // Método para verificar si una cadena es un número entero válido
    public static boolean isNumeric(String str) {
        // Usar una expresión regular para validar si la cadena es un número entero (positivo o negativo)
        return str.matches("-?\\d+");
    }
}