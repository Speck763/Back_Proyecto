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
@Table(name = "Usuario")

public class Usuario extends Base{

    @Column(name = "nombreUsuario")
    private String nombreUsuario;
    @Column(name = "contraseña")
    private String contraseña;
    @Column(name = "email")
    private String email;
    @Column(name = "fecha_Alta")
    private Date fechaAlta;
    @Column(name = "fecha_Modificacion")
    private Date fechaModificacion;
    @Column(name = "fecha_Baja")
    private Date fechaBaja;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    public enum Rol{
        ADMINISTRADOR,
        CLIENTE,
        EMPLEADO
    }
}
