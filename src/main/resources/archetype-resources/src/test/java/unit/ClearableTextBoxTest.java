package ${groupId}.unit;
import org.junit.Test;
import org.test.ClearableTextBox;
import static org.junit.Assert.*;

public class ClearableTextBoxTest {

    @Test
    public void testGetTextField() {
        ClearableTextBox tb = new ClearableTextBox();
        assertNotNull(tb.getTextField());
        
        tb.getTextField().setValue("foo");
        assertEquals("foo", tb.getTextField().getValue());
    }
    
}
