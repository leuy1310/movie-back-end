package Railway31.service;

import Railway31.entity.Movies;

import java.util.List;

public interface MoviesSevice {

    List<Movies> getMovies();

    Movies getById(Integer id);

    List<Movies> searchMovies(String keyword);

    Movies addMovie(Movies movies);

    public void update(Movies movies);

    public void delete(Integer id);

//    List<Movies> findAllByName(String keyword);
}
