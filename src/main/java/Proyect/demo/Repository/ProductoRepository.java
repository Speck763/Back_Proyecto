package Proyect.demo.Repository;

import Proyect.demo.DTOs.ProductoMarcaDTO;
import Proyect.demo.Entidades.Domicilio;
import Proyect.demo.Entidades.Pedido;
import Proyect.demo.Entidades.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long>{

    @Query(value= "SELECT pr FROM Producto pr WHERE pr.nombreProducto like '%1%'")
    List<Producto> search(String filtro);
    @Query(value= "SELECT pr FROM Producto pr WHERE pr.nombreProducto like '%1%'")
    Page<Producto> search(String filtro, Pageable pageable);

    @Query("SELECT p FROM Producto p ORDER BY p.nombreProducto ASC")
    List<Producto> findAllProductosOrdenadosAZ();

    @Query("SELECT p FROM Producto p ORDER BY p.nombreProducto DESC ")
    List<Producto> findAllProductosOrdenadosZA();

    @Query("SELECT p FROM Producto p ORDER BY p.precioVenta ASC")
    List<Producto> findAllProductosOrdenadosMasBarato();
    @Query("SELECT p FROM Producto p ORDER BY p.precioVenta DESC")
    List<Producto> findAllProductosOrdenadosMasCaro();

    @Query("SELECT p FROM Producto p ORDER BY p.fechaAlta ASC ")
    List<Producto> findAllProductosOrdenadosViejo();
    @Query("SELECT p FROM Producto p ORDER BY p.fechaAlta DESC ")
    List<Producto> findAllProductosOrdenadosNuevo();
}
