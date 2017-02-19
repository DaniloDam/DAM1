package FUTBOL;


import java.util.Scanner;

public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        boolean salida = true;
        int contador=1,opcion,cont, idJugador=1, idEquipo, canPartidos, goles;
        String nombre;
        Jugador ju1 = new Jugador();
        Jugador ju2 = new Jugador();
        Jugador listaJugadores[] = new Jugador[15];
        Jugador listaJugadores2[] = new Jugador[15];
        
        Equipo eq1 = new Equipo(22, "destino", listaJugadores); 
        Equipo eq2 = new Equipo(23, "Raptors", listaJugadores2); 
        System.out.println("");
        System.out.println("");
        eq1.darAlta(0, ju2);
        eq1.mostrarDatos();
        do {
           
            System.out.println(
                      "1)crear Jugador" + "\n"
                    + "2) mostrar datos" + "\n"
                    + "3) ordenar por gol" + "\n"
                    + "4) dar de baja jugador" + "\n"
                    + "5) mejor delantero" + "\n"
                    + "6) Traspasar de equipo" + "\n"
                    + "7) dar de alta" + "\n"
                    + "8) salir" + "\n");
            opcion = le.nextInt();
            switch (opcion) {
                case 1:
                    
                    System.out.println("id jugador"+idJugador);
                    System.out.println("nombre");
                    nombre = le.next();
                    System.out.println("idequipo");
                    idEquipo = 312;
                    System.out.println("cantidad partido");
                    canPartidos = le.nextInt();
                    System.out.println("goles");
                    goles = le.nextInt();
                    Jugador juu = new Jugador(idJugador, nombre, idEquipo, canPartidos, goles);  
                    eq1.darAlta(contador, juu);
                    contador++;
                    idJugador++;
                    break;
                case 2:
                    eq1.mostrarDatos();
                    break;
                case 3:
                   eq1.OrdenarGoles();
                    break;
                case 4:
                    System.out.println("introduce idJugador para eliminar ejemplo 1,2,3");
                    cont=le.nextInt();
                    eq1.darBaja(cont);
                    break;
                    
                case 5:
                    System.out.println(eq1.mejorDelantero()); 
                    break;
                case 6:
                    System.out.println("pasar de quipo");
                    System.out.println("introduce numero de posicion (idJugador) para eliminar");
                    cont=le.nextInt();
                    eq1.traspasar(listaJugadores2,cont);
                    eq2.mostrarDatos();
                    break;
                case 7:
                    
                    eq1.darAlta(idJugador, ju1);
                    idJugador++;
                    break;
                case 8:
                    salida=false;
            }
        } while (salida != false);
        System.out.println("fin");
    }

}

