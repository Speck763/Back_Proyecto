package Proyect.demo.Controller;

import Proyect.demo.Entidades.Pedido;
import Proyect.demo.Entidades.PedidoProducto;
import Proyect.demo.Service.PedidoProductoService.PedidoProductoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/PedidoProducto")
public class PedidoProductoController extends BaseControllerImpl<PedidoProducto, PedidoProductoServiceImpl>{
}
