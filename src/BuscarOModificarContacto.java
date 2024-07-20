public class BuscarOModificarContacto extends MenuPrincipal {

    protected static void buscarOModificarContacto() {
        if (contactos.isEmpty()) {
            System.out.println();
            System.out.println("        O _ O             ");
            System.out.println("Upss...Tu agenda esta vacia");

        } else {
            System.out.println();
            System.out.println("Buscando Contacto...");
            System.out.print("Ingresa el nombre del contacto buscado: ");

            entradaUsuario = sc.nextLine();

            for(Contacto i : contactos) {
                if (entradaUsuario.equals(i.getNombre())) {
                    System.out.println();
                    System.out.println("Contacto encontrado:");
                    System.out.println(i);
                    System.out.println();
                    System.out.println("1. Modificar Contacto.");
                    System.out.println("0. Regresar al menu principal.");
                    System.out.print("Ingresa tu opcion: ");

                    entradaUsuario = sc.nextLine();

                    if (entradaUsuario.equals("1")) {
                        modificarContacto();

                    } else if (entradaUsuario.equals("0")) {
                        mostrarMenuPrincipal();

                    } else {
                        System.out.println("Opcion no disponible, Intentalo nuevamente!");
                        MenuPrincipal.mostrarMenuPrincipal();
                    }
                }
            }
            System.out.println("¡El contacto buscado no existe!");
        }
    }

    private static void modificarContacto() {
        System.out.println();
        System.out.println("1. Cambiar nombre.");
        System.out.println("2. Cambiar numero de telefono.");
        System.out.println("0. Regresar al menu principal.");
        System.out.print("Ingresa tu opcion: ");

        entradaUsuario = sc.nextLine();

        if (entradaUsuario.equals("1")) {
            System.out.println();
            System.out.print("Ingresa el nuevo nombre de tu contacto: ");
            entradaUsuario = sc.nextLine();

            for(Contacto i : contactos) {
                if (nombreContacto.equals(i.getNombre())) {
                    i.setNombre(entradaUsuario);
                    System.out.println(">>> ¡Contacto modificado correctamente! <<<");
                }
            }

        } else if (entradaUsuario.equals("2")) {
            System.out.println();
            System.out.print("Ingresa el nuevo numero de telefono de tu contacto: ");
            entradaUsuario = sc.nextLine();

            for(Contacto i : contactos) {
                if (nombreContacto.equals(i.getNombre())) {
                    i.setNumeroTelefono(entradaUsuario);
                    System.out.println(">>> ¡Contacto modificado correctamente! <<<");
                }
            }
        }
    }
}
