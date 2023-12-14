package Proyect.demo.Repository;

import Proyect.demo.Entidades.Categoria;
import Proyect.demo.Entidades.Domicilio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria, Long> {

    @Query(value = "SELECT ca FROM Categoria ca WHERE ca.nombreCategoria like '%1%'")
    List<Categoria> search(String filtro);
    @Query(value= "SELECT ca FROM Categoria ca WHERE ca.nombreCategoria like '%1%'")
    Page<Categoria> search(String filtro, Pageable pageable);
}
