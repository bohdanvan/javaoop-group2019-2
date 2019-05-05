package com.bvan.oop.lessons9_10.java8;

import com.bvan.oop.lessons9_10.movie.Genre;
import com.bvan.oop.lessons9_10.movie.Movie;
import com.bvan.oop.lessons9_10.movie.MovieFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample { // Stream API

    public static void main(String[] args) {
        List<Movie> movies = MovieFactory.createMovies();
        printList(movies);

        // imperative
        List<String> titles = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getReleaseYear() > 2000) {
                String title = movie.getTitle();
                if (title.length() > 5) {
                    titles.add(title);
                }
            }
        }
        printList(titles);

        Predicate<Movie> p1 = m -> m.getReleaseYear() > 2000;
        Predicate<Movie> p2 = m -> m.hasGenre(Genre.COMEDY);
        Predicate<Movie> p = p1.and(p2);

        // declarative
        List<String> titles2 = movies.stream() // movies
                .filter(p) // filtered movies
                .map(Movie::getTitle) // titles of filtered movies
                .filter(s -> s.length() > 5) // filtered titles of filtered movies
                .skip(1)
                .limit(2)
                .sorted()
                .collect(Collectors.toList());
        printList(titles2);

        movies.forEach(System.out::println); // x -> System.out.println(x)
    }

    private static <T> void printList(List<T> movies) {
        for (T elem : movies) {
            System.out.println(elem);
        }
        System.out.println();
    }
}
