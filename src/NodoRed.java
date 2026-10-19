public class NodoRed {

    private int identificador;
    private int capacidadMax;
    private int cantidadConexiones=0;
    private static int contador=0;

    public NodoRed(int identificador, int capacidadMax) {
        setIdentificador(identificador);
        setCapacidadMax(capacidadMax);

        contador+=1;

    }

    public int getIdentificador() {
        return identificador;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getCantidadConexiones() {
        return cantidadConexiones;
    }

    public static int getContador() {
        return contador;
    }

    public void setIdentificador(int identificador) {
        if (identificador>=0){
            this.identificador=identificador;
        }




    }

    public void setCapacidadMax(int capacidadMax) {

        if (capacidadMax>0){
            this.capacidadMax = capacidadMax;
        }


    }



    public boolean conectar(int cantidadConexiones, int capacidadMax){

        if (cantidadConexiones>=0 && cantidadConexiones<capacidadMax){

            this.cantidadConexiones +=1;
            return true;

        }
        else {
            return false;
        }



    }

    public boolean desconectar(int cantidadConexiones, int capacidadMax){

        if (cantidadConexiones>=1){

            this.cantidadConexiones -=1;
            return true;

        }
        else {
            return false;
        }



    }


}
