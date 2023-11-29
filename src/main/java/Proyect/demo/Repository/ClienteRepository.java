package Proyect.demo.Repository;

import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Entidades.Domicilio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long>{

    @Query(value= "SELECT cl FROM Cliente cl WHERE cl.nombre like '%1%' or cl.apellido like '%1%' or cl.email like '%1%'")
    List<Cliente> search(String filtro);
    @Query(value= "SELECT cl FROM Cliente cl WHERE cl.nombre like '%1%' or cl.apellido like '%1%' or cl.email like '%1%' ")
    Page<Cliente> search(String filtro, Pageable pageable);
}
