package javacollectionsstreams.java8features.level2;

import java.util.*;
import java.util.stream.*;

class Sale {
    int productId, quantity;
    double price;

    Sale(int productId,int quantity,double price){
        this.productId=productId; this.quantity=quantity; this.price=price;
    }
}

class ProductSales {
    int productId;
    double revenue;
    ProductSales(int id,double rev){productId=id;revenue=rev;}
}

public class ProductSalesAnalysis {

    public static void main(String[] args) {

        List<Sale> sales = Arrays.asList(
                new Sale(1,20,50),
                new Sale(2,5,100),
                new Sale(3,30,40),
                new Sale(4,15,70),
                new Sale(5,25,60),
                new Sale(6,50,20)
        );

        List<ProductSales> top5 =
                sales.stream()
                        .filter(s->s.quantity>10)
                        .collect(Collectors.groupingBy(
                                s->s.productId,
                                Collectors.summingDouble(s->s.quantity*s.price)
                        ))
                        .entrySet().stream()
                        .map(e->new ProductSales(e.getKey(),e.getValue()))
                        .sorted((a,b)->Double.compare(b.revenue,a.revenue))
                        .limit(5)
                        .toList();

        top5.forEach(p->System.out.println(p.productId+" "+p.revenue));
    }
}
