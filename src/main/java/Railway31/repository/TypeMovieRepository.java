package Railway31.repository;

import Railway31.entity.TypeMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeMovieRepository extends JpaRepository<TypeMovie, Integer> {
}
