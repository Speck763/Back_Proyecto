package Proyect.demo.Service.PedidoProductoService;

import Proyect.demo.Entidades.Categoria;
import Proyect.demo.Entidades.PedidoProducto;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PedidoProductoService extends BaseService<PedidoProducto, Long> {

    List<PedidoProducto> search(String filtro) throws Exception;
    Page<PedidoProducto> search(String filtro, Pageable pageable) throws Exception;
}
