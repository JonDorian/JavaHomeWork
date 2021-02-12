package com.tms.lesson10.task25;

//Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
//количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию снимающую
//деньги. На вход передается сумма денег. На выход – булевское значение (операция удалась или нет). При снятии денег
//функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
//Создать конструктор с тремя параметрами – количеством купюр.

public class ATM {
  private int amountTwentyDollars;
  private int amountFiftyDollars;
  private int amountOneHundredDollars;
  private int totalMoney;
  private boolean operationSuccessful;

  ATM(int amountTwentyDollars, int amountFiftyDollars, int amountOneHundredDollars) {
    this.amountTwentyDollars = amountTwentyDollars;
    this.amountFiftyDollars = amountFiftyDollars;
    this.amountOneHundredDollars = amountOneHundredDollars;
    setTotalMoney();
  }

  public void addMoney(int par) {
    switch (par) {
      case 20:
        System.out.println("Вы внесли 20 долларов!");
        amountTwentyDollars++;
        break;
      case 50:
        amountFiftyDollars++;
        System.out.println("Вы внесли 50 долларов!");
        break;
      case 100:
        amountOneHundredDollars++;
        System.out.println("Вы внесли 100 долларов!");
        break;
      default:
        System.out.println("Внесеная купюра не поддерживаемая банкоматом! Попробуйте внести другую купюру - 20, 50 или 100.");
    }
    setTotalMoney();
  }

  private void setTotalMoney() {
    totalMoney = (amountTwentyDollars * 20) + (amountFiftyDollars * 50) + (amountOneHundredDollars * 100);
  }

  public void getTotalMoney() {
    setTotalMoney();
    System.out.println("Общая сумма наличных в банкомате: " + totalMoney);
  }

  public void getResult() {
    if (operationSuccessful) {
      System.out.println("Операция выполнена успешно!");
    } else {
      System.out.println("Операция завершилась неудачей, попробуйте еще раз!");
    }
  }

  public boolean cashWithdrawal(int withdrawalAmount) {
    final int twentyDollars = 20;
    final int fiftyDollars = 50;
    final int oneHundredDollars = 100;
    int factor;
    int counter = 0;
    int exceptionTen = 0;
    int exceptionThirty = 0;

    int tempTwenty, tempFifty, tempHundred, residue;

    System.out.println("Желаемая сумма выдачи наличных: " + withdrawalAmount);

    if (withdrawalAmount > totalMoney || withdrawalAmount % 10 != 0 || withdrawalAmount < 20 || withdrawalAmount == 30) {
      System.out.println("К сожалнению, такой суммы денег в банкомате нет, либо желаемая купюра не поддерживается. Попробуйте ввести другую сумму денег или купюру.");
      return operationSuccessful = false;
    } else {
      while (withdrawalAmount > 0) {
        tempTwenty = withdrawalAmount / 20;
        tempFifty = withdrawalAmount / 50;
        tempHundred = withdrawalAmount / 100;

        if (tempHundred <= amountOneHundredDollars && tempHundred * 100 == withdrawalAmount) {
          amountOneHundredDollars -= tempHundred;
          System.out.println("Снято: " + tempHundred + " стодолларовых(ая) купюра(ы)");
          return operationSuccessful = true;
        } else if (tempFifty <= amountFiftyDollars && tempFifty * 50 == withdrawalAmount) {
          amountFiftyDollars -= tempFifty;
          System.out.println("Снято: " + tempFifty + " пятидесятидолларовых(ая) купюра(ы)");
          return operationSuccessful = true;
        } else if (tempTwenty <= amountTwentyDollars && tempTwenty * 20 == withdrawalAmount) {
          amountTwentyDollars -= tempTwenty;
          System.out.println("Снято: " + tempTwenty + " двадцатидолларовых(ая) купюра(ы)");
          return operationSuccessful = true;
        }

        residue = withdrawalAmount % 100;

        if (residue == 10) {
          exceptionTen++;
          withdrawalAmount -= twentyDollars;
          residue = withdrawalAmount % 100;
        }
        if (residue == 30) {
          exceptionThirty++;
          withdrawalAmount -= fiftyDollars;
          residue = withdrawalAmount % 100;
        }

        while (residue % 20 != 0) {
          residue -= fiftyDollars;
          counter++;
          break;
        }

        if (residue % twentyDollars == 0 & residue != 0) {
          factor = residue / twentyDollars;
          if (exceptionTen > 0) {
            factor++;
          }
          if (factor <= amountTwentyDollars) {
            if (exceptionTen > 0) {
              withdrawalAmount += twentyDollars;
            }
            withdrawalAmount -= factor * twentyDollars;
            amountTwentyDollars -= factor;
            System.out.println("Снято: " + factor + " двадцатидолларовых(ая) купюра(ы)");
          } else {
            System.out.println("Данную сумму невозможно получить из оставшихся в  банкомате денег(");
            return operationSuccessful = false;
          }
        }

        if (exceptionThirty > 0) {
          residue += twentyDollars;
        }
        if (residue % fiftyDollars == 0) {
          factor = (residue / fiftyDollars) + counter;
          if (exceptionThirty > 0) {
            factor--;
          }
          if (factor <= amountFiftyDollars) {
            if (exceptionThirty > 0) {
              withdrawalAmount += fiftyDollars;
            }
            withdrawalAmount -= factor * fiftyDollars;
            amountFiftyDollars -= factor;
            System.out.println("Снято: " + factor + " пятидесятидолларовых(ая) купюра(ы)");
          } else {
            System.out.println("Данную сумму невозможно получить из оставшихся в  банкомате денег(");
            return operationSuccessful = false;
          }
        }

        if (withdrawalAmount % oneHundredDollars == 0 & withdrawalAmount != 0) {
          factor = withdrawalAmount / oneHundredDollars;
          if (factor <= amountOneHundredDollars) {
            withdrawalAmount -= factor * oneHundredDollars;
            amountOneHundredDollars -= factor;
            System.out.println("Снято: " + factor + " стодолларовых(ая) купюра(ы)");
          } else {
            System.out.println("Данную сумму невозможно получить из оставшихся в  банкомате денег(");
            return operationSuccessful = false;
          }
        }
      }
      if (withdrawalAmount == 0) {
        return operationSuccessful = true;
      } else {
        return operationSuccessful = false;
      }
    }
  }
}