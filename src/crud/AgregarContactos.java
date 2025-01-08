package crud;

import models.Contacto;
import view.MenuPrincipal;
import java.util.ArrayList;

public class AgregarContactos extends MenuPrincipal {

    public static void agregarContacto() {
        System.out.println();
        System.out.println("Agregando Nuevo Contacto...");
        System.out.print("Ingresa el nombre: ");
        MenuPrincipal.nombreContacto = MenuPrincipal.sc.nextLine();

        System.out.print("Numero de Telefono: ");
        MenuPrincipal.numeroContacto = MenuPrincipal.sc.nextLine();

        // Copia de la lista de contactos para recorrer la copia y modificar la original
        // para evitar error "ConcurrentModificationException"
        ArrayList<Contacto> copiaContactos = new ArrayList<>(MenuPrincipal.contactos);

        if (MenuPrincipal.contactos.isEmpty()) {
            MenuPrincipal.contactos.add(new Contacto(MenuPrincipal.nombreContacto, MenuPrincipal.numeroContacto));
            System.out.println(">>> Contacto agregado correctamente <<<");

        } else {
            for(Contacto i : copiaContactos) {
                if (MenuPrincipal.nombreContacto.trim().equals(i.getNombre().trim()) ||
                        MenuPrincipal.numeroContacto.trim().equals(i.getNumeroTelefono().trim())) {

                    System.out.println("¡Este contacto ya existe!");
                    MenuPrincipal.mostrarMenuPrincipal();
                }
            }
            MenuPrincipal.contactos.add(new Contacto(MenuPrincipal.nombreContacto, MenuPrincipal.numeroContacto));
            System.out.println(">>> Contacto agregado correctamente <<<");
        }
    }
}
