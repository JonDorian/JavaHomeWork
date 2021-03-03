package com.tms.lesson13.additional.shop;

//В main:
//•создаем объект магазина
//•создаем пару тройку товаров и добавляем эти товары в магазин
//•получаем список товаров из магазина, сортируем по цене(по возрастанию) и выводим в консоль.
//•удаляем один товар
//•получаем список товаров из магазина, сортируем по порядку добавления(последние добавленные в начале) и выводим в консоль.
//•редактируем один товар
//•получаем список товаров и выводим в консоль

public class ShopRunner {
  public static void main(String[] args) {
    Shop shop = new Shop();
    Product chips = new Product();
    Product beer = new Product("Пиво", 33, 9);
    Product bread = new Product("Хлеб", 21, 5);
    Product breadTwo = new Product("Батон", 21, 3);
    Product juice = new Product("Сок", 67, 7);

    shop.setProductInList(chips);
    shop.setProductInList(beer);
    shop.setProductInList(bread);
    shop.setProductInList(breadTwo);
    shop.setProductInList(juice);
    shop.printProductsList();

    shop.sortProductsListByPrice();
    shop.printProductsList();

    shop.removeProduct(21);
    shop.printProductsList();

    shop.sortProductsListByAdded();
    shop.printProductsList();

    shop.editProduct(juice, "Газировка", 3, 44);
    shop.printProductsList();
  }
}