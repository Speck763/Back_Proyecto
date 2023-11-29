package Proyect.demo.Repository;

import Proyect.demo.Entidades.Base;
import Proyect.demo.Entidades.Factura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FacturaRepository extends BaseRepository<Factura,Long> {

    @Query(value= "SELECT f FROM Factura f WHERE f.id like '%1%'")
    List<Factura> search(String filtro);
    @Query(value= "SELECT f FROM Factura f WHERE f.id like '%1%'")
    Page<Factura> search(String filtro, Pageable pageable);
}
