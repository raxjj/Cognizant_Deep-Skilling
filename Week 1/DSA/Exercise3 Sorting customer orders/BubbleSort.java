public class BubbleSort {

    static void sort(Order[] customerOrders) {

        int totalOrders =
                customerOrders.length;


        for (int firstIndex = 0;
             firstIndex < totalOrders - 1;
             firstIndex++) {


            for (int secondIndex = 0;
                 secondIndex < totalOrders - firstIndex - 1;
                 secondIndex++) {


                if (customerOrders[secondIndex].totalPrice
                        > customerOrders[secondIndex + 1].totalPrice) {


                    Order temporaryOrder =
                            customerOrders[secondIndex];


                    customerOrders[secondIndex]
                            = customerOrders[secondIndex + 1];


                    customerOrders[secondIndex + 1]
                            = temporaryOrder;
                }
            }
        }
    }
}