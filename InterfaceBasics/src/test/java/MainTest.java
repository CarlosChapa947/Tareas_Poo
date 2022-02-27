import mx.uv.fiee.iinf.poo.Circle;
import mx.uv.fiee.iinf.poo.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void Test1 (){
        Circle circle1 = new Circle (10, 10, 20);
        Circle circle2 = new Circle (15, 15, 21);

        int resultCircles = circle1.compareTo (circle2);
        assertEquals(-1, resultCircles);
    }
    @Test
    public void Test2 (){
        Rectangle rec1 = new Rectangle (10, 10, 20, 20);
        Rectangle rec2 = new Rectangle (30, 30, 50, 50);

        int resultRecs = rec1.compareTo (rec2);
        assertEquals(-1, resultRecs);
    }
}
