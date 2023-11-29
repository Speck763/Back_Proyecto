package Proyect.demo.Service.ClienteService;

import Proyect.demo.Entidades.Base;
import Proyect.demo.Entidades.Categoria;
import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.CategoriaRepository;
import Proyect.demo.Repository.ClienteRepository;
import Proyect.demo.Service.BaseService.BaseService;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente,Long> implements ClienteService {
    @Autowired
    public ClienteRepository clienteRepository;
    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository, ClienteRepository clienteRepository) {
        super(baseRepository);
    }

    @Override
    public List<Cliente> search(String filtro) throws Exception {
        try {
            List<Cliente> clientes = clienteRepository.search(filtro);
            return clientes;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Cliente> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Cliente> clientes = clienteRepository.search(filtro, pageable);
            return clientes;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
