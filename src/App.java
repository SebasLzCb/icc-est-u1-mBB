import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de Personas del listado: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Persona[] personas = new Persona[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese Persona:");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            int edad;
            do {
                System.out.print("Edad: ");
                edad = sc.nextInt();
                if (edad < 0) {
                    System.out.println("La edad no puede ser negativa. Intente de nuevo.");
                }
            } while (edad < 0);
            sc.nextLine(); // limpiar buffer

            personas[i] = new Persona(nombre, edad);
        }

        MetodoBusquedaBinaria.insertionSort(personas);

        System.out.print("Valor de la persona de la edad: ");
        int edadBuscada = sc.nextInt();

        int indice = MetodoBusquedaBinaria.busquedaBinaria(personas, edadBuscada);

        if (indice != -1) {
            System.out.println("La persona con la edad " + edadBuscada + " es " + personas[indice].nombre);
        } else {
            System.out.println("No se encontró ninguna persona con esa edad.");
        }

        sc.close();
    }
}
