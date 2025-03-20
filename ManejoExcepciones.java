import java.util.Scanner;

class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}

class ManejoExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSeleccione el ejercicio a ejecutar:");
            System.out.println("1. Lanzar excepción simple");
            System.out.println("2. Lanzar excepción con stack trace y finally");
            System.out.println("3. Definir nueva excepción");
            System.out.println("4. Lanzar excepción personalizada");
            System.out.println("5. Lanzar excepción con objeto null");
            System.out.println("6. Manejo de excepciones encadenadas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    System.out.println("Clase de excepción creada en código");
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);
        
        scanner.close();
    }

    public static void ejercicio1() {
        try {
            throw new Exception("Mensaje de error personalizado");
        } catch (Exception e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }

    public static void ejercicio2() {
        try {
            throw new Exception("Mensaje de error");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Se alcanzó el bloque finally");
        }
    }

    public static void ejercicio4() {
        try {
            lanzarExcepcion();
        } catch (MiExcepcion e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    public static void lanzarExcepcion() throws MiExcepcion {
        throw new MiExcepcion("Esta es una excepción personalizada");
    }

    public static void ejercicio5() {
        MiExcepcion ex = null;
        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("Se capturó una excepción: " + e);
        }
    }

    public static void ejercicio6() {
        try {
            metodoB();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void metodoA() throws MiExcepcion {
        throw new MiExcepcion("Excepción desde método A");
    }

    public static void metodoB() throws Exception {
        try {
            metodoA();
        } catch (MiExcepcion e) {
            throw new Exception("Excepción en método B", e);
        }
    }
}
