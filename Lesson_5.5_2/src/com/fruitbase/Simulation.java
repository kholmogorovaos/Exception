package com.fruitbase;

import com.customers.Customer;
import com.customers.FreshCustomer;
import com.customers.UniqueCustomer;
import com.fruitbase.fruits.Fruit;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Simulation {
    public static void main(String[] args) {
        if (args.length != 0) {
            FruitBase fruitBase = new FruitBase();
            boolean exportFlag = false;
            boolean importFlag = false;
            String fileName = "";

            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("-e") || args[i].equals("--export")) {
                    exportFlag = true;
                    if (i + 1 < args.length && args[i + 1].startsWith("=")) {
                        fileName = args[i + 1].substring(1);
                    }
                } else if (args[i].equals("-i") || args[i].equals("--import")) {
                    importFlag = true;
                    if (i + 1 < args.length && args[i + 1].startsWith("=")) {
                        fileName = args[i + 1].substring(1);
                    }
                }
            }
            if (exportFlag) {
                try {
                    fruitBase.exportCatalogue(fileName);
                } catch (FileNotFoundException e) {
                    System.err.println("Не найден файл " + fileName);
                } catch (IOException e) {
                    System.err.println("Ошибка при экспорте каталога в файл " + fileName);
                } catch (Exception e) {
                    System.err.println("Непредвиденная ошибка при экспорте каталога из файла " + fileName);
                }
            } else if (importFlag) {
                try {
                    fruitBase.importCatalogue(fileName);
                } catch (FileNotFoundException e) {
                    System.err.println("Не найден файл " + fileName);
                } catch (IOException e) {
                    System.err.println("Ошибка при импорте каталога из файла " + fileName);
                } catch (ClassNotFoundException e) {
                    System.err.println("Невозможно импортировать каталог из файла " + fileName + ": неподдерживаемая версия");
                } catch (Exception e) {
                    System.err.println("Непредвиденная ошибка при импорте каталога из файла " + fileName);
                }
            } else {
                Customer[] customers = {new FreshCustomer("Покупатель свежих фруктов"), new UniqueCustomer("Покупатель уникальных фруктов")};
                for (Customer customer : customers) {
                    System.out.print("Информация по грузу:" + "\n");
                    Delivery delivery = fruitBase.takeOrder(args);
                    System.out.println("Общий вес заказа: " + delivery.getTotalWeight() + " кг");
                    System.out.println("Общая стоимость заказа: " + delivery.getTotalPrice() + " у.е." + "\n");
                    List<Fruit> selectedFruits = customer.takeFruits(delivery);
                    delivery.removeFruits(selectedFruits);
                    customer.printPurchases();
                    System.out.println("Информация об оставшемся грузе: ");
                    System.out.println("Вес оставшегося груза: " + (delivery.getTotalWeight() - delivery.getRemovedWeight()) + " кг");
                    System.out.println("Сумма оставшегося груза: " + (delivery.getTotalPrice().subtract(delivery.getRemovedPrice())) + " у.е." + "\n");
                }
            }
        } else System.out.println("Запрос пустой, укажите фрукты для формирования заказа");
    }
}

