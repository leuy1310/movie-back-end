package Railway31.service;

import Railway31.entity.TypeMovie;

public interface TypeMovieService {

    TypeMovie getMoviesById(Integer id);

    TypeMovie addMovie(TypeMovie typeMovie);
}
