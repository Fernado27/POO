public class POO {
    public static void main(String[] args) {

        Alumno al1 = new Alumno();
        Alumno al2 = new Alumno(5, "Fernando", "Palma");

        Jugador j1 = new Jugador(6,"Messi","Andres",100,"Delantero");

        System.out.println("Nombre: " + j1.getNombre());
        System.out.println("Goles: " + j1.getGoles());

        Alumno vector[] = new Alumno[5];
        vector[0] = new Jugador();
        vector[1] = new Alumno();
        vector[3] = new Bailarin();
    }
}
