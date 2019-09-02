import org.junit.Assert;
import org.junit.Test;

public class FinderTest {
    int singleElementArray [] = {-256};
    int multiElementArray [] = {1,25, -457, 56, 89975, 1};

@Test public void testValidateArrayWithEmptyArray(){
    String emptyArray [] = {};
    boolean actual = Finder.validateArray(emptyArray);
    Assert.assertFalse(actual);
}

@Test public void testValidateArrayWithNullArray(){
    String nullArray [] = null;
    boolean actual = Finder.validateArray(nullArray);
    Assert.assertFalse(actual);
}

@Test public void testFindMinWithValidSingleElementArray(){
    int result = Finder.findMin(singleElementArray);
    Assert.assertEquals(-256, result);
}

@Test public void testFindMinWithValidMultiElementArray(){
    int result = Finder.findMin(multiElementArray);
    Assert.assertEquals(-457, result);
}

@Test public void testFindMaxWithValidSingleElementArray(){
    int result = Finder.findMax(singleElementArray);
    Assert.assertEquals(-256, result);
}

@Test public void testFindMaxWithValidMultiElementArray(){
    int result = Finder.findMax(multiElementArray);
    Assert.assertEquals(89975, result);
}
}