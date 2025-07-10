package exercicios.ex12_1.entities;

import exercicios.ex12_1.entities.enums.OrderStatus;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.ArrayList;

public class Order {

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate moment = LocalDate.now();
    private OrderStatus orderStatus;
    private Client client;
    private ArrayList<OrderItem> orderItems = new ArrayList<>();

    // CONSTRUCTOR
    public Order(String name, String email, String birthDate, String status) {
        client = new Client(name, email, birthDate);
        this.orderStatus = OrderStatus.valueOf(status);
    }

    // SETTERS
    public void setOrderStatus(OrderStatus orderStatus) { this.orderStatus = orderStatus; }
    public void setClient(Client client) { this.client = client; }

    // GETTERS
    public LocalDate getMoment() { return moment; }
    public OrderStatus getOrderStatus() { return orderStatus; }
    public Client getClient() { return client; }
    public ArrayList<OrderItem> getOrderItems() { return orderItems; }

    // METHODS
    public void addItem(OrderItem oi) { orderItems.add(oi); }
    public void removeItem(OrderItem oi) { orderItems.remove(oi); }

    public Double total() {
        double sum = 0f;
        for (OrderItem c : orderItems) {
            sum += c.subTotal();
        }
        return sum;
    }

    public void toMessage() {
        System.out.print("\n[ ORDER SUMMARY ] \n" + "Order Moment: " + getMoment() + "\nOrderStatus: " + getOrderStatus() + "\n" + client.toString() + "\nOrder Items: \n");
        for (OrderItem c : orderItems) {
            System.out.println(c.toString());
        }
        System.out.println("TOTAL: " + total());

    }


}