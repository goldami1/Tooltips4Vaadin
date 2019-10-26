package dev.mett.vaadin.tooltip;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.server.Command;

final class TooltipsUtil {
    private TooltipsUtil() {}

    /**
     * Executes a given {@link Command} after ensuring that the {@link UI} is accessible or already accessed.
     * 
     * @param ui
     * @param command
     */
    static void securelyAccessUI(UI ui, Command command) {
        if(ui != null && !ui.isClosing() && ui.getSession() != null) {
            if(ui.getSession().hasLock()) {
                command.execute();
            } else {
                ui.access(command);
            }
        }
    }
}