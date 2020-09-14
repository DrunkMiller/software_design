import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.*;

public class AreaTests extends Assert {
    @Test
    public void rectangleAreaTest() {
        HashMap<Rectangle, Double> testData = new HashMap<Rectangle, Double>();
        testData.put(new Rectangle(1, 0), 1.0 * 0);
        testData.put(new Rectangle(5.5, 2), 5.5 * 2);
        testData.put(new Rectangle(3, 7.1), 3 * 7.1);
        testData.put(new Rectangle(9.4, 2.3), 9.4 * 2.3);
        testData.put(new Rectangle(8, 8), 8.0 * 8);
        Iterator iterator = testData.keySet().iterator();
        while (iterator.hasNext()){
            Rectangle rect = (Rectangle) iterator.next();
            assertEquals(rect.area(), testData.get(rect).doubleValue(), 1e-5);
        }
    }

    @Test
    public void squareAreaTest () {
        HashMap<Square, Double> testData = new HashMap<Square, Double>();
        testData.put(new Square(0), 0.0 * 0);
        testData.put(new Square(5.5), 5.5 * 5.5);
        testData.put(new Square(3), 3.0 * 3);
        testData.put(new Square(9.12), 9.12 * 9.12);
        testData.put(new Square(8), 8.0 * 8);
        Iterator iterator = testData.keySet().iterator();
        while (iterator.hasNext()){
            Square square = (Square) iterator.next();
            assertEquals(square.area(), testData.get(square).doubleValue(), 1e-5);
        }
    }

    @Test
    public void circleAreaTest () {
        HashMap<Circle, Double> testData = new HashMap<Circle, Double>();
        testData.put(new Circle(0), Math.PI * 0 * 0);
        testData.put(new Circle(5), Math.PI * 5 * 5);
        testData.put(new Circle(3.33), Math.PI * 3.33 * 3.33);
        testData.put(new Circle(9), Math.PI * 9 * 9);
        testData.put(new Circle(8.1), Math.PI * 8.1 * 8.1);
        Iterator iterator = testData.keySet().iterator();
        while (iterator.hasNext()){
            Circle circle = (Circle) iterator.next();
            assertEquals(circle.area(), testData.get(circle).doubleValue(), 1e-5);
        }
    }
}