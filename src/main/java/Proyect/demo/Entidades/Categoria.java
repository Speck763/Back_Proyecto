package Proyect.demo.Entidades;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
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
}
