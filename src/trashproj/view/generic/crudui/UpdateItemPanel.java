package trashproj.view.generic.crudui;

import javax.swing.JPanel;
import javax.swing.JButton;

public class UpdateItemPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public UpdateItemPanel() {
		setLayout(null);
		
		JButton btnvalidate = new JButton("Valider");
		btnvalidate.setBounds(10, 11, 89, 23);
		add(btnvalidate);
		
		JButton btnabbort = new JButton("X");
		btnabbort.setBounds(401, 11, 39, 23);
		add(btnabbort);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 45, 430, 244);
		add(panel);

	}
}
