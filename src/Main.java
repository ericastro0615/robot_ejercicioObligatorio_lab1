import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Robot r1 = new Robot(new Bateria ());
        Hombre h1 = new Hombre( );
        h1.jugarConRobot(r1, h1);
        System.out.println("\n\n");

        System.out.printf("Ingrese su nombre ");
        String nombreH2 = sc.nextLine();
        Hombre h2 = new Hombre();
        System.out.printf("Hola " + nombreH2 );
        boolean robotDespierto = false;
       do {
            System.out.printf(" Desea despertar al Robot? si / no ");
            if (sc.nextLine( ).equalsIgnoreCase("si" ) ) {
                robotDespierto=true;

                menu(r1, h2);

            } else {
                System.out.println("lo lamento, aún el robot esta durmiendo");
                robotDespierto= false;
            }
       } while (robotDespierto=false);


    }
        public static void menu (Robot r1, Hombre h2){
        int opcion = 0;
        boolean dormido = false;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

            do {
                System.out.println("1 - Avanzar \n" +
                        "2 - Retroceder \n" +
                        "3 - Dormir al robot  \n" +
                        "4 - Despertar al robot \n" +
                        "5 - Recargar la bateria \n" +
                        "6 - Verificar carga de la bateria \n" +
                        "7 - Salir");
                        opcion = sc.nextInt();
                switch (opcion) {

                    case 1 :
                        System.out.println("➡ Cuántos pasos avanzará el robot? ");
                        r1.avanzar(sc.nextInt());
                        break;
                    case 2:
                        System.out.println("➡ Cuántos pasos retrocederá el robot? ");
                        r1.retroceder(sc.nextInt());
                        break;
                    case 3:
                        r1.dormir();
                        dormido= true;
                        break;
                    case 4:
                        System.out.printf("El robot se ha despertado 🆗");
                        r1.despertar();
                        break;
                    case 5:
                        r1.bateriaLlena();
                    case 6:
                        r1.mostrarEnergia();
                    case 7:
                        System.out.printf("Saliendo...");

                        break;
                    default:
                        System.out.printf("Opción incorrecta.");
                        break;
            }
            }while  (opcion!=7) ;
            System.out.println(" Adios 🙋‍♂️" );
        }


        }





