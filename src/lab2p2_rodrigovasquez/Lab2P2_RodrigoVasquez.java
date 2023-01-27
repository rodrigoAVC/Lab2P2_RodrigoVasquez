package lab2p2_rodrigovasquez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_RodrigoVasquez {

    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = new ArrayList();
        listaUsuarios.add(new Usuario("Peter Griffin", 42, "admin", "admin1234"));
        boolean estadoCuenta = false;
        boolean admin = false;
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
                    boolean yoquese[] = logIn(estadoCuenta, listaUsuarios, admin);
                    estadoCuenta = yoquese[1];
                    admin = yoquese[0];
                    System.out.println(admin);
                    System.out.println(estadoCuenta);
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

    public static boolean[] logIn(boolean estadoCuenta, ArrayList<Usuario> lista, boolean admin) {
        boolean[] yoquese = new boolean[2];
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
                        username = scLogs.nextLine();
                        scLogs = new Scanner(System.in);
                        if (username.equals("admin")) {
                            System.out.print("Ingrese su contraseña: ");
                            password = scLogs.nextLine();
                            scLogs = new Scanner(System.in);
                            if (password.equals("admin1234")) {
                                System.out.println("Administrados ha iniciado sesion");
                                admin = true;
                                estadoCuenta = true;
                                yoquese[0] = admin;
                                yoquese[1] = estadoCuenta;
                                return yoquese;
                            } else {
                                System.out.println("Contraseña incorrecta");
                            }
                        } else {
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
                                    yoquese[0] = admin;
                                    yoquese[1] = estadoCuenta;
                                    return yoquese;
                                } else {
                                    System.out.println("Contraseña Invalida");
                                }
                            } else {
                                System.out.println("Nombre de usuario no encontrado");
                            }
                        }
                    }
                    break;
                case 2:
                    if (estadoCuenta == true) {
                        System.out.println("No se puede realizar esta accion ya que todavia una cuenta activa");
                    } else {
                        System.out.print("Ingrese su nombre: ");
                        String name = scLogs.nextLine();
                        name = scLogs.nextLine();
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
                        yoquese[0] = admin;
                        yoquese[1] = estadoCuenta;
                        return yoquese;
                    }
                    break;
                case 3:
                    if (estadoCuenta == true) {
                        System.out.print("¿Seguro que quiere cerrar sesion? ");
                        char caracter = scLogs.next().charAt(0);
                        if (caracter == 'y' || caracter == 'Y' || caracter == 's' || caracter == 'S') {
                            System.out.println("La sesion fue cerrada");
                            scLogs = new Scanner(System.in);
                            estadoCuenta = false;
                            admin = false;
                            yoquese[0] = admin;
                            yoquese[1] = estadoCuenta;
                            return yoquese;
                        }
                    } else {
                        System.out.println("No puede cerrar sesion si no hay una iniciada");
                    }
                    break;
                default:
                    System.out.println("Accion Invalida");
            }
        } while (opcion > 0 && opcion < 4);
        yoquese[0] = admin;
        yoquese[1] = estadoCuenta;
        return yoquese;
    }

    public static void logOut() {

    }
}
