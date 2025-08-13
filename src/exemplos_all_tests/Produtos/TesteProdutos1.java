package exemplos_all_tests.Produtos;

import org.junit.Assert;
import org.junit.Test;

public class TesteProdutos1 {
    @Test
    public void teste() {
        String nome = "TesteProdutos1";
        Assert.assertEquals("TesteProdutos1", nome);
    }
}
