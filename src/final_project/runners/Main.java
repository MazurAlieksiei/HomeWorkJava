package final_project.runners;

import final_project.ClientsReceipt;
import final_project.Menu;
import final_project.Pizza;
import final_project.Pizzeria;
import final_project.api.IPizzaMania;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addPizzaToMenu(new Pizza("Пепперони", Arrays.asList("Готовка соуса", "Готовка теста",
                "Раскатка теста, добавление соуса и масла", "Посыпка сыром, выклдывание колбасы", "Отправляем в духовку")));
        menu.addPizzaToMenu(new Pizza("Грибная", Arrays.asList("Готовка соуса", "Готовка теста",
                "Раскатка теста, добавление соуса и масла", "Посыпка сыром", "Выклдывание грибов", "Отправляем в духовку")));

        IPizzaMania pizzaMania = new Pizzeria(menu);

        System.out.println(pizzaMania.getMenu());

        Map<Pizza, Integer> myOrder = new HashMap<>();
        boolean flag = true;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите название желаемой пиццы");
            String orderedPizza = in.nextLine();

            if (orderedPizza.isBlank()) {
                System.out.println("Пустые заказы не принимаются!");
                continue;
            }

            if (menu.getPizzaByName(orderedPizza) == null) {
                System.out.println("Такой пиццы не существует");
                continue;
            }

            System.out.println("Введите желаемое количество");
            int orderedAmount = in.nextInt();
            myOrder.put(menu.getPizzaByName(orderedPizza), orderedAmount);

            System.out.println("Желаете еще добавить? да - 1, нет - 2");
            int tmp = in.nextInt();

            if (tmp != 1) {
                flag = false;
            }
        } while (flag);

        ClientsReceipt firstOrder = pizzaMania.makeNewOrder(myOrder);
        System.out.println(firstOrder);
        System.out.println(pizzaMania.getOrderInfo(firstOrder.getNumberOfOrder()));
        System.out.println(pizzaMania.getDoneOrder(firstOrder));
    }
}
