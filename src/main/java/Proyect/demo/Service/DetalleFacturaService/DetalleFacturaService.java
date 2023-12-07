package Proyect.demo.Service.DetalleFacturaService;

import Proyect.demo.Entidades.Cliente;
import Proyect.demo.Entidades.DetalleFactura;
import Proyect.demo.Service.BaseService.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DetalleFacturaService extends BaseService<DetalleFactura, Long> {
    List<DetalleFactura> search(String filtro) throws Exception;
    Page<DetalleFactura> search(String filtro, Pageable pageable) throws Exception;
}
