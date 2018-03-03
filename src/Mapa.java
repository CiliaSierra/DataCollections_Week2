package src;

import java.util.logging.*;
public class Mapa {

    Celda[][] celdas;
    String nombre;
    int altura;
    int anchura;

    Logger logger = Logger.getLogger(Mapa.class.getName());

    public Mapa(int altura, int anchura){
        this.celdas = new Celda[altura][anchura];
        this.altura = altura;
        this.anchura = anchura;
    }

    public boolean llenarMapa(Celda... celdasArg){
        if(celdas.length == altura*anchura){
            logger.warning("El número de celdas no coincide con las dimensiones del mapa");
            return false;
        }
        for(int i = 0; i<altura; i++){
            for(int j = 0; j<anchura; j++){
                celdas[i][j] = celdasArg[i*anchura+j];
            }
        }
        return true;
    }
    public void mostrarMapa (){
        for(int i = 0; i<celdas.length; i++){
            for (int j=0; j<celdas[0].length;j++) {
                    System.out.print(celdas[i][j].letra());
            }
            System.out.println();
        }
    }

}
