package ${groupId};

import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import org.vaadin.addonhelpers.AbstractTest;

public class BasicClearableTextBoxUsageUI extends AbstractTest {

    @Override
    public Component getTestComponent() {
        ClearableTextBox clearableTextBox = new ClearableTextBox();
        clearableTextBox.getTextField().setValue("Jorma");
        clearableTextBox.getTextField().addValueChangeListener(e -> {
            Notification.show(clearableTextBox.getTextField().getValue());
        });
        return clearableTextBox;
    }

}
