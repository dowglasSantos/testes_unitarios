package mock.test;

import mock.dao.ClientServiceMockDAO;
import mock.dao.ClienteServiceDAO;
import mock.services.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClientServiceTest {


    @Test
    public void salvar() {
        ClienteService service = new ClienteService(new ClientServiceMockDAO());
        String serviceMethod = service.salvar();

        Assert.assertEquals("sucesso", serviceMethod);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void errorSalvar() {
        ClienteService service = new ClienteService(new ClienteServiceDAO());
        String serviceMethod = service.salvar();

        Assert.assertEquals("sucesso", serviceMethod);
    }
}
