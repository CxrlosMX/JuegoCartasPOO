/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barajacartapoo;

import javax.swing.JOptionPane;

/**
 *
 * @author El Camaleon
 */
public class Baraja implements Valores {

    private Carta[] cartas;
    private int posSiguienteCarta;

    public Baraja() {
        cartas = new Carta[Valores.NUM_CARTAS];
        posSiguienteCarta = 0;
        crearBaraja();
        barajar();
    }

    private void crearBaraja() {
        String[] palos = Carta.VALORES;
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < Valores.LIMITE_CARTAS; j++) {
               /*  if (j >= 0 && j <= 6 || j >= 9 && j <= 11) {//Opcion 1
                 cartas[j] = new Carta((j + 1), palos[i]);
                 }//opcion 1*/

                if (!(j == 7 || j == 8)) {
                    if (j >= 9) {
                        cartas[((i * (Valores.LIMITE_CARTAS - 2)) + (j - 2))] = new Carta((j + 1), palos[i]);

                    } else {
                        cartas[((i * (Valores.LIMITE_CARTAS - 2)) + j)] = new Carta(j + 1, palos[i]);
                    }
                }

            }
        }

    }

    public void barajar() {
        int pos = 0;
        Carta c;
        for (int i = 0; i > cartas.length; i++) {
           /* cartas[i] = cartas[pos];
            pos++;*/
            
             pos = Valores.generarNumerosAleatorios(0, Valores.NUM_CARTAS - 1);
             c = cartas[i];
             cartas[i] = cartas[pos];
             cartas[pos] = c;
        }
         posSiguienteCarta = 0;
    }

    public Carta siguienteCarta() {
        Carta c = null;
        if (posSiguienteCarta == Valores.NUM_CARTAS) {
            System.out.println("Ya no hay mas cartas, barajea de nuevo");
        } else {
            c = cartas[posSiguienteCarta++];
            //Esta linea aumenta el valor pero despues de asignarle el valor
            //Si queremos que aumente antes se aumenta antes pero como lo pusimos depues lo aumenta despues
        }

        return c;
    }

    public Carta[] darCartas(int numero) {
        if (numero > Valores.NUM_CARTAS) {
            System.out.println("NO se puede dar mas cartas de las que hay");
            return null;
        } else {
            if (numero > cartasDisponibles()) {
                System.out.println("No hay suficientes cartas");
                return null;
            } else {
                Carta[] cartasDar = new Carta[numero];
                for (int i = 0; i < cartasDar.length; i++) {
                    cartasDar[i] = siguienteCarta();
                }
                return cartasDar;
            }

        }

    }

    public int cartasDisponibles() {

        return (Valores.NUM_CARTAS - posSiguienteCarta);
    }

    public void cartasMonton() {
        if (cartasDisponibles() == Valores.NUM_CARTAS) {
            System.out.println("No se han sacado ninguna carta");
        } else {
            for (int i = 0; i < posSiguienteCarta; i++) {
                System.out.println(cartas[i].toString());
            }

        }
    }

    public void mostrarCartas() {
        if (cartasDisponibles() == 0) {
            System.out.println("Se han mostrado todas las cartas, no hay cartas que mostrar");
        } else {
            for (int i = posSiguienteCarta; i < cartas.length; i++) {
                System.out.println(cartas[i].toString());
            }
        }
    }
}
