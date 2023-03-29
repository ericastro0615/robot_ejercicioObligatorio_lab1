import java.util.Scanner;

public class Robot {


    private Bateria bateria;
    private boolean dormido= false;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");;

    public Robot(Bateria bateria) {
        this.bateria=bateria;
    }
    public boolean  energiaEncaminar (int pasos) {

        bateria.setCarga((pasos*10)/100 );
        return true;
    }

    public void avanzar( int pasos) {

//no funciona porque int pasos es desde construcutor y no recibe los metodos energia avanzar los n de pasos
         int calculo = (pasos*10)/100;
        if (  despertar()  & (bateria.getCarga()>calculo ) ) {
            System.out.println("Avanzando "+ pasos+ " pasos 👣 ");
            energiaEncaminar(pasos);
        }else {
            System.out.printf("Lo lamento, no tengo suficiente energia. Mi carga actual es: ", bateria.getCarga());
        }
        System.out.printf("\n");
    }


    public void retroceder( int pasos) {
        int calculo = (pasos*10)/100;
        if (  despertar()  & (bateria.getCarga()>calculo ) ) {

            System.out.printf("Retrocediendo "+ pasos);
            energiaEncaminar(pasos);
        }else {
            System.out.printf("Lo lamento, no tengo sufiente energia", bateria.getCarga());
        }
        System.out.printf("\n");

    }

    public boolean dormir() {

                System.out.println("El robot está dormido 😴");
               // dormido = true;

                return true;
        }

    public boolean bateriaLlena() {
        System.out.println("La carga de la batería ha finalizado ✅");
         bateria.setCarga(1000);
        System.out.printf("\n");
         return true;

    }


    public boolean despertar() {

        return true;
    }


    public boolean bateriaVacia() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        if (bateria.getCarga()<11) {
            System.out.printf("La bateria necesita ser recargada ⚠");
    }
        System.out.printf("Desea cargar la bateria? ");

            if (sc.next().equalsIgnoreCase("si") ) {
                bateria.setCarga(1000); }
            else {
                System.out.println("Apagando robot 🛑");
            }
        System.out.printf("\n");
        return true;
     }

     public void mostrarEnergia (){
         System.out.println("El nivel de bateria es: "+ bateria.getCarga()+ " unidades");
         System.out.printf("\n");

     }






}
