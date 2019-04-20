package com.bvan.oop.lessons9_10.movie;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class Movie {

    private final String title;
    private final int releaseYear;
    private final Set<Genre> genres;

    public Movie(String title, int releaseYear, Collection<Genre> genres) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genres = new LinkedHashSet<>(genres);
        this.genres.addAll(genres);
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    public boolean hasGenre(Genre genre) {
        return genres.contains(genre);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", genres=" + genres +
                '}';
    }
}
