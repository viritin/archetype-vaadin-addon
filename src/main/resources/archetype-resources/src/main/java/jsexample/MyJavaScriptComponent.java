package ${package}.jsexample;

import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.AbstractJavaScriptComponent;
import com.vaadin.ui.Notification;

/**
 * JavaScript component stub with basic state and client-server RPC.
 */
@JavaScript("component-connector.js")
public class MyJavaScriptComponent extends AbstractJavaScriptComponent {

    public MyJavaScriptComponent() {

        addFunction("onClick", args -> {
            setValue(args.getString(0));
            Notification.show("Value from the client: " + getValue());
        });

    }

    public void setValue(String value) {
        getState().setValue(value);
    }

    public String getValue() {
        return getState().getValue();
    }

    @Override
    protected MyComponentState getState() {
        return (MyComponentState) super.getState();
    }

}
