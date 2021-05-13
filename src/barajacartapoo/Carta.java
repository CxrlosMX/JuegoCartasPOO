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
public class Carta implements Valores {

    private int numero;
    private String tipo;
    

    /*
     Vamos a hacer una baraja de cartas españolas orientado a objetos.
     Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas)
     La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
     */

    public Carta(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Numero=" + numero + ", tipo=" + tipo ;
    }
    
}
