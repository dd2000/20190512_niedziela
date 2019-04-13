package pl.sda.inner;

import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;

public class Samples {
    public static void main(String[] args) {
        List<Product> products = Lists.newArrayList(
                new Product(3, "Radio"),
                new Product(5, "TV"),
                new Product(1, "TV"),
                new Product(2, "Laptop"),
                new Product(4, "XBox")
        );

        //klasa zwykła zewnętrzna
        ProductBaseComparator baseComparator = new ProductBaseComparator();
        products.sort(baseComparator);
        System.out.println("products(baseComparator) = " + products);

        //kilka klas w jednym pliku
        ProductComparatorsByIdReversed comparatorsByIdReversed = new ProductComparatorsByIdReversed();
        products.sort(comparatorsByIdReversed);
        System.out.println("products(comparatorsByIdReversed) = " + products);

        ProductComparatorsByName productComparatorsByName = new ProductComparatorsByName();
        products.sort(productComparatorsByName);
        System.out.println("products(productComparatorsByName) = " + products);

        //klasa statyczna wewnętrzna
        Product.ByNameReversed byNameReversed = new Product.ByNameReversed();
        products.sort(byNameReversed);
        System.out.println("products(byNameReversed) = " + products);

        //klasa zwykła wewnętrzna
        Product product = new Product(100, "");
        Product.ByNameAndId byNameAndId = product.new ByNameAndId();
        products.sort(byNameAndId);
        System.out.println("products(byNameAndId) = " + products);

        //anonimowa klasa zagnieżdżona
        Comparator<Product> nestedComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId() - o2.getId();
            }
        };
        products.sort(nestedComparator);
        System.out.println("products(nestedComparator) = " + products);

        //lambda
        Comparator<Product> lambdaComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        products.sort(lambdaComparator);
        System.out.println("products(lambdaComparator) = " + products);

        Comparator<Product> lambdaComparator2 = Samples::compare1;
        products.sort(lambdaComparator);
        System.out.println("products(lambdaComparator) = " + products);
    }

    public static int compare1(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}