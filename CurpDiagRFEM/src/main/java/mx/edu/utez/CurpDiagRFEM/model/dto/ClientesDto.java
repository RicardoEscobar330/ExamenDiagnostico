package mx.edu.utez.CurpDiagRFEM.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class ClientesDto {
    private Integer idCliente;
    private String nombreCliente;
    private String apellidosCliente;
    private String CURP;
    private String fechaNac;
}
