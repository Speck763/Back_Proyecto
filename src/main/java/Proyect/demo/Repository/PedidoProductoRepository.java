package Proyect.demo.Repository;

import Proyect.demo.Entidades.Domicilio;
import Proyect.demo.Entidades.PedidoProducto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PedidoProductoRepository extends BaseRepository<PedidoProducto,Long>{

    @Query(value= "SELECT pp FROM PedidoProducto pp WHERE pp.id like '%1%'")
    List<PedidoProducto> search(String filtro);
    @Query(value= "SELECT pp FROM PedidoProducto pp WHERE pp.id like '%1%'")
    Page<PedidoProducto> search(String filtro, Pageable pageable);
}
