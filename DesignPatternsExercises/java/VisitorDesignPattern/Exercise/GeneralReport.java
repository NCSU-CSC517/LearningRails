public class GeneralReport implements Visitor {
    private int customersNumber;
    private int ordersNumber;

    @Override
    public void visit(__________(4)__________ customer) {
        System.out.println("Customer: " + customer.getName());
        customersNumber++;
    }

    @Override
    public void visit(__________(5)__________ order) {
        System.out.println("    " + order.getName());
        System.out.println("    Items:");
        for (String item : order.getItems())
            System.out.println("        " + item);
        ordersNumber++;
    }

    public void __________(6)__________() {
        System.out.println("Number of customers: " + customersNumber);
        System.out.println("Number of orders:    " + ordersNumber);
    }
}
