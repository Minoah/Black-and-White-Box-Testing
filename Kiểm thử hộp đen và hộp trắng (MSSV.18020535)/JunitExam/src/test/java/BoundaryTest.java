import org.junit.Assert;
import org.junit.Test;
//Kiểm thử giá trị biên
public class BoundaryTest {
    @Test
    public void Test1() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(35, 40, 0));
    }

    @Test
    public void Test2() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(35, 40, 1));
    }
    @Test
    public void Test3() {
        Sale a = new Sale();
        Assert.assertEquals("Yes", a.CheckSale(35, 40, 45));
    }
    @Test
    public void Test4() {
        Sale a = new Sale();
        Assert.assertEquals("Yes", a.CheckSale(35, 40, 89));
    }
    @Test
    public void Test5() {
        Sale a = new Sale();
        Assert.assertEquals("Yes", a.CheckSale(35, 40, 90));
    }
    @Test
    public void Test6() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(35, 0, 45));
    }
    @Test
    public void Test7() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(35, 1, 1));
    }
    @Test
    public void Test8() {
        Sale a = new Sale();
        Assert.assertEquals("Yes", a.CheckSale(35, 79, 45));
    }
    @Test
    public void Test9() {
        Sale a = new Sale();
        Assert.assertEquals("Yes", a.CheckSale(35, 80, 45));
    }
    @Test
    public void Test10() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(0, 40, 45));
    }
    @Test
    public void Test11() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(1, 40, 45));
    }
    @Test
    public void Test12() {
        Sale a = new Sale();
        Assert.assertEquals("Yes", a.CheckSale(69, 40, 45));
    }

    @Test
    public void Test13() {
        Sale a = new Sale();
        Assert.assertEquals("Yes", a.CheckSale(70, 40, 45));
    }
}