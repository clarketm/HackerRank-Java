import java.util.*;

// HackerRank
// https://www.hackerrank.com/challenges/jim-and-the-orders

public class JimAndTheOrders {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Map<String, Integer>> orders = new ArrayList<>();

        for (int c_i = 0; c_i < n; c_i++) {
            Map<String, Integer> order = new HashMap<>();
            order.put("orderNumber", c_i + 1);
            order.put("orderFulfillment", in.nextInt() + in.nextInt());
            orders.add(order);
        }

        orders.sort((map1, map2) -> {
            if (map1.get("orderFulfillment") > map2.get("orderFulfillment")) {
                return +1;
            } else if (map1.get("orderFulfillment") < map2.get("orderFulfillment")) {
                return -1;
            } else {
                return 0;
            }
        });

        for (Map<String, Integer> order : orders) {
            int orderNumber = order.get("orderNumber");
            System.out.printf("%d ", orderNumber);
        }
    }

}
