import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void ifGivenThreeIntNumber_withMaxAtFirstPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int max = (int) maximumNumber.getMaximum(10,5,1);
        Assert.assertEquals(10,max);
    }

    @Test
    public void ifGivenThreeIntNumber_withMaxAtSecondPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int max = (int) maximumNumber.getMaximum(5,10,1);
        Assert.assertEquals(10,max);
    }

    @Test
    public void ifGivenThreeIntNumber_withMaxAtThirdPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int max = (int) maximumNumber.getMaximum(5,1,10);
        Assert.assertEquals(10,max);
    }

    @Test
    public void ifGivenThreeFloatNumber_withMaxAtFirstPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float max = (float) maximumNumber.getMaximum(10.1f,5.1f,1.1f);
        Assert.assertEquals(10.1f,max,0.0);
    }

    @Test
    public void ifGivenThreeFloatNumber_withMaxAtSecondPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float max = (float) maximumNumber.getMaximum(5.1f,10.1f,1.1f);
        Assert.assertEquals(10.1f,max,0.0);
    }

    @Test
    public void ifGivenThreeFloatNumber_withMaxAtThirdPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float max = (float) maximumNumber.getMaximum(5.1f,1.1f,10.1f);
        Assert.assertEquals(10.1f,max,0.0);
    }

    @Test
    public void ifGivenThreeStringValues_withMaxAtFirstPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String max = (String) maximumNumber.getMaximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach",max);
    }

    @Test
    public void ifGivenThreeStringValues_withMaxAtSecondPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String max = (String) maximumNumber.getMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach",max);
    }

    @Test
    public void ifGivenThreeStringValues_withMaxAtThreePosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String max = (String) maximumNumber.getMaximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach",max);
    }

    @Test
    public void ifGivenThreeIntNumberToConstructor_withMaxAtFirstPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber(10,5,1);
        int max = (int) maximumNumber.testMaximum();
        Assert.assertEquals(10,max);
    }

    @Test
    public void ifGivenThreeIntNumberToConstructor_withMaxAtSecondPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber(5,10,1);
        int max = (int) maximumNumber.testMaximum();
        Assert.assertEquals(10,max);
    }

    @Test
    public void ifGivenThreeIntNumberToConstructor_withMaxAtThirdPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber(5,1,10);
        int max = (int) maximumNumber.testMaximum();
        Assert.assertEquals(10,max);
    }

    @Test
    public void ifGivenThreeFloatNumberToConstructor_withMaxAtFirstPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber(10.1f,5.1f,1.1f);
        float max = (float) maximumNumber.testMaximum();
        Assert.assertEquals(10.1f,max,0.0);
    }

    @Test
    public void ifGivenThreeFloatNumberToConstructor_withMaxAtSecondPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber(5.1f,10.1f,1.1f);
        float max = (float) maximumNumber.testMaximum();
        Assert.assertEquals(10.1f,max,0.0);
    }

    @Test
    public void ifGivenThreeFloatNumberToConstructor_withMaxAtThirdPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber(5.1f,1.1f,10.1f);
        float max = (float) maximumNumber.testMaximum();
        Assert.assertEquals(10.1f,max,0.0);
    }

    @Test
    public void ifGivenThreeStringValuesToConstructor_withMaxAtFirstPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber("Peach","Apple","Banana");
        String max = (String) maximumNumber.testMaximum();
        Assert.assertEquals("Peach",max);
    }

    @Test
    public void ifGivenThreeStringValuesToConstructor_withMaxAtSecondPosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber("Apple","Peach","Banana");
        String max = (String) maximumNumber.testMaximum();
        Assert.assertEquals("Peach",max);
    }

    @Test
    public void ifGivenThreeStringValuesToConstructor_withMaxAtThreePosition_shouldReturnMax() {
        MaximumNumber maximumNumber = new MaximumNumber("Apple","Banana","Peach");
        String max = (String) maximumNumber.testMaximum();
        Assert.assertEquals("Peach",max);
    }
}