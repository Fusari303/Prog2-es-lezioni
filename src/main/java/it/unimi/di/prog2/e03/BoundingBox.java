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

/**
 * Vedi <a
 * href="https://github.com/mapio/labprog/blob/master/esercizi/bounding_box/Testo.md">testo</a>,
 */
public class BoundingBox {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int inizio = 0;
      int fine = 0;
      int j = 1;
      boolean iniziato = false;
      int min = 0;
      int max = 0;
      int lung = 0;

      while (s.hasNext()) {
        final String linea = s.nextLine();

        if (linea.contains("*") && iniziato == false) {
          inizio = j - 1;
          iniziato = true;
        }
        if (linea.contains("*")) {
          fine = j;
        }

        for (int i = 0; i < linea.length(); i++) {
          if (linea.charAt(i) == '*' && i > max) {
            max = i;
          }
          if (j == 1) {
            lung = linea.length();
          } else if (linea.charAt(i) == '*' && i < lung) {
            min = i;
            lung = min;
          }
        }
        j++;
      }
      System.out.println(fine - inizio + " " + (max - min + 1));
    }
  }
}
