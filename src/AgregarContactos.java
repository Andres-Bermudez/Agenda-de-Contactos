import java.util.ArrayList;

public class AgregarContactos extends MenuPrincipal {

    protected static void agregarContacto() {
        System.out.println();
        System.out.println("Agregando Nuevo Contacto...");
        System.out.print("Ingresa el nombre: ");
        nombreContacto = sc.nextLine();

        System.out.print("Numero de Telefono: ");
        numeroContacto = sc.nextLine();

        // Copia de la lista de contactos para recorrer la copia y modificar la original
        // para evitar error "ConcurrentModificationException"
        ArrayList<Contacto> copiaContactos = new ArrayList<>(contactos);

        if (contactos.isEmpty()) {
            contactos.add(new Contacto(nombreContacto, numeroContacto));
            System.out.println(">>> Contacto agregado correctamente <<<");

        } else {
            for(Contacto i : copiaContactos) {
                if (nombreContacto.trim().equals(i.getNombre().trim()) ||
                        numeroContacto.trim().equals(i.getNumeroTelefono().trim())) {

                    System.out.println("¡Este contacto ya existe!");
                    MenuPrincipal.mostrarMenuPrincipal();
                }
            }
            contactos.add(new Contacto(nombreContacto, numeroContacto));
            System.out.println(">>> Contacto agregado correctamente <<<");
        }
    }
}
