package final_project;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pizza> availablePizza;

    public Menu(List<Pizza> availablePizza) {
        this.availablePizza = availablePizza;
    }

    public Menu() {
        this.availablePizza = new ArrayList<>();
    }

    /**
     * Метод добавления пицц в меню.
     *
     * @param canBeDonePizza Пицца, которую можно приготовить/заказать.
     */
    public void addPizzaToMenu(Pizza canBeDonePizza) {
        availablePizza.add(canBeDonePizza);
    }

    /**
     * Метод получения пиццы по названию. Используется для добавления в заказ введенных пользователем пицц.
     *
     * @param name Название пиццы.
     * @return Возвращает null, если такой пиццы не существует в меню. Возвращает пиццу, если такая существует в меню.
     */
    public Pizza getPizzaByName(String name) {
        for (Pizza pizza : availablePizza) {
            if (pizza.getPizzaName().equals(name)) {
                return pizza;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Доступные пиццы к заказу:\n");
        for (Pizza pizza : availablePizza) {
            builder.append(pizza + "\n");
        }

        return builder.toString();
    }
}
