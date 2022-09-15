package Railway31.service;

import Railway31.entity.TypeMovie;
import Railway31.repository.TypeMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeMoviesImpl implements TypeMovieService {

    @Autowired
    private TypeMovieRepository typeMovieRepository;
    @Override
    public TypeMovie getMoviesById(Integer id) {
        TypeMovie getById = typeMovieRepository.findById(id).get();
        return getById;
    }

    @Override
    public TypeMovie addMovie(TypeMovie typeMovie) {
        return typeMovieRepository.save(typeMovie);
    }
}
