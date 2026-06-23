public class QuickSort {


    static void sort(Order[] customerOrders,
                     int start,
                     int end) {

        if (start < end) {

            int pivotPosition =
                    partition(
                            customerOrders,
                            start,
                            end
                    );


            sort(
                    customerOrders,
                    start,
                    pivotPosition - 1
            );


            sort(
                    customerOrders,
                    pivotPosition + 1,
                    end
            );
        }
    }



    static int partition(Order[] customerOrders,
                         int start,
                         int end) {

        double pivotPrice =
                customerOrders[end].totalPrice;


        int smallerIndex =
                start - 1;


        for (int currentIndex = start;
             currentIndex < end;
             currentIndex++) {


            if (customerOrders[currentIndex]
                    .totalPrice
                    < pivotPrice) {


                smallerIndex++;


                Order temporaryOrder =
                        customerOrders[smallerIndex];


                customerOrders[smallerIndex]
                        = customerOrders[currentIndex];


                customerOrders[currentIndex]
                        = temporaryOrder;
            }
        }


        Order temporaryOrder =
                customerOrders[smallerIndex + 1];


        customerOrders[smallerIndex + 1]
                = customerOrders[end];


        customerOrders[end]
                = temporaryOrder;


        return smallerIndex + 1;
    }
}