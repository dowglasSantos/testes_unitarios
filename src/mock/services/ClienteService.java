package mock.services;

import mock.dao.IClienteServiceDAO;

public class ClienteService {
    private IClienteServiceDAO clienteServiceDAO;

    public ClienteService(IClienteServiceDAO clienteServiceDAO){
        this.clienteServiceDAO = clienteServiceDAO;
    }

    public String salvar() {
        clienteServiceDAO.salvar();
        return "sucesso";
    }
}
