package Proyect.demo.Repository;


import Proyect.demo.Entidades.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleFacturaRepository extends BaseRepository<DetalleFactura,Long> {

    @Query(value= "SELECT df FROM DetalleFactura df WHERE df.id like '%1%'")
    List<DetalleFactura> search(String filtro);
    @Query(value= "SELECT df FROM DetalleFactura df WHERE df.id like '%1%'")
    Page<DetalleFactura> search(String filtro, Pageable pageable);

    @Query(value = "SELECT df.producto.id AS producto_id, " +
            "p.nombreProducto AS nombre_producto, " +
            "p.precioVenta AS sub_Totalm, " +
            "SUM(df.cantidadVentas) AS cantidad_vendida " +
            "FROM DetalleFactura df " +
            "JOIN Producto p ON df.producto.id = p.id " +
            "GROUP BY df.producto.id, p.nombreProducto " +
            "ORDER BY cantidad_vendida DESC ")
    List<Object[]>PrductosMasVendidos();
}
