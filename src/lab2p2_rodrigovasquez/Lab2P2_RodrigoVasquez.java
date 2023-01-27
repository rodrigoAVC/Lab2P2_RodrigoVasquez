package lab2p2_rodrigovasquez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_RodrigoVasquez {

    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = new ArrayList();
        listaUsuarios.add(new Usuario("Peter Griffin", 42, "admin", "admin1234"));
        boolean estadoCuenta = false;
        Scanner scMain = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("            < B I E N V E N I D O   A   B L A C K   F L O Y D >            ");
            System.out.println("1. Registro de Inmuebre / Solar");
            System.out.println("2. Manejo de Estados");
            System.out.println("3. Log in / Sign up / Log out");
            System.out.println("4. Salir");
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Ingrese que acción desea ejecutar: ");
            opcion = scMain.nextInt();
            switch (opcion) {
                case 1:
                    if (estadoCuenta = false) {
                        System.out.println("No puede realizar esta accion sin haber iniciado sesion");
                    } else {

                    }
                    break;
                case 2:
                    if (estadoCuenta = false) {
                        System.out.println("No puede realizar esta accion sin haber iniciado sesion");
                    } else {

                    }
                    break;
                case 3:
                    break;
                case 4:
                default:
                    System.out.println("[ Se cerrara el programa ]");
                    break;
            }
        } while (opcion != 4 && opcion > 0 && opcion < 4);
    }

    public static void registro() {

    }

    public static void manejoEstados() {

    }

    public static void logIn(boolean estadoCuenta, ArrayList<Usuario> lista) {
        Scanner scLogs = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("------------");
            System.out.println("1. Log in");
            System.out.println("2. Sign up");
            System.out.println("3. Log out");
            System.out.println("------------");
            System.out.print("Ingrese la accion a realizar: ");
            opcion = scLogs.nextInt();
            String username = "";
            String password = "";
            switch (opcion) {
                case 1:
                    if (estadoCuenta == true) {
                        System.out.println("No se puede realizar esta accion ya que todavia una cuenta activa");
                    } else {
                        System.out.print("Ingrese su nombre de usuario: ");
                        username = scLogs.nextLine();
                        scLogs = new Scanner(System.in);
                        boolean correctUser = false;
                        for (Usuario usuario : lista) {
                            String name = usuario.getUsername();
                            if (username.equals(name)) {
                                correctUser = true;
                            }
                        }
                        if (correctUser == true) {
                            System.out.print("Ingrese su contraseña: ");
                            password = scLogs.nextLine();
                            scLogs = new Scanner(System.in);
                            boolean correctPassword = false;
                            for (Usuario usuario : lista) {
                                String pass = usuario.getPassword();
                                if (password.equals(pass)) {
                                    correctPassword = true;
                                }
                            }
                            if (correctPassword == true) {
                                System.out.println("Se ha iniciado sesion exitosamente");
                                estadoCuenta = true; 
                            } else {
                                System.out.println("Contraseña Invalida");
                            }
                        } else {
                            System.out.println("Nombre de usuario no encontrado");
                        }
                    }
                    break;
                case 2:
                    if (estadoCuenta == true) {
                        System.out.println("No se puede realizar esta accion ya que todavia una cuenta activa");
                    } else {
                        System.out.print("Ingrese su nombre: ");
                        String name = scLogs.nextLine();
                        scLogs = new Scanner(System.in);
                        System.out.print("Ingrese su edad: ");
                        int edad = scLogs.nextInt();
                        scLogs = new Scanner(System.in);
                        System.out.print("Ingrese un nombre de usuario: ");
                        username = scLogs.nextLine();
                        scLogs = new Scanner(System.in);
                        System.out.print("Ingrese una contraseña: ");
                        password = scLogs.nextLine();
                        scLogs = new Scanner(System.in);
                        lista.add(new Usuario(name, edad, username, password));
                        System.out.println("Usuario agregado exitosamente");
                        estadoCuenta = true;
                        return;
                    }
                    break;
                case 3:
                    System.out.print("¿Seguro que quiere cerrar sesion? ");
                    char caracter = scLogs.next().charAt(0);
                    if (caracter == 'y' || caracter == 'Y') {
                        System.out.println("La sesion fue cerrada");
                        estadoCuenta = false;
                        scLogs = new Scanner(System.in);
                    } else {
                        return;
                    }
                    break;
                default:
                    System.out.println("Accion Invalida");
            }
        } while (opcion > 0 && opcion < 4);
    }

    public static void logOut() {

    }
}
