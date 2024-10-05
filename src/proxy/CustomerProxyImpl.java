package proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {

    CustomerImpl customer = new CustomerImpl();

    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrder() {
        ArrayList<Order> arrayList = new ArrayList<>();
        Order order = new Order();

        order.setId(1);
        order.setProductName("Apple");
        order.setQuantity(2);

        Order order2 = new Order();
        order2.setId(2);
        order2.setProductName("Mango");
        order2.setQuantity(3);

        arrayList.add(order);
        arrayList.add(order2);

        return arrayList;
    }
}
