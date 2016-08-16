package ${groupId};

import com.vaadin.ui.Component;
import org.test.jsexample.MyJavaScriptComponent;
import org.vaadin.addonhelpers.AbstractTest;

public class BasicJavaScriptComponentUsageUI extends AbstractTest {

    @Override
    public Component getTestComponent() {
        MyJavaScriptComponent c = new MyJavaScriptComponent();
        c.setValue("Foo!");
        return c;
    }

}
