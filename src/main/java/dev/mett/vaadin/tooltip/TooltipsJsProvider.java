package dev.mett.vaadin.tooltip;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@NpmPackage(value = "tippy.js", version = "5.1.2")
@JsModule("./js/tooltip/tooltips.js")
@Tag("div")
public class TooltipsJsProvider extends Component {
	private static final long serialVersionUID = 3079421969338830944L;
}