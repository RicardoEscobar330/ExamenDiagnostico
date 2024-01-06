package mx.edu.utez.CurpDiagRFEM.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

@Table(name = "clientes")
public class ClientesBean {
    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    @Column(name = "apellidos_cliente")
    private String apellidosCliente;
    @Column(name = "curp", unique = true)
    private String CURP;
    @Column(name = "fecha_nacimiento")
    private String fechaNac;
}
