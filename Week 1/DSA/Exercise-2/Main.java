public class Main {

    public static void main(String[] args) {


        // Array for Linear Search

        Product[] products = {

                new Product(
                        103,
                        "Keyboard",
                        "Electronics"
                ),

                new Product(
                        101,
                        "Mouse",
                        "Electronics"
                ),

                new Product(
                        104,
                        "Notebook",
                        "Stationery"
                ),

                new Product(
                        102,
                        "Bottle",
                        "Accessories"
                )
        };


        // Sorted Array for Binary Search

        Product[] sortedProducts = {

                new Product(
                        101,
                        "Mouse",
                        "Electronics"
                ),

                new Product(
                        102,
                        "Bottle",
                        "Accessories"
                ),

                new Product(
                        103,
                        "Keyboard",
                        "Electronics"
                ),

                new Product(
                        104,
                        "Notebook",
                        "Stationery"
                )
        };


        Product linearResult =
                LinearSearch.search(
                        products,
                        104
                );


        Product binaryResult =
                BinarySearch.search(
                        sortedProducts,
                        104
                );


        if (linearResult != null) {

            System.out.println(
                    "Linear Search Found : "
                    + linearResult.productName
            );
        }


        if (binaryResult != null) {

            System.out.println(
                    "Binary Search Found : "
                    + binaryResult.productName
            );
        }
    }
}