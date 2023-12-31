package Proyect.demo.Controller;

import Proyect.demo.Entidades.PedidoProducto;
import Proyect.demo.Entidades.Producto;
import Proyect.demo.Service.ProductoService.ProductoServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/Producto")
public class ProductoController extends BaseControllerImpl<Producto, ProductoServiceImpl>{

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/searchPaged")
    public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/ProductosOrdenadosAZ")
    public ResponseEntity<?> findAllProductosOrdenadosAZ(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAllProductosOrdenadosAZ());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/ProductosOrdenadosZA")
    public ResponseEntity<?> findAllProductosOrdenadosZA(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAllProductosOrdenadosZA());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/ProductosOrdenadosMasBarato")
    public ResponseEntity<?> findAllProductosOrdenadosMasBarato(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAllProductosOrdenadosMasBarato());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/ProductosOrdenadosMasCaro")
    public ResponseEntity<?> findAllProductosOrdenadosMasCaro(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAllProductosOrdenadosMasCaro());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/ProductosOrdenadosViejo")
    public ResponseEntity<?> findAllProductosOrdenadosViejo(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAllProductosOrdenadosViejo());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/ProductosOrdenadosNuevo")
    public ResponseEntity<?> findAllProductosOrdenadosNuevo(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAllProductosOrdenadosNuevo());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
}