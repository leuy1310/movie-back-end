package Railway31.service;

import Railway31.entity.Movies;
import Railway31.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesSeviceImpl implements MoviesSevice{

    @Autowired
    private MoviesRepository moviesRepository;

    @Override
    public List<Movies> getMovies() {
        List<Movies> getMovies = moviesRepository.findAll();
        return  getMovies;
    }

    @Override
    public Movies getById(Integer id) {
        return moviesRepository.findById(id).get();
    }

    @Override
    public List<Movies> searchMovies(String keyword) {
        return moviesRepository.searchMovies(keyword);
    }

    @Override
    public Movies addMovie(Movies movies) {
        return moviesRepository.save(movies);
    }

    @Override
    public void update(Movies movies) {
        moviesRepository.save(movies);
    }

    @Override
    public void delete(Integer id) {
        moviesRepository.deleteById(id);
    }
}
