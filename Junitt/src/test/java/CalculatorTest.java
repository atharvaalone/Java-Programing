import org.example.Calculator;
import org.junit.*;

public class CalculatorTest {
    Calculator cal=new Calculator();
    @BeforeClass
    public static void beforeClass(){
        System.out.println("This is @BeforeClass");

    }
    @AfterClass
    public static void afterclass(){
        System.out.println("This is @AfterClass");
    }
    @Before
    public void before(){
        System.out.println("This is @before");
    }
    @After
    public void after(){
        System.out.println("This is @after");
    }

    @Test
    public void testAddition(){
        int result=cal.addition(10,20);
        Assert.assertEquals(30,result);
    }
    @Test
    public void testSubstraction(){
        int result=cal.subtraction(20,10);
        Assert.assertEquals(10,result);
    }
    @Test
    public void testMultiplication(){
        int result=cal.multiplication(10,20);
        Assert.assertEquals(200,result);
    }
    @Test
    public void testDivide(){
        int result=cal.divide(20,10);
        Assert.assertEquals(2,result);
    }





}
