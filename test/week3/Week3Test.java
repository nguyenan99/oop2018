package week3;

import org.junit.Assert;
import org.junit.Test;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testmax1()
    {
        Week3 a = new Week3();
        Assert.assertEquals(5,a.max(3,5));



    }
    @Test
    public void testmax2()
    {
        Week3 a = new Week3();
        Assert.assertEquals(6,a.max(4,6));
    }
    @Test
    public void testmax3()
    {
        Week3 a = new Week3();
        Assert.assertEquals(0,a.max(-3,0));
    }
    @Test
    public void testmax4()
    {
        Week3 a = new Week3();
        Assert.assertEquals(1,a.max(1,1));
    }
    @Test
    public void testmax5()
    {
        Week3 a = new Week3();
        Assert.assertEquals(3,a.max(1,3));
    }


    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testminOfArray1()
    {
        Week3 a = new Week3();
        int []m1  = new int[]{2,20,4,5,8};
        Assert.assertEquals(2,a.minOfArray(m1));
    }
    @Test
    public void testminOfArray2()
    {
        Week3 a = new Week3();
        int []m2 = new int[]{2,4,1,50,35,60,22,0,-9,29};
        Assert.assertEquals(-9,a.minOfArray(m2));
    }
    @Test
    public void testminOfArray3()
    {
        Week3 a = new Week3();
        int []m3= new int[]{9,-7,20,37,12,64};
        Assert.assertEquals(-7,a.minOfArray(m3));
    }
    @Test
    public void testminOfArray4()
    {
        Week3 a = new Week3();
        int []m4= new int[]{-5,9,21,34,57,68,96,-32};
        Assert.assertEquals(-32,a.minOfArray(m4));
    }
    @Test
    public void testminOfArray5()
    {
        Week3 a = new Week3();
        int []m5 = new int[]{35,67,82,32,15,90,105};
        Assert.assertEquals(15,a.minOfArray(m5));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI1()
    {
        Week3 a = new Week3();
        Assert.assertEquals("Thiếu cân",a.calculateBMI(65,1.9));
    }
    @Test
    public void testCalculateBMI2()
    {
        Week3 a = new Week3();
        Assert.assertEquals("Thiếu cân",a.calculateBMI(50,1.7));
    }
    @Test
    public void testCalculateBMI3()
    {
        Week3 a = new Week3();
        Assert.assertEquals("Bình thường",a.calculateBMI(50,1.5));
    }
    @Test
    public void testCalculateBMI4()
    {
        Week3 a = new Week3();
        Assert.assertEquals("Thừa cân",a.calculateBMI(65,1.65));
    }
    @Test
    public void testCalculateBMI5()
    {
        Week3 a = new Week3();
        Assert.assertEquals("Béo phì",a.calculateBMI(70,1.64));
    }
}
