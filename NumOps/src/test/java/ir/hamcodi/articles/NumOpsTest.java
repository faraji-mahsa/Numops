package ir.hamcodi.articles;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *  * Unit test for simple App.
 *   */
public class NumOpsTest extends TestCase
{
    /**
 *      * Create the test case
 *           *
 *                * @param testName name of the test case
 *                     */
    public NumOpsTest( String testName )
    {
        super( testName );
    }

   

    public void testNumOps()
    {
    NumOps nops = new NumOps();
         assertTrue(nops.size() == 1);
         assertTrue(nops.getOp(0).getDesc().equals("plus"));
        assertTrue(nops.getOp(0).op(2,1) == 3);
                    
    }
}
