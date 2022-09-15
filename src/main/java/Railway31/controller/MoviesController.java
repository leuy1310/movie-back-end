package Railway31.controller;


import Railway31.entity.Movies;
import Railway31.entity.TypeMovie;
import Railway31.service.MoviesSevice;
import Railway31.service.TypeMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MoviesSevice moviesSevice;

    @Autowired
    private TypeMovieService typeMovieService;

    @GetMapping("movies_list")
    public List<Movies> getMoviesList() {
        List<Movies> getMoviesList = moviesSevice.getMovies();
        return getMoviesList;
    }

    @GetMapping("search_movie")
    public List<Movies> search(@RequestParam("keyword") String keyword) {
        List<Movies> searchMovies = moviesSevice.searchMovies(keyword);
        return searchMovies;
    }

    @PostMapping("add_movie")
    public Movies addMovie(@RequestBody Movies movies) {
        return moviesSevice.addMovie(movies);
    }

    @PutMapping("update_movie/{id}")
    public void updateMovie(@PathVariable("id") Integer id, @RequestBody Movies movies) {
        movies.setId(id);
        moviesSevice.update(movies);
    }


    @DeleteMapping("delete_movie/{id}")
    public void deleteMovie(@PathVariable("id") Integer id) {
        moviesSevice.delete(id);
    }

}
