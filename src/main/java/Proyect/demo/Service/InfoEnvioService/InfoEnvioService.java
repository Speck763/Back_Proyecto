package Proyect.demo.Service.InfoEnvioService;

import Proyect.demo.Entidades.Categoria;
import Proyect.demo.Entidades.InfoEnvio;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface InfoEnvioService extends BaseService<InfoEnvio, Long> {

    List<InfoEnvio> search(String filtro) throws Exception;
    Page<InfoEnvio> search(String filtro, Pageable pageable) throws Exception;
}
