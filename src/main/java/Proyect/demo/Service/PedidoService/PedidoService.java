package Proyect.demo.Service.PedidoService;


import Proyect.demo.Entidades.Pedido;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PedidoService extends BaseService<Pedido, Long> {

    List<Pedido> search(String filtro) throws Exception;
    Page<Pedido> findAll(Pageable pageable) throws Exception;
}
