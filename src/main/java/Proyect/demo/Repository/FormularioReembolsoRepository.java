package Proyect.demo.Repository;

import Proyect.demo.Entidades.Base;
import Proyect.demo.Entidades.Domicilio;
import Proyect.demo.Entidades.FormularioReembolso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormularioReembolsoRepository extends BaseRepository<FormularioReembolso,Long> {

    @Query(value= "SELECT fr FROM FormularioReembolso fr WHERE fr.id like '%1%'")
    List<FormularioReembolso> search(String filtro);
    @Query(value= "SELECT fr FROM FormularioReembolso fr WHERE fr.id like '%1%'")
    Page<FormularioReembolso> search(String filtro, Pageable pageable);
}
