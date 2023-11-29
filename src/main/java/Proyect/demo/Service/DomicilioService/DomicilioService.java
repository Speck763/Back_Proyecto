package Proyect.demo.Service.DomicilioService;



import Proyect.demo.Entidades.Domicilio;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DomicilioService extends BaseService<Domicilio, Long> {

    List<Domicilio> search(String filtro) throws Exception;
    Page<Domicilio> findAll(Pageable pageable) throws Exception;

}
