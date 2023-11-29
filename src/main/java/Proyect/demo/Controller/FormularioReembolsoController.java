package Proyect.demo.Controller;

import Proyect.demo.Entidades.Domicilio;
import Proyect.demo.Entidades.FormularioReembolso;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/FormularioReembolso")
public class FormularioReembolsoController extends BaseControllerImpl<FormularioReembolso,FormularioReembolsoServiceImpl>{
}