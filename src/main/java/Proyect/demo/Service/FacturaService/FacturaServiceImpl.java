package Proyect.demo.Service.FacturaService;

import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Entidades.Factura;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.ClienteRepository;
import Proyect.demo.Repository.FacturaRepository;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import Proyect.demo.Service.ClienteService.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura,Long> implements FacturaService {
    @Autowired
    public FacturaService facturaService;
    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository, FacturaRepository facturaRepository) {
        super(baseRepository);
    }

    @Override
    public List<Factura> search(String filtro ) throws Exception {
        try {
            List<Factura> facturas = FacturaRepository.search(filtro);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Factura> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Factura> facturas = FacturaRepository.search(filtro, pageable);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
