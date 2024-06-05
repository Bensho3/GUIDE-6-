import com.sun.source.doctree.EscapeTree;

import java.util.*;
import java.util.stream.Stream;

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

                ArrayList <Integer> nums = new ArrayList<>();
                String eleccion;


                do {

                    System.out.println("Ingrese un numero:\n");
                    Scanner s = new Scanner(System.in);

                    nums.add(s.nextInt());

                    System.out.println("Desea cargar otro numero? (s/n)");
                    Scanner c = new Scanner(System.in);

                    eleccion = c.next();
                }while (eleccion.contains("s"));

                System.out.println(nums.toString());

                Integer suma = nums.stream().mapToInt(Integer::intValue).sum();
                System.out.println("Suma de numeros:" + suma);

                Double promedio = nums.stream().mapToDouble(Integer::doubleValue).average().orElse(0);

                System.out.println("Promedio de numeros:" + promedio);

            }

            //Escriba un programa que lea una lista de números enteros y luego ordene la
            //lista en orden ascendente y descendente. Utilice un TreeSet para almacenar
            //los números y mostrarlos en orden ascendente y descendente.

            case 5:{
                ArrayList <Integer> nums = new ArrayList<>();
                TreeSet <Integer> orden = new TreeSet<>();
                String eleccion;


                do {

                    System.out.println("Ingrese un numero:\n");
                    Scanner s = new Scanner(System.in);

                    nums.add(s.nextInt());
                    orden.add(nums.getLast());

                    System.out.println("Desea cargar otro numero? (s/n)");
                    Scanner c = new Scanner(System.in);

                    eleccion = c.next();
                }while (eleccion.contains("s"));

                System.out.println("Lisa de numeros:" + nums);



                }

            //Cree una clase Persona con los atributos nombre, dni y edad. Luego debe
            //crear otra clase que se encargue de la alta, baja y modificación de las
            //personas. Esta última clase debe tener un HashMap de Personas donde la
            //clave sea el dni y el valor el objeto Persona. Además de los métodos de ABM
            //se debe contar con uno que agregue un objeto ya creado, otro que tome una
            //lista de Personas y las agregue en el Map, y por último, un método que
            //devuelva la estructura ordenada por edad. Pista: El HashMap no es una
            //estructura de datos ordenada, por ende, el método no puede devolver este
            //tipo de mapa

            case 6:{
                ABM gestor = new ABM();

                Persona persona1 = new Persona("Juan", 20, "12345678");
                Persona persona2 = new Persona("Matias", 30, "87654321");
                Persona persona3 = new Persona("Pedro", 18, "789456123");
                Persona persona4 = new Persona("Maria", 20, "96325874");
                Persona persona5 = new Persona("Ana", 40, "321654987");

                ArrayList<Persona> lista = new ArrayList<>(Arrays.asList(persona1, persona2, persona3, persona4, persona5));

                gestor.addAll(lista);

                gestor.altaPersona();

                gestor.eliminarPersona("12345678");

                gestor.modificarPersona();

                gestor.listarPersonas();
            }
                }

            }


        }
