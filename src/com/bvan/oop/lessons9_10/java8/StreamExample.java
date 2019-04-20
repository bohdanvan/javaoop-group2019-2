package com.bvan.oop.lessons9_10.java8;

import com.bvan.oop.lessons9_10.movie.Movie;
import com.bvan.oop.lessons9_10.movie.MovieFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

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

        // declarative
        List<String> titles2 = movies.stream() // movies
                .filter(m -> m.getReleaseYear() > 2000) // filtered movies
                .map(m -> m.getTitle()) // titles of filtered movies
                .filter(s -> s.length() > 5) // filtered titles of filtered movies
                .skip(1)
                .limit(2)
                .sorted()
                .collect(Collectors.toList());
        printList(titles2);
    }

    private static <T> void printList(List<T> movies) {
        for (T elem : movies) {
            System.out.println(elem);
        }
        System.out.println();
    }
}
