package Proyect.demo.Repository;

import Proyect.demo.Entidades.Domicilio;
import Proyect.demo.Entidades.Pedido;
import Proyect.demo.Entidades.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long>{

    @Query(value= "SELECT pr FROM Producto pr WHERE pr.nombreProducto like '%1%'")
    List<Producto> search(String filtro);
    @Query(value= "SELECT pr FROM Producto pr WHERE pr.nombreProducto like '%1%'")
    Page<Producto> search(String filtro, Pageable pageable);
}
