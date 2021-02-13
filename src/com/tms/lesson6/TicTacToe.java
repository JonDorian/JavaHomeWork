package com.tms.lesson6;
import java.util.Scanner;

// Крестики-нолики

public class TicTacToe {
  public static void main(String[] args) {
    String[][] array = new String[3][3];
    boolean play = true;
    boolean playerHuman = false;
    boolean playerPC = false;
    int count = 9;
    String choicePC;
    String choiceHuman;
    String phraseHuman = "Вы победили! Ура! AI не удалось захватить мир!!";
    String phrasePC = "Кожанный мешок, ты проиграл! AI захватит мир!!!";

    System.out.println("Игра \"крестики-нолики\".\n" +
            "Буквы аглийские. Регистр не имеет значения.\nПроизвести выбр - играть за Х (крестик) " +
            "или за О (нолик, английская бука O).\nИгрок выбравший игру за O (нолик) ходит первым." +
            "\nНиже отображено поле для игры 3х3");

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] == null) {
          array[i][j] = " ";
        }
        System.out.print(array[i][j]);
        if (j < array[i].length - 1) {
          System.out.print(" | ");
        }
        if (j == array[i].length - 1) {
          System.out.println();
        }
      }
      if (i < array.length - 1) {
        System.out.println("----------");
      }
    }

    System.out.println("Выбери за кого будешь играть - за Х или за О: ");
    Scanner choice = new Scanner(System.in);
    String choiceConfirm = choice.nextLine();

    if (choiceConfirm.toLowerCase().equals("x")) {
      System.out.println("Компьютер ходит первым!");
      choicePC = "O";
      choiceHuman = "X";
      playerPC = true;
    } else {
      System.out.println("Вы ходите первым!");
      choiceHuman = "O";
      choicePC = "X";
      playerHuman = true;
    }

    while (play) {
      if (count == 0) {
        break;
      }
      while (playerHuman) {
        if (count == 0) {
          play = false;
          break;
        }
        System.out.println("Сделайте ход!");
        Scanner lolLine = new Scanner(System.in);
        System.out.println("Введите строку (от 1 до 3)");
        int line = lolLine.nextInt() - 1;
        Scanner lolColumn = new Scanner(System.in);
        System.out.println("Введите столбец (от 1 до 3)");
        int column = lolColumn.nextInt() - 1;

        if (array[line][column].equals(" ")) {
          array[line][column] = choiceHuman;
          count--;
          playerHuman = false;
          playerPC = true;

          for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
              System.out.print(array[i][j]);
              if (j < array[i].length - 1) {
                System.out.print(" | ");
              }
              if (j == array[i].length - 1) {
                System.out.println();
              }
            }
            if (i < array.length - 1) {
              System.out.println("----------");
            }
          }
          break;
        } else {
          System.out.println("Позиция занята, выбери другую");
        }
      }

      if (array[0][0].equals(choiceHuman) & array[0][1].equals(choiceHuman) & array[0][2].equals(choiceHuman)) {
        System.out.println(phraseHuman);
        break;
      } else if (array[1][0].equals(choiceHuman) & array[1][1].equals(choiceHuman) & array[1][2].equals(choiceHuman)) {
        System.out.println(phraseHuman);
        break;
      } else if (array[2][0].equals(choiceHuman) & array[2][1].equals(choiceHuman) & array[2][2].equals(choiceHuman)) {
        System.out.println(phraseHuman);
        break;
      } else if (array[0][0].equals(choiceHuman) & array[1][0].equals(choiceHuman) & array[2][0].equals(choiceHuman)) {
        System.out.println(phraseHuman);
        break;
      } else if (array[0][1].equals(choiceHuman) & array[1][1].equals(choiceHuman) & array[2][1].equals(choiceHuman)) {
        System.out.println(phraseHuman);
        break;
      } else if (array[0][2].equals(choiceHuman) & array[1][2].equals(choiceHuman) & array[2][2].equals(choiceHuman)) {
        System.out.println(phraseHuman);
        break;
      } else if (array[0][0].equals(choiceHuman) & array[1][1].equals(choiceHuman) & array[2][2].equals(choiceHuman)) {
        System.out.println(phraseHuman);
        break;
      } else if (array[0][2].equals(choiceHuman) & array[1][1].equals(choiceHuman) & array[2][0].equals(choiceHuman)) {
        System.out.println(phraseHuman);
        break;
      }

      while (playerPC) {
        if (count == 0) {
          play = false;
          break;
        }

        System.out.println("Компьютер (супер-мощный AI) делает ход!");
        int linePC = (int) (Math.random() * 3);
        int columnPC = (int) (Math.random() * 3);

        if (array[linePC][columnPC].equals(" ")) {
          array[linePC][columnPC] = choicePC;
          playerPC = false;
          playerHuman = true;
          count--;

          for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
              System.out.print(array[i][j]);
              if (j < array[i].length - 1) {
                System.out.print(" | ");
              }
              if (j == array[i].length - 1) {
                System.out.println();
              }
            }
            if (i < array.length - 1) {
              System.out.println("----------");
            }
          }
          break;
        } else {
          System.out.println("Позиция занята, AI выбирает другую");
        }
      }

      if (array[0][0].equals(choicePC) & array[0][1].equals(choicePC) & array[0][2].equals(choicePC)) {
        System.out.println(phrasePC);
        break;
      } else if (array[1][0].equals(choicePC) & array[1][1].equals(choicePC) & array[1][2].equals(choicePC)) {
        System.out.println(phrasePC);
        break;
      } else if (array[2][0].equals(choicePC) & array[2][1].equals(choicePC) & array[2][2].equals(choicePC)) {
        System.out.println(phrasePC);
        break;
      } else if (array[0][0].equals(choicePC) & array[1][0].equals(choicePC) & array[2][0].equals(choicePC)) {
        System.out.println(phrasePC);
        break;
      } else if (array[0][1].equals(choicePC) & array[1][1].equals(choicePC) & array[2][1].equals(choicePC)) {
        System.out.println(phrasePC);
        break;
      } else if (array[0][2].equals(choicePC) & array[1][2].equals(choicePC) & array[2][2].equals(choicePC)) {
        System.out.println(phrasePC);
        break;
      } else if (array[0][0].equals(choiceHuman) & array[1][1].equals(choiceHuman) & array[2][2].equals(choicePC)) {
        System.out.println(phrasePC);
        break;
      } else if (array[0][2].equals(choicePC) & array[1][1].equals(choicePC) & array[2][0].equals(choicePC)) {
        System.out.println(phrasePC);
        break;
      }
    }
    System.out.println("Игра окончена!");
  }
}