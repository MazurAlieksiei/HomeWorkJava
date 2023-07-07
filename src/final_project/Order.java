package final_project;

import java.time.LocalTime;
import java.util.Map;


public class Order {

    private int id;
    private LocalTime startTime;
    private Map<Pizza, Integer> needToBeDone;
    private boolean isReady; //маркер готовности заказа

    public Order(Map<Pizza, Integer> needToBeDone, int id, LocalTime startTime) {
        this.needToBeDone = needToBeDone;
        this.id = id;
        this.startTime = startTime;
        this.isReady = false;
    }

    public int getId() {
        return id;
    }

    public boolean isReady() {
        return isReady;
    }

    /**
     * Метод приготовления пиццы. Формирует строку из стадий приготовления пиццы.
     *
     * @return Возвращает строку из стадий приготовления пиццы.
     */
    public String make() {
        StringBuilder builder = new StringBuilder("Заказ " + id + " принят " + startTime + "\n");
        LocalTime time = startTime;

        for (Pizza pizza : needToBeDone.keySet()) {
            for (int i = 0; i < needToBeDone.get(pizza); i++) {
                builder.append(pizza.make(time));
                time = time.plusMinutes(pizza.getStagesCount() + 1);
            }
        }

        builder.append("Заказ пакуется " + time + "\n" + "Заказ готов " + time.plusMinutes(1));
        isReady = true;

        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Заказ " + id + " :\n");

        for (Pizza pizza : needToBeDone.keySet()) {
            builder.append(pizza + " " + needToBeDone.get(pizza).toString() + "\n");
        }

        return builder.toString();
    }
}
