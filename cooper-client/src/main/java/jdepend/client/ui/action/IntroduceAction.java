package jdepend.client.ui.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import jdepend.client.ui.JDependCooper;
import jdepend.client.ui.dialog.IntroduceDialog;

public class IntroduceAction extends AbstractAction {

	private JDependCooper frame;

	public IntroduceAction(JDependCooper frame) {
		super("介绍");
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		IntroduceDialog d = new IntroduceDialog(frame);
		d.setModal(true);
		d.setVisible(true);
	}
}