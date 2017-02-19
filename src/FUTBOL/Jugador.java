package FUTBOL;


public class Jugador {
    protected int idJugador;
    protected String nombre;
    protected int idEquipo;
    protected int canPartidos;
    protected int goles;

    public Jugador(int idJugador, String nombre, int idEquipo, int canPartidos, int goles) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.idEquipo = idEquipo;
        this.canPartidos = canPartidos;
        this.goles = goles;
    }
 public Jugador(){
     idJugador=0;
     nombre = "Jan-Michael Vincent ";
     idEquipo = 312;
     canPartidos = 45;
     goles = 34;
 }
 
    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getCanPartidos() {
        return canPartidos;
    }

    public void setCanPartidos(int canPartidos) {
        this.canPartidos = canPartidos;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    public double PromedioGoles(){
        double aux;
        aux=goles/canPartidos;
        return aux;
    }
    
    @Override
    public String toString() {
        return "Jugador{" + "idJugador=" + idJugador + ", nombre=" + nombre + ", idEquipo=" + idEquipo + ", canPartidos=" + canPartidos + ", goles=" + goles + '}';
    }


}