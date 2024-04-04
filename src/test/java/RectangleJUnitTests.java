import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleJUnitTests {

        @Test
        public void testRectangleLength() {
            Rectangle rectangle = new Rectangle(7.7, 8.7);
            assertEquals("The length is calculated incorrectly.", 7.7, rectangle.getLength(), 0.01);
            System.out.println("Test Rectangle Length: Passed !");
        }

        @Test
        public void testRectangleWidth() {
            Rectangle rectangle = new Rectangle(7.7, 8.7);
            assertEquals("The width is calculated incorrectly.", 8.7, rectangle.getWidth(), 0.01);
            System.out.println("Test Rectangle Width: Passed !");
        }

        @Test
        public void testRectangleArea() {
            Rectangle rectangle = new Rectangle(7.7, 8.7);
            assertEquals("The area is calculated incorrectly.", 66.99, rectangle.getArea(), 0.01);
            System.out.println("Test Rectangle Area: Passed !");
        }


}
