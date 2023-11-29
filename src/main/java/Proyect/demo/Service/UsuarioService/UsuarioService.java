package Proyect.demo.Service.UsuarioService;


import Proyect.demo.Entidades.Usuario;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UsuarioService extends BaseService<Usuario, Long> {

    List<Usuario> search(String filtro) throws Exception;
    Page<Usuario> findAll(Pageable pageable) throws Exception;
}
