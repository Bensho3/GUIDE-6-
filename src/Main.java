import com.sun.source.doctree.EscapeTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Bienvenido a la guia 6 de objetos, seleccione un ejercicio: 1-6\n");
        Scanner menu = new Scanner(System.in);
        Integer seleccion = menu.nextInt();

        switch (seleccion) {

            // Cree un programa que solicite al usuario que ingrese una cadena de texto y
            //luego cuente el número de veces que cada carácter aparece en la cadena.
            //Utilice un HashMap para almacenar los resultados y muestre el mapa al
            //usuario al final.
            case 1: {
                System.out.printf("---------------------------------EJECICIO 1---------------------------------");
                Map<Character, Integer> mapChain = new HashMap();
                System.out.printf("\n Ingrese una palabra y se mostraran la cantidad de letras repetidas\n");
                Scanner s = new Scanner(System.in);
                String screen = s.nextLine();

                for (int i = 0; i < screen.length(); i++) {
                    mapChain.put(screen.charAt(i), 0);
                }
                for (int i = 0; i < screen.length(); i++) {
                    if (mapChain.containsKey(screen.charAt(i))) {
                        Integer cont = mapChain.get(screen.charAt(i));
                        if (mapChain.containsKey(screen.charAt(i))) {
                            cont++;
                        }
                        mapChain.put(screen.charAt(i), cont);
                    }

                }

                System.out.println("Cantidad de caracteres repetidos:\n" + mapChain.toString());
            }

            //Escriba un programa que genere una lista de números aleatorios, la ordene y
            //luego elimine los duplicados. Utilice un HashSet para almacenar los números
            //únicos y un ArrayList para la lista original.
            case 2: {
                List<Integer> listita = new ArrayList<>();
                HashMap<Integer, Integer> mapitaOrdenado = new HashMap<>();

                for (int i = 0; i < 10; i++) {
                    listita.add((int) (Math.random() * (100 - 1 + 1)) + 1);
                }
                System.out.printf("Lista Random: " + listita.toString());

                Collections.sort(listita);

                System.out.println("\nLista ordenada: " + listita);

                for (int i = 0; i < listita.size(); i++) {
                    mapitaOrdenado.put(i, listita.get(i));

                }
                System.out.println("HashMap ordenado: " + mapitaOrdenado.toString());
            }

            //Escriba un programa que solicite al usuario que ingrese una lista de nombres
            //de personas y sus edades, y luego ordene la lista por edad. Utilice un
            //TreeMap para almacenar los nombres y las edades.
            case 3: {
                String eleccion;
                TreeMap<Integer,String> arbolitoPersonas = new TreeMap<>();

                do {

                System.out.println("Ingrese un nombre:\n");
                Scanner s = new Scanner(System.in);
                String names = s.nextLine();
                System.out.println("Ingrese una edad:\n");
                Scanner i = new Scanner(System.in);
                Integer age = i.nextInt();

                arbolitoPersonas.put(age,names);

                System.out.println("Desea cargar otra persona? (s/n)");
                Scanner c = new Scanner(System.in);
                eleccion = c.next();
                }while (eleccion.contains("s"));

                System.out.println(arbolitoPersonas.toString());


            }

            //Escriba un programa que lea una lista de números enteros y luego calcule la
            //suma y el promedio. Utilice un ArrayList para almacenar los números y una
            //HashMap para calcular la frecuencia de cada número. (Averiguar cómo hacer
            //una suma de elementos de una lista con streams). Stream es un flujo de
            //datos que a través de métodos concatenados podemos filtrarlos, modificarlos
            //y realizar distintas operaciones que devuelvan un flujo totalmente diferente.
            case 4: {

            }


        }


    }
}