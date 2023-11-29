package Proyect.demo.Service.DetalleFacturaService;

import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Entidades.DetalleFactura;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.ClienteRepository;
import Proyect.demo.Repository.DetalleFacturaRepository;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class DetalleFacturaServiceImpl extends BaseServiceImpl<DetalleFactura,Long> implements DetalleFacturaService {

    @Autowired
    public DetalleFacturaRepository detalleFacturaRepository;

    public DetalleFacturaServiceImpl(BaseRepository<DetalleFactura, Long> baseRepository, DetalleFacturaRepository detalleFacturaRepository){
        super(baseRepository);
    }

    @Override
    public List<DetalleFactura> search(String filtro) throws Exception {
        try {
            List<DetalleFactura> detalleFacturas = detalleFacturaRepository.search(filtro);
            return detalleFacturas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<DetalleFactura> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<DetalleFactura> detalleFacturas = detalleFacturaRepository.search(filtro, pageable);
            return detalleFacturas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
