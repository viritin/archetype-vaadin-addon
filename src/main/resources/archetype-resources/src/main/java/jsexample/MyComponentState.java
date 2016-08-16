package ${groupId}.jsexample;

import com.vaadin.shared.ui.JavaScriptComponentState;

public class MyComponentState extends JavaScriptComponentState {

  private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }    
    
}