package jdepend.report.ui;

import jdepend.framework.ui.CooperDialog;
import jdepend.framework.ui.JDependFrame;
import jdepend.model.Component;
import jdepend.model.JDependUnitMgr;
import jdepend.report.way.mapui.GraphPanel;

public final class BalanceComponentDialog extends CooperDialog {

	private String componentName;

	public BalanceComponentDialog(JDependFrame frame, String componentName) {
		super(componentName + "内聚性");
		this.componentName = componentName;

				Component component = JDependUnitMgr.getInstance().getResult().getTheComponent(this.componentName);

		this.add(new GraphPanel(frame, this, component.open()));

	}

}
