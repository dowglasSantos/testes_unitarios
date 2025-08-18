package mock.dao;

import org.junit.internal.AssumptionViolatedException;

public class ClienteServiceDAO implements IClienteServiceDAO{
    @Override
    public String salvar() {
        throw new UnsupportedOperationException("ClienteServiceDAO");
    }
}
