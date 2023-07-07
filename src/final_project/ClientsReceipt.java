package final_project;


public class ClientsReceipt {
    private int numberOfOrder;
    private String receiptIssuanceTime;

    public ClientsReceipt(int numberOfOrder, String receiptIssuanceTime) {
        this.numberOfOrder = numberOfOrder;
        this.receiptIssuanceTime = receiptIssuanceTime;

    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    @Override
    public String toString() {
        return "Заказ " + numberOfOrder + " " + receiptIssuanceTime;
    }
}
