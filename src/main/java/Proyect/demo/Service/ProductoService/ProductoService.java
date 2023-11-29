package Proyect.demo.Service.ProductoService;

import Proyect.demo.Entidades.Categoria;
import Proyect.demo.Entidades.Producto;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductoService extends BaseService<Producto, Long> {

    List<Producto> search(String filtro) throws Exception;
    Page<Producto> search(String filtro, Pageable pageable) throws Exception;
}
