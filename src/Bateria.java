public class Bateria {

    private int carga = 1000;


    public int getCarga() {

        return carga;
    }

    public void setCarga(int carga) {

        this.carga = carga;
        if (getCarga()<20) {
            System.out.println("\n Nivel de bateria por debajo de 20 unidades ⚠");
        }
    }

    public void   energiaActual() {
        System.out.println("El nivel de bateria es de "+ getCarga() );

    }


}
