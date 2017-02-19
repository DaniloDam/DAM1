package FUTBOL;

public class Equipo {

    private int idEquipoo;
    private String nombreEquipo;
    private Jugador[] listado;

    public Equipo(int idEquipoo, String nombreEquipo, Jugador[] listado) {
        this.idEquipoo = idEquipoo;
        this.nombreEquipo = nombreEquipo;
        this.listado = listado;
    }

    public void mostrarDatosJugador(String nombre) {
        String aux;
        for (int i = 0; i < listado.length; i++) {
            aux = listado[i].getNombre();
            if (aux.equals(nombre)) {
                System.out.println(listado[i].toString());
            }
        }
    }

    public void mostrarDatos() {
        String aux;
        for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                System.out.println(listado[i].toString());
            } else {
                System.out.println("Está disponible la plaza");
            }
        }
    }

    //mejor delantero
    public void OrdenarGoles() {
        Jugador aux = new Jugador();

        for (int pasada = 0; pasada < listado.length; pasada++) {
            for (int i = 0; i < listado.length; i++) {
                if (listado[i + 1] == null) {
                    i = listado.length;
                } else if (listado[i + 1] != null) {
                    if (listado[i].getGoles() < listado[i + 1].getGoles()) {
                        aux = listado[i];
                        listado[i] = listado[i + 1];
                        listado[i + 1] = aux;
                    }
                }
            }
        }
        for (int j = 0; j < listado.length; j++) {
            if (listado[j] != null) {
                System.out.println(listado[j]);
            }
        }

    }

    public String mejorDelantero() {
        Jugador aux = new Jugador();
        Jugador mejor = new Jugador();
        mejor.setGoles(-1);

        for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                aux = listado[i];
                if (mejor.getGoles() < aux.getGoles()) {
                    mejor = aux;
                }
            }
        }
        return "El mejor jugador es: \n" + "Nombre " + mejor.getNombre() + " idJugador " + mejor.getIdJugador() + " Goles: " + mejor.getGoles();

    }

    public void darBaja(int id) {
        Jugador aux = null;
        for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                if (listado[i].getIdJugador() == id) {
                    listado[i] = aux;
                }
            } else {
                System.out.println("no hay un jugador indicado");
            }
        }

    }

    public void darAlta(int id, Jugador ju) {

        if (listado[id] == null) {
            listado[id] = ju;
        } else {
            System.out.println("no es posible en esa posicion");
        }

    }

    public void darAltaE() {
        Jugador ju = new Jugador();
        for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                listado[i] = ju;
            }
        }
    }

    public void traspasar(Jugador[] listado2, int idJugador) {
        Jugador aux = new Jugador();
        boolean salida = false;

        for (int i = 0; i < 10; i++) {
            if (listado[i] != null) {
                if (listado[i].getIdJugador() == idJugador) {
                    aux = listado[i];
                }

            }
        }
        for (int j = 0; j < listado2.length; j++) {
            if (salida != true) {
                if (listado2[j] == null) {
                    listado2[j] = aux;
                    salida = true;
                }
            }

        }

    }

}