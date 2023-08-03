import org.junit.Assert;
import org.junit.Test;

public class FindMaxTest {
@Test
    public void testmax(){
        FindMax findMax=new FindMax();
    Assert.assertEquals(5,findMax.maxNumber(new int[] {1,2,3,4,5}));
    }
}
