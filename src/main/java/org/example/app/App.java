package org.example.app;

import java.math.BigDecimal;
import java.util.List;

public class App
{
    static class Book {
        private final BigDecimal price;
        private final String name;

        public Book(BigDecimal price, String name) {
            this.price = price;
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "price=" + price +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    
    public static void main(String[] args) {
        final var booksList = List.of(
                new Book(BigDecimal.valueOf(1.99), "Book 1"),
                new Book(BigDecimal.valueOf(2.67), "Book 2"),
                new Book(BigDecimal.valueOf(10.67), "Book 3"),
                new Book(BigDecimal.valueOf(324.622), "Book 4"),
                new Book(BigDecimal.valueOf(2.67), "Book 5"),
                new Book(BigDecimal.valueOf(1.99), "Book 6")
        );
        // final var pricesToBooks = 
    } 
}
