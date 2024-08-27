package ${package};

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A really simple example of a server side composition.
 */
public class ClearableTextBox extends HorizontalLayout {
    
    private TextField textField = new TextField();
    private Button clearBtn = new Button(VaadinIcon.CLOSE.create());

    public ClearableTextBox() {
        add(textField, clearBtn);
        clearBtn.addClickListener(e->{textField.clear();});
    }

    public TextField getTextField() {
        return textField;
    }
    
}