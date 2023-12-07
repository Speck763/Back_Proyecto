package Proyect.demo.Service.ClienteService;

import Proyect.demo.Entidades.Categoria;
import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ClienteService extends BaseService<Cliente,Long>{

    List<Cliente> search(String filtro) throws Exception;
    Page<Cliente> search(String filtro, Pageable pageable) throws Exception;

}
