package Proyect.demo.Service.LocalidadService;

import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Entidades.Localidad;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.ClienteRepository;
import Proyect.demo.Repository.LocalidadRepository;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import Proyect.demo.Service.ClienteService.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {
    @Autowired
    public LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);

    }

    @Override
    public List<Localidad> search(String filtro) throws Exception {
        try {
            List<Localidad> localidades = LocalidadRepository.search(filtro);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Localidad> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Localidad> localidades = LocalidadRepository.search(filtro, pageable);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
