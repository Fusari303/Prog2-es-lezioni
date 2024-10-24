/*

Copyright 2024 Massimo Santini

This file is part of "Programmazione 2 @ UniMI" teaching material.

This is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This material is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this file.  If not, see <https://www.gnu.org/licenses/>.

*/

import java.util.Scanner;

/** Esercizio 3.1 di PDJ. */
public class GcdClient {

  /** Costruttore di default che rende la classe non istanziabile */
  private GcdClient() {}

  // Aggiunga qui un main che invochi il metodo gcd (che può sviluppare in
  // questa o altra classe) descritto dall'esercizio 3.1 di PDJ.

  // Il main legge dal flusso di ingresso coppie di numeri ed emette nel flusso
  // d'uscita il loro gcd.

  /**
   * Metodo principale che dato un flusso di numeri interi in ingresso stampa il massimo comune
   * divisore tra di loro
   *
   * @param args non utilizzato
   */
  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      while (s.hasNext()) {
        String linea = s.nextLine();
        String[] valori = linea.split(" ");
        for (int i = 0; i < valori.length; i += 2) {
          int n0 = Integer.parseInt(valori[i]);
          int n1 = Integer.parseInt(valori[i + 1]);
          int min = 0;
          int gcd = 0;
          if (n0 < n1) {
            min = n0;
          } else {
            min = n1;
          }
          for (int j = 1; j <= min; j++) {
            if (n0 % j == 0 && n1 % j == 0) {
              gcd = j;
            }
          }
          System.out.println(gcd);
        }
      }
    }
  }
}
