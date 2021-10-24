import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
//Kiểm thử lớp tương đương
public class SaleTest1 {
    @Test
    public void Test1() {
        Sale a = new Sale();
        Assert.assertEquals("No", a.CheckSale(24, 2, 1));
    }
}