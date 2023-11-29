package Proyect.demo.Controller;

import Proyect.demo.Entidades.PedidoProducto;
import Proyect.demo.Entidades.Producto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/Producto")
public class ProductoController extends BaseControllerImpl<Producto,ProductoServiceImpl>{
}