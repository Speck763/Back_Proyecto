package Proyect.demo.Service.LocalidadService;

import Proyect.demo.Entidades.Categoria;
import Proyect.demo.Entidades.Localidad;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LocalidadService extends BaseService<Localidad, Long> {

    List<Localidad> search(String filtro) throws Exception;
    Page<Localidad> search(String filtro, Pageable pageable) throws Exception;
}
