package Proyect.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Table(name = "Categoria")
public class Categoria extends Base{
    @NotNull
    @Column(name = "nombreCategoria")
    private String nombreCategoria;

    @NotNull
    @Column(name = "url_imagen")
    private String urlImagen;

    //comentario anti cbum
    @NotNull
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;

    //private Date fechaModificacion;

    @Column(name = "fecha_baja")
    @Temporal(TemporalType.DATE)
    private Date fechaBaja;

    @OneToMany(mappedBy = "fk_producto")
    private List<Producto> productos;
}
