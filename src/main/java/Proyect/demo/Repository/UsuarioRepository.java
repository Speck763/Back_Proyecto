package Proyect.demo.Repository;

import Proyect.demo.Entidades.Domicilio;
import Proyect.demo.Entidades.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UsuarioRepository extends BaseRepository<Usuario,Long>{

    @Query(value= "SELECT u FROM Usuario u WHERE u.nombreUsuario like '%1%' or u.email like '%1%' ")
    List<Usuario> search(String filtro);
    @Query(value= "SELECT u FROM Usuario u WHERE u.nombreUsuario like '%1%' or u.email like '%1%' ")
    Page<Usuario> search(String filtro, Pageable pageable);
}
