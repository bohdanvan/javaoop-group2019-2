package com.bvan.oop.lessons9_10.movie;

import static com.bvan.oop.lessons9_10.movie.Genre.*;
import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class MovieFactory {

    public static List<Movie> createMovies() {
        List<Movie> films = new ArrayList<>();
        films.add(new Movie("Captain Fantastic", 2016, asList(DRAMA, ROMANCE, COMEDY)));
        films.add(new Movie("Her", 2013, asList(ROMANCE, DRAMA, SCI_FI)));
        films.add(new Movie("La La Land", 2016, asList(COMEDY, MUSIC)));
        films.add(new Movie("Pulp Fiction", 1994, asList(THRILLER, COMEDY, CRIME)));
        films.add(new Movie("Deadpool", 2016, asList(ACTION)));
        films.add(new Movie("Forrest Gump", 1994, asList(DRAMA, COMEDY)));
        return films;
    }
}
