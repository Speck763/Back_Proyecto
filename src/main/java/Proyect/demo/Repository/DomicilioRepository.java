package Proyect.demo.Repository;

import Proyect.demo.Entidades.Domicilio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio,Long>{

    @Query(value= "SELECT d FROM Domicilio d WHERE d.nroCasa like '%1%' or d.calle like '%1%' ")
    List<Domicilio> search(String filtro);
    @Query(value= "SELECT d FROM Domicilio d WHERE d.nroCasa like '%1%' or d.calle like '%1%'")
    Page<Domicilio> search(String filtro, Pageable pageable);

}
