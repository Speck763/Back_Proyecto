package Proyect.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Table(name = "Categoria")
public class Categoria extends Base{

    @Column(name = "nombreCategoria")
    private String nombreCategoria;
    @Column(name ="descripcionCategoria")
    private String descripcionCategoria;
    @Column(name="imagenCategoria")
    private String imagenCategoria;
    @Enumerated(EnumType.STRING)
    private Categoria.EstadoCategoria estadoCategoria;
    public enum EstadoCategoria{
        Habilitado,
        Baja

    }

    @Column(name = "fechaAltaCategoria")
    private Date fechaAltaCategoria;
    @Column(name = "fechaBajaCategoria")
    private Date fechaBajaCategoria;

}
