public class MetodoBusquedaBinaria {

    public static void insertionSort(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona key = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].edad > key.edad) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = key;
        }
    }

    public static int busquedaBinaria(Persona[] personas, int edadBuscada) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int valorCentro = personas[centro].edad;

            // Imprimir el arreglo actual
            for (int i = bajo; i <= alto; i++) {
                System.out.print(personas[i].edad + (i < alto ? " | " : ""));
            }
            System.out.println();

            System.out.print("bajo=" + bajo + " alto=" + alto + " centro=" + centro + " valorCentro=" + valorCentro + " --> ");

            if (valorCentro == edadBuscada) {
                System.out.println("ENCONTRADO");
                return centro;
            } else if (valorCentro < edadBuscada) {
                System.out.println("DERECHA");
                bajo = centro + 1;
            } else {
                System.out.println("IZQUIERDA");
                alto = centro - 1;
            }
        }

        return -1;
    }
}
