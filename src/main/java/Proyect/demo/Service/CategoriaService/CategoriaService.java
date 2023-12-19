package Proyect.demo.Service.CategoriaService;

import Proyect.demo.DTOs.ProductoCategoriaDTO;
import Proyect.demo.Entidades.Categoria;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoriaService extends BaseService<Categoria, Long> {

    List<Categoria> search(String filtro) throws Exception;
    Page<Categoria> search(String filtro, Pageable pageable) throws Exception;
    List<ProductoCategoriaDTO> findAllProductosByCategoria() throws Exception;

}
