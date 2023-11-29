package Proyect.demo.Service.DomicilioService;

import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Entidades.Domicilio;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.ClienteRepository;
import Proyect.demo.Repository.DomicilioRepository;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import Proyect.demo.Service.ClienteService.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioServiceImpl  extends BaseServiceImpl<Domicilio,Long> implements DomicilioService {

    @Autowired
    public DomicilioRepository domicilioRepository;
    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository, DomicilioRepository domicilioRepository) {
        super(baseRepository);
    }

    @Override
    public List<Domicilio> search(String filtro) throws Exception {
        try {
            List<Domicilio> domicilios = DomicilioRepository.search(filtro);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Domicilio> findAll(Pageable pageable) throws Exception {
        try{
            Page<Domicilio> domicilios= DomicilioRepository.search(filtro);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
