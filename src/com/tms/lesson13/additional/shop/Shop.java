package com.tms.lesson13.additional.shop;
import java.util.ArrayList;
import java.util.List;

// Дополнительное задание lesson13 "Магазин".
// Создать класс Магазин, поля:
//•Список товаров (изначально пустой)
//методы:
//•добавить товар(принимает объект товара и добавляет его в список товаров). При попытке добавить товар с id уже существующем в списке, вставка производится не должна
//•получить все товары(метод ВОЗВРАЩАЕТ список всех товаров в магазине)
//•удалить товар (метод принимает id товара и удаляет из списка товар с соответствующим id)
//•редактировать товар(принимает объект товара и редактирует им список товаров)

public class Shop {
  List<Product> productsList = new ArrayList<>();

  public void setProductInList(Product product) {
    boolean setPermission = true;
    for (Product value : productsList) {
      if (product.getId() == value.getId()) {
        System.out.println("Товар с ID " + product.getId() + " уже есть в магазаине! (введидите другой ID и повторите попытку)\n");
        setPermission = false;
        break;
      }
    }
    if (setPermission) {
      productsList.add(product);
    }
  }

  public List<Product> getProductsList() {
    return productsList;
  }

  public void removeProduct(int id) {
    for (int i = 0; i < productsList.size(); i++) {
      if (productsList.get(i).getId() == id) {
        productsList.remove(i);
      }
    }
  }

  public void editProduct(Product product, String name, int price, int id) {
    boolean success = false;
    String tempName = product.getName();
    for (Product value : getProductsList()) {
      if (product.getId() == value.getId()) {
        product.setName(name);
        product.setPrice(price);
        product.setId(id);
        success = true;
        break;
      }
    }
    if (success) {
      System.out.println("Товар " + tempName + " успешно отредактирован! теперь это " + product.getName() + "!\n");
    } else {
      System.out.println("В списке нет такого товара(\n");
    }
  }

  public void sortProductsListByPrice() {
    List<Product> sortedList = getProductsList();
    for (int i = 0; i < sortedList.size() - 1; i++) {
      for (int j = 0; j < sortedList.size() - 1 - i; j++) {
        if (sortedList.get(j).getPrice() > sortedList.get(j + 1).getPrice()) {
          Product temp = sortedList.get(j);
          sortedList.set(j, sortedList.get(j + 1));
          sortedList.set(j + 1, temp);
        }
      }
    }
  }

  public void sortProductsListByAdded() {
    List<Product> sortedList = getProductsList();
    for (int i = 0; i < sortedList.size() / 2; i++) {
      Product temp = sortedList.get(i);
      sortedList.set(i, sortedList.get(sortedList.size() - 1 - i));
      sortedList.set(sortedList.size() - 1 - i, temp);
    }
  }

  public void printProductsList() {
    for (Product product : getProductsList()) {
      System.out.println("Название продута: " + product.getName() + ", ID: " + product.getId() + ", цена: "
              + product.getPrice() + "$");
    }
    System.out.println();
  }
}