package final_project.api;

import final_project.ClientsReceipt;
import final_project.Pizza;

import java.util.Map;

public interface IPizzaMania {

    /**
     * Метод получения списка доступных к заказу пицц(меню).
     *
     * @return Возвращает строку с доступными к заказу пиццами.
     */
    String getMenu();

    /**
     * Метод оформления нового заказа.
     *
     * @param pizzas Пиццы, желаемые к заказу и их количество.
     * @return Возвращает квиток, с номером заказа и временем.
     */
    ClientsReceipt makeNewOrder(Map<Pizza, Integer> pizzas);

    /**
     * Метод получения информации о заказе.
     *
     * @param orderId Номер заказа.
     * @return Возвращает строку стадий готовности заказа.
     */
    String getOrderInfo(int orderId);

    /**
     * Метод получения заказа.
     *
     * @param receipt Квиток, с номером заказа.
     * @return Возвращает строку с готовым заказом.
     */
    String getDoneOrder(ClientsReceipt receipt);
}
