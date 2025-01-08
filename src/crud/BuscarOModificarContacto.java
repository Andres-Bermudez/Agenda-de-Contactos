package crud;

import models.Contacto;
import view.MenuPrincipal;

public class BuscarOModificarContacto extends MenuPrincipal {

    public static void buscarOModificarContacto() {
        if (MenuPrincipal.contactos.isEmpty()) {
            System.out.println();
            System.out.println("        O _ O             ");
            System.out.println("Upss...Tu agenda esta vacia");

        } else {
            System.out.println();
            System.out.println("Buscando Contacto...");
            System.out.print("Ingresa el nombre del contacto buscado: ");

            MenuPrincipal.entradaUsuario = MenuPrincipal.sc.nextLine();

            for(Contacto i : MenuPrincipal.contactos) {
                if (MenuPrincipal.entradaUsuario.equals(i.getNombre())) {
                    System.out.println();
                    System.out.println("Contacto encontrado:");
                    System.out.println(i);
                    System.out.println();
                    System.out.println("1. Modificar contacto.");
                    System.out.println("0. Regresar al menu principal.");
                    System.out.print("Ingresa tu opcion: ");

                    MenuPrincipal.entradaUsuario = MenuPrincipal.sc.nextLine();

                    if (MenuPrincipal.entradaUsuario.equals("1")) {
                        modificarContacto();

                    } else if (MenuPrincipal.entradaUsuario.equals("0")) {
                        MenuPrincipal.mostrarMenuPrincipal();

                    } else {
                        System.out.println("Opcion no disponible, Intentalo nuevamente!");
                        MenuPrincipal.mostrarMenuPrincipal();
                    }
                } else {
                    System.out.println("¡El contacto buscado no existe!");

                }
            }
        }
    }

    private static void modificarContacto() {
        System.out.println();
        System.out.println("1. Cambiar nombre.");
        System.out.println("2. Cambiar numero de telefono.");
        System.out.println("0. Regresar al menu principal.");
        System.out.print("Ingresa tu opcion: ");

        MenuPrincipal.entradaUsuario = MenuPrincipal.sc.nextLine();

        if (MenuPrincipal.entradaUsuario.equals("1")) {
            System.out.println();
            System.out.print("Ingresa el nuevo nombre de tu contacto: ");
            MenuPrincipal.entradaUsuario = MenuPrincipal.sc.nextLine();

            for(Contacto i : MenuPrincipal.contactos) {
                if (MenuPrincipal.nombreContacto.equals(i.getNombre())) {
                    i.setNombre(MenuPrincipal.entradaUsuario);
                    System.out.println(">>> ¡Contacto modificado correctamente! <<<");
                }
            }

        } else if (MenuPrincipal.entradaUsuario.equals("2")) {
            System.out.println();
            System.out.print("Ingresa el nuevo numero de telefono de tu contacto: ");
            MenuPrincipal.entradaUsuario = MenuPrincipal.sc.nextLine();

            for(Contacto i : MenuPrincipal.contactos) {
                if (MenuPrincipal.nombreContacto.equals(i.getNombre())) {
                    i.setNumeroTelefono(MenuPrincipal.entradaUsuario);
                    System.out.println(">>> ¡Contacto modificado correctamente! <<<");
                }
            }
        }
    }
}
