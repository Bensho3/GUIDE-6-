import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ABM{

    private HashMap <String,Persona> MapPersonas = new HashMap<>();

    public void add(Persona tilin)
    {
    this.MapPersonas.put(tilin.getDni(),tilin);
    }

    public void addAll(List<Persona> listaDeTilines)
    {
        for (Persona tilin : listaDeTilines)
        {
            this.MapPersonas.put(tilin.getDni(), tilin);
        }
    }

    public void listarPersonas()
    {
        for (Map.Entry<String, Persona> persona : MapPersonas.entrySet())
        {
            System.out.println(persona.getKey() + " - " + persona.getValue().getNombre()+ " " + persona.getValue().getEdad() + " años");
        }
        }

    public void altaPersona(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el dni: ");
        String dni = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        Integer edad = scanner.nextInt();

        Persona tilin = new Persona(nombre,edad, dni);

        this.add(tilin);

        }

        public void eliminarPersona(String dni) {
            System.out.println("Estas son las personas registradas:\n");
            this.listarPersonas();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Para elimianr a una persona, ingrese su DNI:");
            dni = scanner.nextLine();

            if (MapPersonas.remove(dni) == null) {
                System.out.println("No se encontró la persona con el dni ingresado");
            }
        }

        public void modificarPersona(){
            System.out.println("Estas son las peronas registradas:\n");
            this.listarPersonas();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el dni de la pèrsona que quiere modificar: ");
            String dni = scanner.nextLine();

            System.out.println("Ingrese los nuevos datos de la persona (el dni no puede cambiarse): ");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            Integer edad = scanner.nextInt();

            Persona tilinModificado = new Persona(nombre,edad,dni);
            MapPersonas.replace(tilinModificado.getDni(), tilinModificado);


        }
}
