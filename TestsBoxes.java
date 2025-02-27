import org.junit.*;
import static org.junit.Assert.assertEquals;
public class TestsBoxes{
    @Test
    public void testBoxCreate() {
        Box b = new Box();
    }
    /** on veut pouvoir mettre des trucs dedans */
    @Test
    public void testBoxAdd(){
    Box b = new Box();
    Thing truc1 = new Thing("truc1");
    Thing truc2 = new Thing("truc2");
    b.add(truc1);
    b.add(truc2);
    }
}