import algoritmoGenetico.AlgoritmoGenetico;
import estructuras.Contenedor;
import estructuras.Cromosoma;
import estructuras.Paquete;
import estructuras.Rotacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Paquete> paquetes = new ArrayList<>();
        ArrayList<Contenedor> contenedores = new ArrayList<>();
        ArrayList<Contenedor> solucion;
        paquetes.add(new Paquete("P1",4,2,7,2,1000,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(4,2,5,2)))));
        paquetes.add(new Paquete("P2",5,2,2,2,4,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(5,2,2,2)))));
        paquetes.add(new Paquete("P3",3,5,1,2,10,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(1,1,1,2)))));
        paquetes.add(new Paquete("P4",5,5,5,2,2,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(5,5,5,2)))));
        paquetes.add(new Paquete("P5",6,7,3,2,10,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(4,2,5,2)))));
        paquetes.add(new Paquete("P6",4,2,7,2,1000,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(4,2,5,2)))));
        paquetes.add(new Paquete("P7",4,2,7,2,1000,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(4,2,5,2)))));
        paquetes.add(new Paquete("P8",4,2,7,2,1000,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(4,2,5,2)))));
        paquetes.add(new Paquete("P9",4,2,7,2,1000,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(4,2,5,2)))));
        paquetes.add(new Paquete("P10",4,2,7,2,1000,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(4,2,5,2)))));
        paquetes.add(new Paquete("P12",4,2,7,2,1000,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(4,2,5,2)))));
        paquetes.add(new Paquete("P13",4,2,7,2,1000,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(4,2,5,2)))));
        paquetes.add(new Paquete("P14",4,2,7,2,1000,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(4,2,5,2)))));
        paquetes.add(new Paquete("P15",4,2,7,2,1000,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(4,2,5,2)))));
        paquetes.add(new Paquete("P16",4,2,7,2,1000,new ArrayList<Rotacion>(Arrays.asList(new Rotacion(4,2,5,2)))));

        contenedores.add(new Contenedor(5,20,10,100000));
        contenedores.add(new Contenedor(5,10,5,50000));
        AlgoritmoGenetico alg = new AlgoritmoGenetico();
        solucion=alg.ejecutarAlgoritmoGenetico(paquetes,contenedores,15,50,30,0.85f,
                0.7f,2,0.7f,1,2);
    }

}
