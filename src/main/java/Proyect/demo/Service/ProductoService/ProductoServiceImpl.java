package Proyect.demo.Service.ProductoService;

import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Entidades.Producto;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.ClienteRepository;
import Proyect.demo.Repository.ProductoRepository;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import Proyect.demo.Service.ClienteService.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto,Long> implements ProductoService {
    @Autowired
    public ProductoRepository productoRepository;
    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository, ProductoRepository productoRepository) {
        super(baseRepository);
    }

    @Override
    public List<Producto> search(String filtro) throws Exception {
        try {
            List<Producto> productos = productoRepository.search(filtro);
            return productos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Producto> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Producto> productos = productoRepository.search(filtro, pageable);
            return productos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Producto> findAllProductosOrdenadosAZ() throws Exception {
        try {
            List<Producto> productos = productoRepository.findAllProductosOrdenadosAZ();
            return productos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Producto> findAllProductosOrdenadosZA() throws Exception {
        try {
            List<Producto> productos = productoRepository.findAllProductosOrdenadosZA();
            return productos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
