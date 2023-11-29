package Proyect.demo.Controller;

import Proyect.demo.Entidades.InfoEnvio;
import Proyect.demo.Entidades.Localidad;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/Localidad")
public class LocalidadController extends BaseControllerImpl<Localidad,LocalidadServiceImpl>{
}
