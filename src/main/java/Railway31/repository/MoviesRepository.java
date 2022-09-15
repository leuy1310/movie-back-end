package Railway31.repository;

import Railway31.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Integer> {

    // Search
    @Query("select m from Movies m where m.name like %?1%")
    List<Movies> searchMovies(String keyword);
}
