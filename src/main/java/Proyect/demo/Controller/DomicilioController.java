package Proyect.demo.Controller;

import Proyect.demo.Entidades.DetalleFactura;
import Proyect.demo.Entidades.Domicilio;
import Proyect.demo.Service.DomicilioService.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/Domicilio")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{
}
