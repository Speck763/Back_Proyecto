package Proyect.demo.Repository;

import Proyect.demo.Entidades.Domicilio;
import Proyect.demo.Entidades.Localidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LocalidadRepository extends BaseRepository<Localidad,Long>{

    @Query(value= "SELECT l FROM Localidad l WHERE l.nombre like '%1%'")
    List<Localidad> search(String filtro);
    @Query(value= "SELECT l FROM Localidad l WHERE l.nombre like '%1%'")
    Page<Localidad> search(String filtro, Pageable pageable);
}
