import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class RectangleTestNGTests {

    @Test
    public void testRectangleLength() {
        Rectangle rectangle = new Rectangle(7.7, 8.7);
        assertEquals(rectangle.getLength(), 7.7, 0.01, "The length is calculated incorrectly.");
        System.out.println("Test Rectangle Length: Passed !");
    }

    @Test
    public void testRectangleWidth() {
        Rectangle rectangle = new Rectangle(7.7, 8.7);
        assertEquals(rectangle.getWidth(), 8.7, 0.01, "The width is calculated incorrectly.");
        System.out.println("Test Rectangle Width: Passed !");
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(7.7, 8.7);
        assertEquals(rectangle.getArea(), 66.99, 0.01, "The area is calculated incorrectly.");
        System.out.println("Test Rectangle Area: Passed !");
    }
}