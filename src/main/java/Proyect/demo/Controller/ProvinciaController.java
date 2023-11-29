package Proyect.demo.Controller;

import Proyect.demo.Entidades.Producto;
import Proyect.demo.Entidades.Provincia;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/Provincia")
public class ProvinciaController extends BaseControllerImpl<Provincia,ProvinciaServiceImpl>{
}