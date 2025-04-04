class Product {
    Product() {
        System.out.println("Product initialized.");
    }

    void productInfo() {
        System.out.println("Product: Smartwatch");
    }
}

class Order extends Product {
    Order() {
        System.out.println("Order placed successfully.");
    }

    void orderStatus() {
        System.out.println("Status: Confirmed");
    }
}

class Delivery extends Order {
    Delivery() {
        System.out.println("Delivery process started.");
    }

    void trackOrder() {
        System.out.println("Tracking: Out for Delivery");
    }
}

public class ECommerce {
    public static void main(String[] args) {
        Delivery d = new Delivery();
        d.productInfo();
        d.orderStatus();
        d.trackOrder();
    }
}
