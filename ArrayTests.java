import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceWith5Elements(){
    int[] input1 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] {3, 2, 1}, input1);
  }

  @Test
  public void testReversedWith5Elements(){
    int[] input1 = {1, 2, 3, 4, 5};
    int[] newArray = ArrayExamples.reversed(input1);
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, newArray);
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {1, 2, 3, 4, 5};
    double average = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(3.5, average);
  }
}
