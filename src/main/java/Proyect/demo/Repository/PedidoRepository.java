package Proyect.demo.Repository;

import Proyect.demo.Entidades.Base;
import Proyect.demo.Entidades.Domicilio;
import Proyect.demo.Entidades.Pedido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido, Long> {

    @Query(value= "SELECT pe FROM Pedido pe WHERE pe.id like '%1%'")
    List<Pedido> search(String filtro);
    @Query(value= "SELECT pe FROM Pedido pe WHERE pe.id like '%1%'")
    Page<Pedido> search(String filtro, Pageable pageable);
}
