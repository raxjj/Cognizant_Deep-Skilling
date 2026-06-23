public class BinarySearch {

    static Product search(Product[] sortedProducts,
                          int targetProductId) {

        int left = 0;

        int right = sortedProducts.length - 1;


        while (left <= right) {

            int middle =
                    left + (right - left) / 2;


            if (sortedProducts[middle].productId
                    == targetProductId) {

                return sortedProducts[middle];
            }


            if (sortedProducts[middle].productId
                    < targetProductId) {

                left = middle + 1;
            }

            else {

                right = middle - 1;
            }
        }

        return null;
    }
}