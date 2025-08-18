package mock.test;

import mock.dao.ClientServiceMockDAO;
import mock.services.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClientServiceTest {
    ClienteService service = new ClienteService(new ClientServiceMockDAO());

    String serviceMethod = service.salvar();

    @Test
    public void salvar() {
        Assert.assertEquals("sucesso", serviceMethod);
    }
}
