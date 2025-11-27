package ${package};

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@Route
public class BasicClearableTextBoxUsageUI extends VerticalLayout {

    public BasicClearableTextBoxUsageUI() {
        ClearableTextBox clearableTextBox = new ClearableTextBox();
        clearableTextBox.getTextField().setValue("Jorma");
        clearableTextBox.getTextField().addValueChangeListener(e -> {
            Notification.show(clearableTextBox.getTextField().getValue());
        });
        add(clearableTextBox);
    }

}
