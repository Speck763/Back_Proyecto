package Proyect.demo.Service.InfoEnvioService;

import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Entidades.InfoEnvio;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.ClienteRepository;
import Proyect.demo.Repository.InfoEnvioRepository;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import Proyect.demo.Service.ClienteService.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoEnvioServiceImpl extends BaseServiceImpl<InfoEnvio,Long> implements InfoEnvioService {
    @Autowired
    public InfoEnvioRepository infoEnvioRepository;
    public InfoEnvioServiceImpl(BaseRepository<InfoEnvio, Long> baseRepository,InfoEnvioRepository infoEnvioRepository) {
        super(baseRepository);
    }

    @Override
    public List<InfoEnvio> search(String filtro) throws Exception {
        try {
            List<InfoEnvio> infoEnvios = InfoEnvioRepository.search(filtro);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<InfoEnvio> findAll(Pageable pageable) throws Exception {
        try{
            Page<InfoEnvio> infoEnvios = InfoEnvioRepository.search(filtro);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
