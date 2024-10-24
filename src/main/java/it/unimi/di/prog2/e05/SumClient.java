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

public class SumClient {

  /** Costruttore di default che rende la classe non istanziabile. */
  private SumClient() {}

  /**
   * Metodo che dato un array di numeri interi come parametro ne restituisce la somma di tutti i
   * valori.
   *
   * @param a l'array di cui verrà fatta la somma dei suoi valori.
   * @return la somma dei valori dell'array.
   */
  public static int sum(int[] a) {
    int somma = 0;
    for (int i = 0; i < a.length; i++) {
      somma += a[i];
    }
    return somma;
  }

  // Aggiunga qui un main che invochi il metodo sum (che può sviluppare in
  // questa o altra classe) descritto dall'esercizio 3.2 di PDJ.

  // Il main riceve un elenco di interi come parametri sulla linea di comando e
  // ne emette la somma nel flusso d'ingresso.

  /**
   * Metodo principale che riceve in input numeri interi e richiama il metodo {@code sum} per
   * sommarli.
   *
   * @param args non viene utilizzato.
   */
  public static void main(String[] args) {
    int[] values;
    values = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      values[i] = Integer.parseInt(args[i]);
    }
    System.out.println(sum(values));
  }
}
