import org.junit.*;
import static org.junit.Assert.assertEquals;
public class TestsBoxes{
    @Test
    public void testBoxCreate() {
        Box b = new Box();
    }
    @Test
    public void testBoxAdd(){
    Box b = new Box();
    Thing truc1 = new Thing("truc1");
    Thing truc2 = new Thing("truc2");
    b.add(truc1);
    b.add(truc2);
    assertTrue(b.contains(truc1));
    assertTrue(b.contains(truc2));
    }
    @Test
    public void testBoxRemove() throws Exception {
        Box b = new Box();
        Thing truc = new Thing("truc");
        b.add(truc);
        b.remove(truc);
        assertFalse(b.contains(truc));
    }
    
    @Test(expected = Exception.class)
    public void testBoxRemoveNonExistent() throws Exception {
        Box b = new Box();
        Thing truc = new Thing("truc");
        b.remove(truc);
    }
    
    @Test
    public void testBoxOpenClose() {
        Box b = new Box();
        b.close();
        assertFalse(b.isOpen());
        b.open();
        assertTrue(b.isOpen());
    }
    
    @Test
    public void testActionLook() {
        Box b = new Box();
        assertEquals("La boîte est vide.", b.actionLook());
        Thing truc1 = new Thing("ceci");
        Thing truc2 = new Thing("cela");
        b.add(truc1);
        b.add(truc2);
        assertEquals("La boîte contient: ceci, cela", b.actionLook());
        b.close();
        assertEquals("La boîte est fermée.", b.actionLook());
    }
}
