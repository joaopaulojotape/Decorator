import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CamisetaDecoratorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }
   @Test
  public void testCamisetaSporty() {
        Camiseta sportyCamiseta = new CamisetaSporty(new CamisetaBasica());
        sportyCamiseta.assemble();
        assertEquals("Camiseta Sporty", sportyCamiseta.assemble());
    }

    @Test
    public void testCamisetaLuxo() {
        Camiseta CamisetaLuxo = new CamisetaDeLuxo(new CamisetaBasica());
        CamisetaLuxo.assemble();
        assertEquals("Camiseta luxo",CamisetaLuxo.assemble());
    }

    @Test
    public void testCamisetaCasual() {
        Camiseta casualCamiseta = new CamisetaCasual(new CamisetaBasica());
        casualCamiseta.assemble();
        assertEquals("Camiseta Casual", casualCamiseta.assemble());
    }


}

