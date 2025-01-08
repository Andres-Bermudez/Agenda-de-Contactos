package crud;

import models.Contacto;
import view.MenuPrincipal;
import java.util.ArrayList;

public class BorrarContactos extends MenuPrincipal {

    public static void borrarContacto() {
        if (MenuPrincipal.contactos.isEmpty()) {
            System.out.println();
            System.out.println("        O _ O             ");
            System.out.println("Tu agenda esta vacia...");

        } else {
            System.out.println();
            System.out.println("Eliminando un contacto...");
            System.out.print("Ingresa el nombre del contacto que deseas eliminar: ");

            MenuPrincipal.entradaUsuario = MenuPrincipal.sc.nextLine();

            // Copia de la lista de contactos para recorrerla y modificar la original para evitar error "ConcurrentModificationException"
            ArrayList<Contacto> copiaContactos = new ArrayList<>(MenuPrincipal.contactos);

            for(Contacto i : copiaContactos) {
                String confirmacion = "";

                if (MenuPrincipal.entradaUsuario.equals(i.getNombre())) {
                    System.out.println("Vas a eliminar a: " + i.getNombre());
                    System.out.println("¿Estas seguro de borrarlo?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    System.out.print("Ingresa tu opcion: ");

                    confirmacion = MenuPrincipal.sc.nextLine();

                    if (confirmacion.equals("1")) {
                        MenuPrincipal.contactos.remove(i);
                        System.out.println(">>> Contacto eliminado correctamente <<<");
                        System.out.println();

                    } else if (confirmacion.equals("2")) {
                        MenuPrincipal.mostrarMenuPrincipal();

                    } else {
                        System.out.println("Opcion no disponible, Intentalo nuevamente!");
                        MenuPrincipal.mostrarMenuPrincipal();
                    }
                }
            }
            System.out.println("¡El contacto ingresado no existe!");
        }

    }
}
