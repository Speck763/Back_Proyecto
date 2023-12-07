package Proyect.demo.Repository;


import Proyect.demo.Entidades.Provincia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRepository extends BaseRepository<Provincia,Long>{

    @Query(value= "SELECT prov FROM Provincia prov WHERE prov.nombreProvincia like '%1%'")
    List<Provincia> search(String filtro);
    @Query(value= "SELECT prov FROM Provincia prov WHERE prov.nombreProvincia like '%1%'")
    Page<Provincia> search(String filtro, Pageable pageable);
}
