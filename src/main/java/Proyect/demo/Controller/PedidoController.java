package Proyect.demo.Controller;

import Proyect.demo.Entidades.Localidad;
import Proyect.demo.Entidades.Pedido;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/Pedido")
public class PedidoController extends BaseControllerImpl<Pedido,PedidoServiceImpl>{
}
