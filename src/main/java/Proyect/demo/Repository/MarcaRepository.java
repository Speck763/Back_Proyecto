package Proyect.demo.Repository;


import Proyect.demo.Entidades.Marca;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarcaRepository extends BaseRepository<Marca, Long>{

    @Query(value= "SELECT m FROM Marca m WHERE m.nombreMarca like '%1%'")
    List<Marca> search(String filtro);
    @Query(value= "SELECT m FROM Marca m WHERE m.nombreMarca like '%1%'")
    Page<Marca> search(String filtro, Pageable pageable);
}
