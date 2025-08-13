package exemplos_all_tests.Clientes;

import org.junit.Assert;
import org.junit.Test;

public class TesteClientes1 {
    @Test
    public void teste() {
        String nome = "TesteClientes1";
        Assert.assertEquals("TesteClientes1", nome);
    }
}
