public class Main {

    static void main(String[] args) {

        NodoRed n1 = new NodoRed(101,2);

        System.out.println("Capacidad max:"+n1.getCapacidadMax());
        System.out.println("Conexiones activas:"+n1.getCantidadConexiones());
        n1.conectar(n1.getCantidadConexiones(),n1.getCapacidadMax());
        System.out.println("Conectar primera vez: "+n1.getCantidadConexiones());
        System.out.println("Valor bool conectar una vez: "+n1.conectar(n1.getCantidadConexiones(),n1.getCapacidadMax()));

        System.out.println();

        n1.conectar(n1.getCantidadConexiones(),n1.getCapacidadMax());
        System.out.println("Conectar segunda vez: "+n1.getCantidadConexiones());
        System.out.println("Valor bool conectar segunda vez vez: "+n1.conectar(n1.getCantidadConexiones(),n1.getCapacidadMax()));

        System.out.println();
        n1.desconectar(n1.getCantidadConexiones(),n1.getCapacidadMax());
        n1.desconectar(n1.getCantidadConexiones(),n1.getCapacidadMax());
        System.out.println("Valor conexiones despues de desconectar 2 veces: "+n1.getCantidadConexiones());
        System.out.println();
        n1.desconectar(n1.getCantidadConexiones(),n1.getCapacidadMax());
        System.out.println("Valor conexiones despues de desconectar una vez más: "+n1.getCantidadConexiones());
        System.out.println("Valor bool desconectar de nuevo: "+n1.desconectar(n1.getCantidadConexiones(),n1.getCapacidadMax()));
        System.out.println();
        System.out.println("Contador objetos: "+NodoRed.getContador());

        NodoRed n2 = new NodoRed(-1,-1);

        System.out.println("Identificador invalido:"+n2.getIdentificador());
        System.out.println("Capacidad Max invalida:"+n2.getCapacidadMax());
        System.out.println("Contador objetos al crear segundo objeto: "+NodoRed.getContador());




    }

}
