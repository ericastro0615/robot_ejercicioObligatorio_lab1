import java.util.Scanner;

public class Hombre {

    private Robot robot;

    public Hombre () {

    }

    /*
    El robot Avance 500 pasos. El robot Retroceda 20 pasos.
Informe por pantalla cuanta energía tiene el robot Actualmente. Ponga el robot a dormir.
     */
    Scanner sc = new Scanner(System.in).useDelimiter("\n");


    public void jugarConRobot(Robot robot, Hombre h1 ) {
        System.out.println("Ingrese su nombre: ");
        String nombreJugador1= sc.next();
        System.out.println("Bienvenido Jugador  🙍‍♂️ " +  nombreJugador1  );

            robot.despertar();
            robot.avanzar(500);
            robot.retroceder(20);
            robot.mostrarEnergia();
            robot.dormir();
        System.out.println("Adios " + nombreJugador1 );
        }

        public void jugarExtra (Robot robot, Hombre hombre, int pasos) {

        robot.avanzar( pasos);
        robot.bateriaLlena();
        robot.dormir();
        robot.bateriaLlena();
        robot.energiaEncaminar(pasos );
        robot.retroceder(pasos);
        robot.mostrarEnergia();
        }

    }

