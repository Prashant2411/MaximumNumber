import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void ifGivenThreeNumber_withMaxAtFirstPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int max = maximumNumber.getMaximum(10,5,1);
        Assert.assertEquals(10,max);
    }

    @Test
    public void ifGivenThreeNumber_withMaxAtSecondPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int max = maximumNumber.getMaximum(5,10,1);
        Assert.assertEquals(10,max);
    }

    @Test
    public void ifGivenThreeNumber_withMaxAtThirdPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int max = maximumNumber.getMaximum(5,1,10);
        Assert.assertEquals(10,max);
    }
}