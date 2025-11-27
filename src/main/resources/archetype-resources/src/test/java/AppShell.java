package ${package};

import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.aura.Aura;

// Use raw Aura theme in test UIs
@StyleSheet(Aura.STYLESHEET)
public class AppShell implements AppShellConfigurator {
}
