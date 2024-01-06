package mx.edu.utez.CurpDiagRFEM.model.dao;

import mx.edu.utez.CurpDiagRFEM.model.entity.ClientesBean;
import org.springframework.data.repository.CrudRepository;

public interface ClientesDao extends CrudRepository<ClientesBean, Integer> {
}
