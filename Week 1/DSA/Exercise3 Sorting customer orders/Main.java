public class Main {

    public static void main(String[] args) {


        Order[] bubbleOrders = {

                new Order(
                        101,
                        "Raj",
                        2500
                ),

                new Order(
                        102,
                        "Aman",
                        8000
                ),

                new Order(
                        103,
                        "Neha",
                        4000
                )
        };


        BubbleSort.sort(bubbleOrders);



        Order[] quickOrders = {

                new Order(
                        101,
                        "Raj",
                        2500
                ),

                new Order(
                        102,
                        "Aman",
                        8000
                ),

                new Order(
                        103,
                        "Neha",
                        4000
                )
        };


        QuickSort.sort(
                quickOrders,
                0,
                quickOrders.length - 1
        );
    }
}