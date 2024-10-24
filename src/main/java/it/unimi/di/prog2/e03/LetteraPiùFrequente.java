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

import java.util.HashMap;
import java.util.Scanner;

/**
 * Vedi <a
 * href="https://github.com/mapio/labprog/blob/master/esercizi/lettera_piu_frequente/Testo.md">testo</a>,
 */
public class LetteraPiùFrequente {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      HashMap<Character, Integer> lettere = new HashMap<Character, Integer>();
      while (s.hasNext()) {
        final String parola = s.nextLine();
        for (int i = 0; i < parola.length(); i++) {
          int count = 0;
          if (lettere.containsKey(parola.charAt(i))) {
            count = lettere.get(parola.charAt(i));
          }
          lettere.put(parola.charAt(i), count + 1);
        }
      }
      lettere.remove(' ');

      int max = 0;
      for (var entry : lettere.entrySet()) {
        if (entry.getValue() > max) {
          max = entry.getValue();
        }
      }
      System.out.println(max);
    }
  }
}
