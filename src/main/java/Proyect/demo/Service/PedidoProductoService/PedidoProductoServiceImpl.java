package Proyect.demo.Service.PedidoProductoService;

import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Entidades.PedidoProducto;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.ClienteRepository;
import Proyect.demo.Repository.PedidoProductoRepository;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import Proyect.demo.Service.ClienteService.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoProductoServiceImpl extends BaseServiceImpl<PedidoProducto,Long> implements PedidoProductoService {
    @Autowired
    public PedidoProductoRepository pedidoProductoRepository;
    public PedidoProductoServiceImpl(BaseRepository<PedidoProducto, Long> baseRepository, PedidoProductoRepository pedidoProductoRepository) {
        super(baseRepository);
    }

    @Override
    public List<PedidoProducto> search(String filtro) throws Exception {
        try {
            List<PedidoProducto> pedidoProductos = PedidoProductoRepository.search(filtro);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<PedidoProducto> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<PedidoProducto> pedidoProductos = PedidoProductoRepository.search(filtro, pageable);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
