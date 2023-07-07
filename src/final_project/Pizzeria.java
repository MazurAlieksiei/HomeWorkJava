package final_project;

import final_project.api.IPizzaMania;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Pizzeria implements IPizzaMania {

    private Menu menu;
    private List<Order> orders;

    public Pizzeria(Menu menu) {
        this.menu = menu;
        this.orders = new ArrayList<>();
    }

    /**
     * Метод получения списка доступных к заказу пицц(меню).
     *
     * @return Возвращает строку с доступными к заказу пиццами.
     */
    @Override
    public String getMenu() {
        return menu.toString();
    }

    /**
     * Метод оформления нового заказа.
     *
     * @param pizzas Пиццы, желаемые к заказу и их количество.
     * @return Возвращает квиток, с номером заказа и временем.
     */
    @Override
    public ClientsReceipt makeNewOrder(Map<Pizza, Integer> pizzas) {
        LocalTime time = LocalTime.now();
        Order order = new Order(pizzas, orders.size() + 1, time);
        orders.add(order);

        return new ClientsReceipt(order.getId(), time.toString());
    }

    /**
     * Метод получения информации о заказе.
     *
     * @param orderId Номер заказа.
     * @return Возвращает строку стадий готовности заказа.
     */
    @Override
    public String getOrderInfo(int orderId) {
        Order order = getOrderIfExists(orderId);

        if (order == null) {
            return "Такого заказа не существует!";
        }

        return order.make();
    }

    /**
     * Метод получения заказа.
     *
     * @param receipt Квиток, с номером заказа.
     * @return Возвращает строку с готовым заказом.
     */
    @Override
    public String getDoneOrder(ClientsReceipt receipt) {
        Order order = getOrderIfExists(receipt.getNumberOfOrder());

        if (order == null) {
            return "Такого заказа не существует!";
        }

        if (!order.isReady()) {
            return "Заказ еще готовится!";
        }

        return order.toString();
    }

    /**
     * Метод получения заказа из списка по номеру, если он существует.
     *
     * @param orderId Номер заказа.
     * @return Возвращает null, если такого заказа не существует. Возвращает заказ, если такой заказ существует.
     */
    private Order getOrderIfExists(int orderId) {
        for (Order order : orders) {
            if (order.getId() == orderId) {
                return order;
            }
        }

        return null;
    }
}
