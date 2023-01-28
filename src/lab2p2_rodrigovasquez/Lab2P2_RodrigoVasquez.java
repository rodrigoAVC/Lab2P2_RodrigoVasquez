package lab2p2_rodrigovasquez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2P2_RodrigoVasquez {

    static String name;
    static boolean yoquese[];

    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = new ArrayList();
        ArrayList lista = new ArrayList();
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
                    if (estadoCuenta == false) {
                        System.out.println("No puede realizar esta accion sin haber iniciado sesion");
                    } else {
                        registro(yoquese, lista);
                    }
                    break;
                case 2:
                    if (estadoCuenta == false) {
                        System.out.println("No puede realizar esta accion sin haber iniciado sesion");
                    } else {
                        if (admin == false) {
                            System.out.println("Solo el administrador puede acceder a esto");
                        } else {

                        }
                    }
                    break;
                case 3:
                    yoquese = logIn(estadoCuenta, listaUsuarios, admin);
                    estadoCuenta = yoquese[1];
                    admin = yoquese[0];
                    break;
                case 4:
                default:
                    System.out.println("[ Se cerrara el programa ]");
                    break;
            }
        } while (opcion != 4 && opcion > 0 && opcion < 4);
    }

    public static void registro(boolean[] yoquese, ArrayList lista) {
        Scanner scReg = new Scanner(System.in);
        int opcion = 0;
        int opcionCrear = 0;
        int opcionLista = 0;
        int opcionCompra = 0;
        do {
            System.out.println("-------------------------------------");
            System.out.print("""
                               1. Crear Casas / Edificios / Solares
                               2. Listar Casas / Edificios / Solares
                               3. Modificar Casas / Edificios / Solares
                               4. Borrar Casas / Edificios / Solares
                               5. Comprar Casas / Edificios / Solares
                               """);
            System.out.println("-------------------------------------");
            System.out.print("Ingrese la accion a realizar: ");
            opcion = scReg.nextInt();
            switch (opcion) {
                case 1:
                    if (yoquese[0] == false) {
                        System.out.println("Solo el administrador puede acceder a esto");
                    } else {
                        System.out.print("""
                                         ----------------
                                           1. Casas
                                           2. Edificios
                                           3. Solares
                                         ----------------
                                           """);
                        System.out.print("¿Que desea crear? ");
                        opcionCrear = scReg.nextInt();
                        scReg = new Scanner(System.in);
                        switch (opcionCrear) {
                            case 1:
                                System.out.print("Ingrese el numero de casa: ");
                                int numCasa = scReg.nextInt();
                                System.out.print("Ingrese el numero de bloque: ");
                                int numBloque = scReg.nextInt();
                                System.out.print("Ingrese el color de la casa: ");
                                Color color = JColorChooser.showDialog(null, "Eliga el color", Color.black);
                                System.out.print("Ingrese el ancho de la casa: ");
                                int ancho = scReg.nextInt();
                                System.out.print("Ingrese el largo de la casa: ");
                                int largo = scReg.nextInt();
                                System.out.print("Ingrese el numero de baños: ");
                                int bath = scReg.nextInt();
                                System.out.print("Ingrese el numero de cuarto: ");
                                int cuartos = scReg.nextInt();
                                System.out.print("Ingrese el estado de la casa: ");
                                String estadoCasa = scReg.nextLine();
                                estadoCasa = scReg.nextLine();
                                lista.add(new Casa(numCasa, numBloque, color, ancho, largo, bath, cuartos, estadoCasa, "N/A"));
                                System.out.println("Se ha agregado la casa exitosamente");
                                break;
                            case 2:
                                System.out.print("Ingrese el numero de pisos: ");
                                int pisos = scReg.nextInt();
                                System.out.print("Ingrese la cantidad de locales: ");
                                int locales = scReg.nextInt();
                                System.out.print("Ingrese la direccion del edificio: ");
                                String edificio = scReg.nextLine();
                                edificio = scReg.nextLine();
                                System.out.print("Ingrese el estado del edificio: ");
                                String estadoEdi = scReg.nextLine();
                                lista.add(new Edificio(pisos, locales, edificio, estadoEdi, ""));
                                break;
                            case 3:
                                System.out.print("Ingrese el ancho: ");
                                int anchoSolar = scReg.nextInt();
                                System.out.print("Ingrese el largo: ");
                                int largoSolar = scReg.nextInt();
                                int area = anchoSolar * largoSolar;
                                lista.add(new Solar_Baldio(anchoSolar, largoSolar, area, ""));
                                break;
                            default:
                                System.out.println("Accion Invalida");
                                break;
                        }
                    }
                    break;
                case 2:
                    if (yoquese[0] == false) {
                        System.out.println("Solo el administrador puede acceder a esto");
                    } else {
                        System.out.print("""
                                         ----------------
                                           1. Casas
                                           2. Edificios
                                           3. Solares
                                         ----------------
                                           """);
                        System.out.print("¿Que desea listar? ");
                        opcionLista = scReg.nextInt();
                        switch (opcionLista) {
                            case 1:
                                int i = 0;
                                for (Object object : lista) {
                                    if (object instanceof Casa && ((Casa) lista.get(i)).equals("Lista")) {
                                        System.out.println(object);
                                    }
                                    i++;
                                }
                                i = 0;
                                for (Object object : lista) {
                                    if (object instanceof Casa && ((Casa) lista.get(i)).equals("En Construccion")) {
                                        System.out.println(object);
                                    }
                                    i++;
                                }
                                i = 0;
                                for (Object object : lista) {
                                    if (object instanceof Casa && ((Casa) lista.get(i)).equals("Construccion en Espera")) {
                                        System.out.println(object);
                                    }
                                    i++;
                                }
                                i = 0;
                                for (Object object : lista) {
                                    if (object instanceof Casa && ((Casa) lista.get(i)).equals("En Espera de Demolicion ")) {
                                        System.out.println(object);
                                    }
                                    i++;
                                }
                                i = 0;
                                break;
                            case 2:
                                i = 0;
                                for (Object object : lista) {
                                    if (object instanceof Edificio && ((Edificio) lista.get(i)).equals("Lista")) {
                                        System.out.println(object);
                                    }
                                    i++;
                                }
                                i = 0;
                                for (Object object : lista) {
                                    if (object instanceof Edificio && ((Edificio) lista.get(i)).equals("En Construccion")) {
                                        System.out.println(object);
                                    }
                                    i++;
                                }
                                i = 0;
                                for (Object object : lista) {
                                    if (object instanceof Edificio && ((Edificio) lista.get(i)).equals("Construccion en Espera")) {
                                        System.out.println(object);
                                    }
                                    i++;
                                }
                                i = 0;
                                for (Object object : lista) {
                                    if (object instanceof Edificio && ((Edificio) lista.get(i)).equals("En Espera de Demolicion ")) {
                                        System.out.println(object);
                                    }
                                    i++;
                                }
                                i = 0;
                                break;
                            case 3:
                                for (Object object : lista) {
                                    if (object instanceof Solar_Baldio) {
                                        System.out.println(object);
                                    }
                                }
                                break;
                            default:
                                System.out.println("Accion Invalida");
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("""
                                       ----------------
                                        1. Casas
                                        2. Edificios
                                        3. Solares
                                       ----------------
                                       """);
                    System.out.print("¿Que desea modificar? ");
                    int opcionModi = scReg.nextInt(); 
                    switch (opcionModi) {
                        case 1: 
                            for (Object object : lista) {
                                if (object instanceof Casa) {
                                    System.out.println(object);
                                }
                            }
                            System.out.print("Ingrese el numero de casa que desea modificar: ");
                            int numCasa = scReg.nextInt();
                            if (lista.get(numCasa) instanceof Casa) {
                                System.out.print("Ingrese el numero de casa: ");
                                int numeroCasa = scReg.nextInt();
                                System.out.print("Ingrese el numero de bloque: ");
                                int numBloque = scReg.nextInt();
                                System.out.print("Ingrese el color de la casa: ");
                                Color color = JColorChooser.showDialog(null, "Eliga el color", Color.black);
                                System.out.print("Ingrese el ancho de la casa: ");
                                int ancho = scReg.nextInt();
                                System.out.print("Ingrese el largo de la casa: ");
                                int largo = scReg.nextInt();
                                System.out.print("Ingrese el numero de baños: ");
                                int bath = scReg.nextInt();
                                System.out.print("Ingrese el numero de cuarto: ");
                                int cuartos = scReg.nextInt();
                                ((Casa)lista.get(numCasa)).setNumCasa(numeroCasa);
                                ((Casa)lista.get(numCasa)).setNumBloque(numBloque);
                                ((Casa)lista.get(numCasa)).setColor(color);
                                ((Casa)lista.get(numCasa)).setAncho(ancho);
                                ((Casa)lista.get(numCasa)).setLargo(largo);
                                ((Casa)lista.get(numCasa)).setBaths(bath);
                                ((Casa)lista.get(numCasa)).setCuartos(cuartos);
                            } else {
                                System.out.println("Numero Invalido");
                            }
                            break;
                        case 2:
                            for (Object object : lista) {
                                if (object instanceof Edificio) {
                                    System.out.println(object);
                                }
                            }
                            System.out.print("Ingrese el numero de edificio que desea modificar: ");
                            int numEdi = scReg.nextInt();
                            if (lista.get(numEdi) instanceof Edificio) {
                                System.out.print("Ingrese el numero de pisos: ");
                                int pisos = scReg.nextInt();
                                System.out.print("Ingrese la cantidad de locales: ");
                                int locales = scReg.nextInt();
                                System.out.print("Ingrese la direccion del edificio: ");
                                String edificio = scReg.nextLine();
                                edificio = scReg.nextLine();
                                ((Edificio)lista.get(numEdi)).setPisos(pisos);
                                ((Edificio)lista.get(numEdi)).setLocales(locales);
                                ((Edificio)lista.get(numEdi)).setDireccion(edificio);
                            } else {
                                System.out.println("Numero Invalido");
                            }
                            break;
                        case 3:
                            for (Object object : lista) {
                                if (object instanceof Solar_Baldio) {
                                    System.out.println(object);
                                }
                            }
                            System.out.print("Ingrese el solar baldio que desea modificar: ");
                            int numSolar = scReg.nextInt();
                            if (lista.get(numSolar) instanceof Solar_Baldio) {
                                System.out.print("Ingrese el ancho: ");
                                int anchoSolar = scReg.nextInt();
                                System.out.print("Ingrese el largo: ");
                                int largoSolar = scReg.nextInt();
                                int area = anchoSolar * largoSolar;
                                ((Solar_Baldio)lista.get(numSolar)).setAncho(anchoSolar);
                                ((Solar_Baldio)lista.get(numSolar)).setLargo(largoSolar);
                                ((Solar_Baldio)lista.get(numSolar)).setArea(area);
                            } else {
                                System.out.println("Numero Invalido");
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.println("""
                                       ----------------
                                        1. Casas
                                        2. Edificios
                                        3. Solares
                                       ----------------
                                       """);
                    System.out.print("¿Que desea borrar? ");
                    int opcionBorrar = scReg.nextInt(); 
                    switch (opcionBorrar) {
                        case 1: 
                            for (Object object : lista) {
                                if (object instanceof Casa) {
                                    System.out.println(object);
                                }
                            }
                            System.out.print("Ingrese el numero de casa que desea borrar: ");
                            int numCasa = scReg.nextInt();
                            if (lista.get(numCasa) instanceof Casa) {
                                lista.remove(numCasa);
                            } else {
                                System.out.println("Numero Invalido");
                            }
                            break;
                        case 2:
                            for (Object object : lista) {
                                if (object instanceof Edificio) {
                                    System.out.println(object);
                                }
                            }
                            System.out.print("Ingrese el numero de casa que desea borrar: ");
                            int numEdi = scReg.nextInt();
                            if (lista.get(numEdi) instanceof Edificio) {
                                lista.remove(numEdi);
                            } else {
                                System.out.println("Numero Invalido");
                            }
                            break;
                        case 3: 
                            for (Object object : lista) {
                                if (object instanceof Solar_Baldio) {
                                    System.out.println(object);
                                }
                            }
                            System.out.print("Ingrese el numero de casa que desea borrar: ");
                            int numSolar = scReg.nextInt();
                            if (lista.get(numSolar) instanceof Solar_Baldio) {
                                lista.remove(numSolar);
                            } else {
                                System.out.println("Numero Invalido");
                            }
                            break;
                        default:
                            System.out.println("Numero Invalido");
                            break;
                    }
                    break;
                case 5:
                    System.out.print("""
                                         ----------------
                                           1. Casas
                                           2. Edificios
                                           3. Solares
                                         ----------------
                                           """);
                    System.out.print("¿Que desea comprar? ");
                    opcionCompra = scReg.nextInt();
                    switch (opcionCompra) {
                        case 1:
                            for (Object object : lista) {
                                if (object instanceof Casa) {
                                    System.out.println(object);
                                }
                            }
                            System.out.print("Ingrese la casa que desea comprar: ");
                            int numCasa = scReg.nextInt();
                            if (lista.get(numCasa) instanceof Casa) {
                                System.out.println("Casa comprada");
                                ((Casa) lista.get(numCasa)).setOwner(name);
                            }
                            break;
                        case 2:
                            for (Object object : lista) {
                                if (object instanceof Edificio) {
                                    System.out.println(object);
                                }
                            }
                            System.out.print("Ingrese el edificio que desea comprar: ");
                            int numEdi = scReg.nextInt();
                            if (lista.get(numEdi) instanceof Edificio) {
                                System.out.println("Casa comprada");
                                ((Edificio) lista.get(numEdi)).setOwner(name);
                            }
                            break;
                        case 3:
                            for (Object object : lista) {
                                if (object instanceof Solar_Baldio) {
                                    System.out.println(object);
                                }
                            }
                            System.out.print("Ingrese el solar baldio que desea comprar: ");
                            int numSolar = scReg.nextInt();
                            if (lista.get(numSolar) instanceof Solar_Baldio) {
                                System.out.println("Casa comprada");
                                ((Solar_Baldio) lista.get(numSolar)).setOwner(name);
                            }
                            break;
                    }
                    break;
                default:
                    System.out.println("Accion Invalida");
                    break;
            }
        } while (opcion > 0 && opcion < 6);
    }

    public static void manejoEstados(ArrayList lista) {
        Scanner scEstado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.print("""
                            ----------------
                             1. Casas
                             2. Edificios
                             3. Solares
                            ----------------
                             """);
            System.out.print("¿Que desea modificar? ");
            opcion = scEstado.nextInt();
            switch (opcion) {
                case 1:
                    for (Object object : lista) {
                        if (object instanceof Casa) {
                            System.out.println(object);
                        }
                    }
                    System.out.print("Ingrese la casa que desea modificar: ");
                    int numCasa = scEstado.nextInt();
                    if (lista.get(numCasa) instanceof Casa) {
                        System.out.print("Ingrese el nuevo estado: ");
                        String newEstado = scEstado.nextLine();
                        ((Casa) lista.get(numCasa)).setEstado(newEstado);
                    }
                    break;
                case 2:
                    for (Object object : lista) {
                        if (object instanceof Edificio) {
                            System.out.println(object);
                        }
                    }
                    System.out.print("Ingrese el edificio que desea modificar: ");
                    int numEdi = scEstado.nextInt();
                    if (lista.get(numEdi) instanceof Edificio) {
                        System.out.print("Ingrese el nuevo estado: ");
                        String newEstado = scEstado.nextLine();
                        ((Edificio) lista.get(numEdi)).setEstado(newEstado);
                    }
                    break;
                case 3:
                    System.out.print("Los solares baldios no tienen estados");
                    break;
                default:
                    System.out.println("Accion Invalida");
                    break;
            }
        } while (opcion > 0 && opcion < 4);
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
                                System.out.println("Administrador ha iniciado sesion");
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
                        name = scLogs.nextLine();
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

}
