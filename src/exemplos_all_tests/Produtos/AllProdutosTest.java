package exemplos_all_tests.Produtos;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TesteProdutos1.class,
        TesteProdutos2.class
})
public class AllProdutosTest {
}
