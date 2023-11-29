package Proyect.demo.Service.FormularioReembolsoService;

import Proyect.demo.Entidades.Categoria;
import Proyect.demo.Entidades.FormularioReembolso;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FormularioReembolsoService extends BaseService<FormularioReembolso, Long> {

    List<FormularioReembolso> search(String filtro) throws Exception;
    Page<FormularioReembolso> findAll(Pageable pageable) throws Exception;
}
