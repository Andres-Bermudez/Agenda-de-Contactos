public class VerContactos extends MenuPrincipal {

    protected static void verContactos() {
        if (MenuPrincipal.contactos.isEmpty()) {
            System.out.println();
            System.out.println("        O _ O             ");
            System.out.println("Tu agenda esta vacia...");

        } else {
            System.out.println();
            System.out.println(">>> Tus contactos: <<<");
            System.out.println("-------------------------------");

            for(Contacto i : contactos) {
                System.out.println(i);
                System.out.println("-------------------------------");
            }
        }
    }
}
