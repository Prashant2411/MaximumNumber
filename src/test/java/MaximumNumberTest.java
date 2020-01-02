import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void ifGivenThreeIntNumber_withMaxAtFirstPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int max = maximumNumber.getMaximum(10,5,1);
        Assert.assertEquals(10,max);
    }

    @Test
    public void ifGivenThreeIntNumber_withMaxAtSecondPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int max = maximumNumber.getMaximum(5,10,1);
        Assert.assertEquals(10,max);
    }

    @Test
    public void ifGivenThreeIntNumber_withMaxAtThirdPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int max = maximumNumber.getMaximum(5,1,10);
        Assert.assertEquals(10,max);
    }

    @Test
    public void ifGivenThreeFloatNumber_withMaxAtFirstPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float max = maximumNumber.getMaximum(10.1f,5.1f,1.1f);
        Assert.assertEquals(10.1f,max,0.0);
    }

    @Test
    public void ifGivenThreeFloatNumber_withMaxAtSecondPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float max = maximumNumber.getMaximum(5.1f,10.1f,1.1f);
        Assert.assertEquals(10.1f,max,0.0);
    }

    @Test
    public void ifGivenThreeFloatNumber_withMaxAtThirdPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float max = maximumNumber.getMaximum(5.1f,1.1f,10.1f);
        Assert.assertEquals(10.1f,max,0.0);
    }
}