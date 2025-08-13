package exemplos_all_tests.Clientes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TesteClientes1.class,
        TesteClientes2.class
})
public class AllClientesTest {
}
