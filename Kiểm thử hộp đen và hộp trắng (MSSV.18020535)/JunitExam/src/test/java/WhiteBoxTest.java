import org.junit.Assert;
import org.junit.Test;

//Kiểm thử độ đo C2
public class WhiteBoxTest {
    @Test
    public void Test1() {
        Sale a = new Sale();
        Assert.assertEquals("Invalid", a.CheckSale(71, 0, 1));
    }

    @Test
    public void Test2() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(5, 2, 10));
    }
    @Test
    public void Test3() {
        Sale a = new Sale();
        Assert.assertEquals("Yes", a.CheckSale(14, 17, 5));
    }

}