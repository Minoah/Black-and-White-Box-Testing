import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
//Bảng quyết định
public class DecisionTest {
    @Test
    public void Test1() {
        Sale a = new Sale();
        Assert.assertEquals("Invalid", a.CheckSale(-1, 40, 0));
    }

    @Test
    public void Test2() {
        Sale a = new Sale();
        Assert.assertEquals("Invalid", a.CheckSale(2, -3, 1));
    }
    @Test
    public void Test3() {
        Sale a = new Sale();
        Assert.assertEquals("Invalid", a.CheckSale(5, 6, -3));
    }
    @Test
    public void Test4() {
        Sale a = new Sale();
        Assert.assertEquals("Invalid", a.CheckSale(71, 5, 7));
    }
    @Test
    public void Test5() {
        Sale a = new Sale();
        Assert.assertEquals("Invalid", a.CheckSale(35, 82, 90));
    }
    @Test
    public void Test6() {
        Sale a = new Sale();
        Assert.assertEquals("Invalid", a.CheckSale(35, 1, 94));
    }
    @Test
    public void Test7() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(0, 1, 1));
    }
    @Test
    public void Test8() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(2, 1, 49));
    }
    @Test
    public void Test9() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(2, 15, 0));
    }
    @Test
    public void Test10() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(0, 40, 45));
    }
    @Test
    public void Test11() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(15, 0, 1));
    }
    @Test
    public void Test12() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(51, 2, 45));
    }

    @Test
    public void Test13() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(25, 36, 1));
    }
    @Test
    public void Test14() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(3, 3, 4));
    }
    @Test
    public void Test15() {
        Sale a = new Sale();
        Assert.assertEquals("Yes", a.CheckSale(35, 40, 45));
    }
}