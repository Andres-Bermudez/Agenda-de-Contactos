import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
    protected static String nombreContacto;
    protected static String numeroContacto;
    protected static String entradaUsuario;

    protected static Scanner sc = new Scanner(System.in);

    protected static ArrayList<Contacto> contactos = new ArrayList<Contacto>();

    public static void mostrarMenuPrincipal() {
        boolean salir = false;

        do {
            System.out.println(" ");
            System.out.println("::Bienvenido a tu agenda de contactos::");
            System.out.println("     1. Agregar Nuevo Contacto.");
            System.out.println("     2. Buscar y/o Modificar un Contacto.");
            System.out.println("     3. Borrar un Contacto.");
            System.out.println("     4. Ver todos los contactos.");
            System.out.println("     0. Salir");
            System.out.print("Ingresa tu opcion: ");

            entradaUsuario = sc.nextLine();

            switch (entradaUsuario) {
                case "1":
                    AgregarContactos.agregarContacto();
                    break;
                case "2":
                    BuscarOModificarContacto.buscarOModificarContacto();
                    break;
                case "3":
                    BorrarContactos.borrarContacto();
                    break;
                case "4":
                    VerContactos.verContactos();
                    break;
                case "0":
                    System.out.println();
                    System.out.println("Gracias por usar tu agenda de contactos :)");
                    System.out.println("Te esperamos pronto nuevamente...");
                    System.exit(0);
                default:
                    System.out.println("Opcion no disponible, Intentalo nuevamente!");
                    System.out.println();
            }
        } while(!salir);
    }
}
