package ${groupId};

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.ValoTheme;

/**
 * A really simple example of a server side composition.
 */
public class ClearableTextBox extends CssLayout {
    
    private TextField textField = new TextField();
    private Button clearBtn = new Button(FontAwesome.TIMES);

    public ClearableTextBox() {
        addComponents(textField, clearBtn);
        setStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
        clearBtn.addClickListener(e->{textField.clear();});
    }

    public TextField getTextField() {
        return textField;
    }
    
}