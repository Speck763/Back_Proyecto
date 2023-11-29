package Proyect.demo.Service.ProvinciaService;

import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Entidades.Provincia;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.ClienteRepository;
import Proyect.demo.Repository.ProvinciaRepository;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import Proyect.demo.Service.ClienteService.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceImpl extends BaseServiceImpl<Provincia,Long> implements ProvinciaService {
    @Autowired
    public ProvinciaRepository provinciaRepository;
    public ProvinciaServiceImpl(BaseRepository<Provincia, Long> baseRepository, ProvinciaRepository provinciaRepository) {
        super(baseRepository);
    }

    @Override
    public List<Provincia> search(String filtro) throws Exception {
        try {
            List<Provincia> provincias = provinciaRepository.search(filtro);
            return provincias;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Provincia> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Provincia> provincias = provinciaRepository.search(filtro, pageable);
            return provincias;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
