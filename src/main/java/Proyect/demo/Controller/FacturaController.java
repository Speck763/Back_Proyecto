package Proyect.demo.Controller;

import Proyect.demo.Entidades.Domicilio;
import Proyect.demo.Entidades.Factura;
import Proyect.demo.Service.FacturaService.FacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/Factura")
public class FacturaController extends BaseControllerImpl<Factura, FacturaServiceImpl>{
}