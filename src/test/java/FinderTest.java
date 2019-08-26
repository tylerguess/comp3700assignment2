import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class FinderTest {

    @Test public void minTest() {
        int[] arr = {4, 8, 19, -3, 22, 1};
        int result = Finder.findMin(arr);
        Assert.assertEquals(result, -3);
    }

    @Test public void maxTest() {
        int[] arr = {4, 8, 19, -3, 22, 1};
        int result = Finder.findMax(arr);
        Assert.assertEquals(result, 22);
    }

    @Test public  void nullTest() {
        int[] arr = null;
        java.lang.Integer result = Finder.findMin(arr);
        java.lang.Integer result2 = Finder.findMax(arr);
        Assert.assertEquals(result, null);
        Assert.assertEquals(result2, null);
    }

    @Test public void emptyTest() {
        int[] arr = {};
        java.lang.Integer result = Finder.findMin(arr);
        java.lang.Integer result2 = Finder.findMax(arr);
        Assert.assertEquals(result, null);
        Assert.assertEquals(result2, null);
    }

}
