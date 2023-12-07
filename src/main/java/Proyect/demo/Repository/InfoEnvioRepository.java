package Proyect.demo.Repository;

import Proyect.demo.Entidades.Base;
import Proyect.demo.Entidades.Domicilio;
import Proyect.demo.Entidades.InfoEnvio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface InfoEnvioRepository extends BaseRepository<InfoEnvio,Long> {

    @Query(value= "SELECT ie FROM InfoEnvio ie WHERE ie.id like '%1%'")
    List<InfoEnvio> search(String filtro);
    @Query(value= "SELECT ie FROM InfoEnvio ie WHERE ie.id like '%1%'")
    Page<InfoEnvio> search(String filtro, Pageable pageable);
}
