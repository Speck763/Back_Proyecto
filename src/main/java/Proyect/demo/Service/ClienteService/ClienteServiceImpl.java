package Proyect.demo.Service.ClienteService;

import Proyect.demo.Entidades.Base;
import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.ClienteRepository;
import Proyect.demo.Service.BaseService.BaseService;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente,Long> implements ClienteService {
    @Autowired
    public ClienteRepository clienteRepository;
    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository, ClienteRepository clienteRepository) {
        super(baseRepository);
        this.clienteRepository = clienteRepository;
    }
}
