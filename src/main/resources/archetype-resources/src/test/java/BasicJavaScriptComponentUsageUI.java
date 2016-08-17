package ${package};

import com.vaadin.ui.Component;
import ${package}.jsexample.MyJavaScriptComponent;
import org.vaadin.addonhelpers.AbstractTest;

public class BasicJavaScriptComponentUsageUI extends AbstractTest {

    public static final String INITIAL_VALUE = "Foo!";

    @Override
    public Component getTestComponent() {
        MyJavaScriptComponent c = new MyJavaScriptComponent();
        c.setValue(INITIAL_VALUE);
        return c;
    }


}
