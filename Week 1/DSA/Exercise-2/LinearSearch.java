public class LinearSearch {

    static Product search(Product[] products,
                          int targetProductId) {

        for (Product currentProduct : products) {

            if (currentProduct.productId
                    == targetProductId) {

                return currentProduct;
            }
        }

        return null;
    }
}