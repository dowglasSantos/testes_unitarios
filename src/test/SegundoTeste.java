package test;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTeste {
    @Test
    public void teste2() {
        String name = "Douglas";
        Assert.assertNotEquals("Dowglas", name);
    }
}
