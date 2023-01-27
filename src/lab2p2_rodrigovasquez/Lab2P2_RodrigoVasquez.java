package lab2p2_rodrigovasquez;

import java.util.Scanner;

public class Lab2P2_RodrigoVasquez {
    
    public static void main(String[] args) {
        Scanner scMain = new Scanner(System.in); 
        int opcion = 0; 
        do {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("            < B I E N V E N I D O   A   B L A C K   F L O Y D >            ");
            System.out.println("1. Registro de Inmuebre / Solar");
            System.out.println("2. Manejo de Estados");
            System.out.println("3. Log in / Sign up");
            System.out.println("4. Log out");
            System.out.println("5. Salir");
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Ingrese que acción desea ejecutar: ");
            opcion = scMain.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3: 
                    break; 
                case 4: 
                    break;
                case 5:
                default:
                    System.out.println("[ Se cerrara el programa ]");
                    break;
            }
        } while (opcion != 5 && opcion > 0 && opcion < 5);
    }
    
}
