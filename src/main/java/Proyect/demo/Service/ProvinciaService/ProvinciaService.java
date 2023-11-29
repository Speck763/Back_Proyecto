package Proyect.demo.Service.ProvinciaService;

import Proyect.demo.Entidades.Provincia;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProvinciaService extends BaseService<Provincia, Long> {

    List<Provincia> search(String filtro) throws Exception;
    Page<Provincia> findAll(Pageable pageable) throws Exception;
}
