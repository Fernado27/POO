public class Jugador extends Alumno{
    int goles;
    String posicion;

    public Jugador() {
    }

    public Jugador(int id, String nombre, String apellido, int goles, String posicion) {
        super(id, nombre, apellido);
        this.goles = goles;
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
