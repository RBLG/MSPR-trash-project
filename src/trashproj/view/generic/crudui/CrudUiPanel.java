package trashproj.view.generic.crudui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CrudUiPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField txtTest;

	/**
	 * Create the panel.
	 */
	public CrudUiPanel() {
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 49, 652, 480);
		add(panel);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 11, 27, 27);
		add(btnNewButton);

		txtTest = new JTextField();
		txtTest.setBounds(88, 11, 537, 27);
		add(txtTest);
		txtTest.setColumns(10);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(635, 11, 27, 27);
		add(btnNewButton_1);

	}
}
