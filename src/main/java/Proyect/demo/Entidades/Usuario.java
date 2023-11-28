package Proyect.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @Enumerated(EnumType.STRING)
    private Rol rol;


    public enum Rol{
        ADMINISTRADOR,
        CLIENTE,
        EMPLEADO
    }
}
