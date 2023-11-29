package Proyect.demo.Controller;

import Proyect.demo.Entidades.Provincia;
import Proyect.demo.Entidades.Usuario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/Usuario")
public class UsuarioController extends BaseControllerImpl<Usuario,UsuarioServiceImpl>{
}
