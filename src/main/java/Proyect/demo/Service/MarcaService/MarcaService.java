package Proyect.demo.Service.MarcaService;


import Proyect.demo.Entidades.Marca;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MarcaService extends BaseService<Marca, Long>{

    List<Marca> search(String filtro) throws Exception;
    Page<Marca> search(String filtro, Pageable pageable) throws Exception;
}
