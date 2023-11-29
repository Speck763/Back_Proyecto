package Proyect.demo.Controller;

import Proyect.demo.Entidades.FormularioReembolso;
import Proyect.demo.Entidades.InfoEnvio;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/InfoEnvio")
public class InfoEnvioController extends BaseControllerImpl<InfoEnvio,InfoEnvioServiceImpl>{
}