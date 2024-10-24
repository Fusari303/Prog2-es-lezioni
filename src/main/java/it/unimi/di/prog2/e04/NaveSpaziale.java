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

public class NaveSpaziale {

  /** . */
  private NaveSpaziale() {}

  /**
   * Funzione principale di Java, viene lanciata in automatico dalla JVM
   *
   * @param args array di stringhe in input passate da linea di comando
   */
  public static void main(String[] args) {
    int from = Integer.parseInt(args[0]);
    int to = Integer.parseInt(args[1]);
    int tmp = to;
    String sequenza = "";

    while (tmp != from) {
      if (tmp < from * 4) {
        tmp--;
        sequenza += "P";
      } else {
        while (tmp % 4 != 0) {
          tmp--;
          sequenza += "P";
        }
        tmp /= 4;
        sequenza += "S";
      }
    }

    String seqInversa = "";
    for (int i = sequenza.length() - 1; i >= 0; i--) {
      seqInversa += sequenza.charAt(i);
    }
    System.out.println(seqInversa);
  }

  // Se String[] args è il vettore che contiene gli argomenti sulla linea
  // di comando, potete convertire i primi due in numeri interi con le
  // dichiarazioni (e inizializzazioni) seguenti
  //
  // int from = Integer.parseInt(args[0]);
  // int to = Integer.parseInt(args[1]);
  //
  // non c'è bisogno di importare alcun package per poter usare Integer.

}
