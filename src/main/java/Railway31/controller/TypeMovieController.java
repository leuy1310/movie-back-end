package Railway31.controller;


import Railway31.entity.TypeMovie;
import Railway31.service.TypeMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("movies/type")
public class TypeMovieController {

    @Autowired
    private TypeMovieService typeMovieService;


    @GetMapping("page={id}")
    public TypeMovie getMoviesById(@PathVariable Integer id) {
        TypeMovie getMoivesById = typeMovieService.getMoviesById(id);
        return getMoivesById;
    }

}
