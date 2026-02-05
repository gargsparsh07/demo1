package javacollectionsstreams.java8features.level2;

import java.util.*;

class Book {
    String title, author, genre;
    double rating;
    Book(String t,String a,String g,double r){
        title=t;author=a;genre=g;rating=r;
    }
}

class BookRecommendation {
    String title;
    double rating;
    BookRecommendation(String t,double r){title=t;rating=r;}
}

public class BookRecommendations {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Dune","Frank","Science Fiction",4.8),
                new Book("Foundation","Asimov","Science Fiction",4.6),
                new Book("It","King","Horror",4.5),
                new Book("Neuromancer","Gibson","Science Fiction",4.2),
                new Book("Hyperion","Simmons","Science Fiction",4.9)
        );

        List<BookRecommendation> page1 =
                books.stream()
                        .filter(b->b.genre.equals("Science Fiction") && b.rating>4.0)
                        .map(b->new BookRecommendation(b.title,b.rating))
                        .sorted((a,b)->Double.compare(b.rating,a.rating))
                        .limit(5) // page size
                        .toList();

        page1.forEach(b->System.out.println(b.title+" "+b.rating));
    }
}
