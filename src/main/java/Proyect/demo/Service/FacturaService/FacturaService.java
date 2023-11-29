package Proyect.demo.Service.FacturaService;

import Proyect.demo.Entidades.Factura;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FacturaService extends BaseService<Factura, Long> {

        List<Factura> search(String filtro) throws Exception;
        Page<Factura> search(String filtro, Pageable pageable) throws Exception;
}
