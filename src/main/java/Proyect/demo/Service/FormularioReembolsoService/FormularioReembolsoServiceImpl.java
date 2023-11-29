package Proyect.demo.Service.FormularioReembolsoService;


import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Entidades.FormularioReembolso;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.ClienteRepository;
import Proyect.demo.Repository.FormularioReembolsoRepository;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import Proyect.demo.Service.ClienteService.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormularioReembolsoServiceImpl extends BaseServiceImpl<FormularioReembolso,Long> implements FormularioReembolsoService {
    @Autowired
    public FormularioReembolsoRepository formularioReembolsoRepository;
    public FormularioReembolsoServiceImpl(BaseRepository<FormularioReembolso, Long> baseRepository, FormularioReembolsoRepository formularioReembolsoRepository) {
        super(baseRepository);
    }

    @Override
    public List<FormularioReembolso> search(String filtro) throws Exception {
        try {
            List<FormularioReembolso> formularioReembolsos = FormularioReembolsoRepository.search(filtro);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<FormularioReembolso> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<FormularioReembolso> formularioReembolsos = FormularioReembolsoRepository.search(filtro, pageable);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
