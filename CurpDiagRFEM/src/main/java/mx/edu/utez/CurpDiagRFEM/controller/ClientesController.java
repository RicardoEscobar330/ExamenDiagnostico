package mx.edu.utez.CurpDiagRFEM.controller;

import lombok.AllArgsConstructor;
import mx.edu.utez.CurpDiagRFEM.model.dto.ClientesDto;
import mx.edu.utez.CurpDiagRFEM.model.entity.ClientesBean;
import mx.edu.utez.CurpDiagRFEM.service.ICliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1")
public class ClientesController {

    private final ICliente ClientesService;

    @PostMapping("/cliente")
    public ClientesDto create(@RequestBody ClientesDto clientesDto){
        ClientesBean clientesSave = ClientesService.save(clientesDto);
        return ClientesDto.builder()
                .idCliente(clientesSave.getIdCliente())
                .nombreCliente(clientesSave.getNombreCliente())
                .apellidosCliente(clientesSave.getApellidosCliente())
                .CURP(clientesSave.getCURP())
                .fechaNac(clientesSave.getFechaNac())
                .build();
    }

    @PutMapping("/cliente/")
    public ClientesDto update(@RequestBody ClientesDto clientesDto){
        ClientesBean clientesUpdate = ClientesService.save(clientesDto);
        return ClientesDto.builder()
                .idCliente(clientesUpdate.getIdCliente())
                .nombreCliente(clientesUpdate.getNombreCliente())
                .apellidosCliente(clientesUpdate.getApellidosCliente())
                .CURP(clientesUpdate.getCURP())
                .fechaNac(clientesUpdate.getFechaNac())
                .build();
    }

    @DeleteMapping("/cliente/{id}")
    public void delete(@PathVariable Integer id){
        ClientesBean deleteClientes = ClientesService.findById(id);
        ClientesService.delete(deleteClientes);
    }

    @GetMapping("/cliente/{id}")
    public ClientesBean showById(@PathVariable Integer id){ return ClientesService.findById(id); }

    @GetMapping("/clientes")
    public List<ClientesBean> findAll() { return ClientesService.showAll(); }
}
