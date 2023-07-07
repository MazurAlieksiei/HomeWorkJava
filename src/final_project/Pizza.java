package final_project;

import java.time.LocalTime;
import java.util.List;

public class Pizza {
    private String pizzaName;

    private List<String> cookingStages;

    public Pizza(String pizzaName, List<String> cookingStages) {
        this.pizzaName = pizzaName;
        this.cookingStages = cookingStages;
    }

    /**
     * Метод приготовления пиццы. Формирует строку из стадий приготовления пиццы и времени этих стадий.
     *
     * @param time Время формирования заказа.
     * @return Возвращает строку из стадий приготовления пиццы.
     */
    public String make(LocalTime time) {
        LocalTime cookingTime = time;
        StringBuilder builder = new StringBuilder("Делаем пиццу " + pizzaName + "\n");

        for (String stage : cookingStages) {
            cookingTime = cookingTime.plusMinutes(1);
            builder.append(stage + " " + cookingTime + "\n");
        }

        builder.append("Пицца готова " + cookingTime.plusMinutes(1) + "\n");

        return builder.toString();
    }

    /**
     * Метод подсчета количества стадий приготовления.
     *
     * @return Количество стадий.
     */
    public int getStagesCount() {
        return cookingStages.size();
    }

    public String getPizzaName() {
        return pizzaName;
    }

    @Override
    public String toString() {
        return pizzaName;
    }
}
