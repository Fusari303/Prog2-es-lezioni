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

public class IsPrimeClient {

  /** Costruttore di default che rende la classe non istanziabile */
  private IsPrimeClient() {}

  // Aggiunga qui un main che invochi il metodo isPrime (che può sviluppare in
  // questa o altra classe) descritto dall'esercizio 3.3 di PDJ.

  // Il main riceve un intero come parametro sulla linea di comando ed emette
  // "true" nel flusso d'uscita se e solo se esso è primo.

  /**
   * Metodo principale che riceve come argomento un numero intero. Controlla se il numero è primo,
   * cioè se è divisibile solo per 1 e per se stesso. In tal caso stampa true, altrimenti, se non
   * primo, non stampa nulla.
   *
   * @param args numero intero da utilizzare nel metodo.
   */
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    boolean primo = true;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        primo = false;
      }
    }
    if (primo) {
      System.out.println(primo);
    }
  }
}
