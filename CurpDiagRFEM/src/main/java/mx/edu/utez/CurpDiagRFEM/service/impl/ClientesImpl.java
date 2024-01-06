package mx.edu.utez.CurpDiagRFEM.service.impl;

import lombok.AllArgsConstructor;
import mx.edu.utez.CurpDiagRFEM.model.dao.ClientesDao;
import mx.edu.utez.CurpDiagRFEM.model.dto.ClientesDto;
import mx.edu.utez.CurpDiagRFEM.model.entity.ClientesBean;
import mx.edu.utez.CurpDiagRFEM.service.ICliente;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor

public class ClientesImpl implements ICliente {

    private final ClientesDao clientesDao;

    @Override
    @Transactional
    public ClientesBean save(ClientesDto clientesDto) {
        ClientesBean clientesSave = ClientesBean.builder()
                .idCliente(clientesDto.getIdCliente())
                .nombreCliente(clientesDto.getNombreCliente())
                .apellidosCliente(clientesDto.getApellidosCliente())
                .CURP(clientesDto.getCURP())
                .fechaNac(clientesDto.getFechaNac())
                .build();
        return clientesDao.save(clientesSave);
    }

    @Override
    @Transactional(readOnly = true)
    public ClientesBean findById(Integer id) { return clientesDao.findById(id).orElse(null); }

    @Override
    @Transactional
    public void delete(ClientesBean clientesBean) { clientesDao.delete(clientesBean); }

    @Override
    @Transactional(readOnly = true)
    public List<ClientesBean> showAll() { return (List<ClientesBean>) clientesDao.findAll(); }
}
