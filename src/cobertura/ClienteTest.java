package cobertura;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {
    Cliente cliente = new Cliente("Dowglas");

    @Test
    public void test() {
        Assert.assertEquals("Dowglas", cliente.getNome());
    }
}
