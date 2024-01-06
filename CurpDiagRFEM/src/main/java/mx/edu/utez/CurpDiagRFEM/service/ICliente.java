package mx.edu.utez.CurpDiagRFEM.service;

import ch.qos.logback.core.net.server.Client;
import mx.edu.utez.CurpDiagRFEM.model.dto.ClientesDto;
import mx.edu.utez.CurpDiagRFEM.model.entity.ClientesBean;

import java.util.List;

public interface ICliente {
    ClientesBean save(ClientesDto clientesDto);
    ClientesBean findById(Integer id);
    void delete (ClientesBean clientesBean);
    List<ClientesBean> showAll();
}
