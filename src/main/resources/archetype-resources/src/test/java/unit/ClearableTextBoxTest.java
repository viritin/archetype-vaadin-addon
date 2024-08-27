package ${package}.unit;


import ${package}.ClearableTextBox;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClearableTextBoxTest {

    @Test
    public void testGetTextField() {
        ClearableTextBox tb = new ClearableTextBox();
        assertNotNull(tb.getTextField());
        
        tb.getTextField().setValue("foo");
        assertEquals("foo", tb.getTextField().getValue());
    }
    
}
