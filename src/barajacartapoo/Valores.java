/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barajacartapoo;

/**
 *
 * @author El Camaleon
 */
public interface Valores {

    public static final String[] VALORES = {"ESPADAS", "BASTOS", "OROS", "COPAS"};
    public static final int NUM_CARTAS = 40;
    public static final int LIMITE_CARTAS = 12;

    //Vamos a crear un metodo para crear numeros aleatorios 

    public static int generarNumerosAleatorios(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;

    }
}
