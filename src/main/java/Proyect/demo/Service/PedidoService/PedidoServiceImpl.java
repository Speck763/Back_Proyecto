package Proyect.demo.Service.PedidoService;

import Proyect.demo.Entidades.Pedido;
import Proyect.demo.Entidades.PedidoProducto;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.PedidoProductoRepository;
import Proyect.demo.Repository.PedidoRepository;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import Proyect.demo.Service.PedidoProductoService.PedidoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido,Long> implements PedidoService {
    @Autowired
    public PedidoRepository pedidoRepository;
    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository, PedidoRepository pedidoRepository) {
        super(baseRepository);
    }

    @Override
    public List<Pedido> search(String filtro) throws Exception {
        try {
            List<Pedido> pedidos = PedidoRepository.search(filtro);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Pedido> findAll(Pageable pageable) throws Exception {
        try{
            Page<Pedido> pedidos = PedidoRepository.search(filtro);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
