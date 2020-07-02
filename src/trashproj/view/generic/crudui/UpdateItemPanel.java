package trashproj.view.generic.crudui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UpdateItemPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public UpdateItemPanel() {
		setLayout(null);
		
		JButton btnvalidate = new JButton("Valider");
		btnvalidate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				validate();
			}
		});
		btnvalidate.setBounds(10, 11, 89, 23);
		add(btnvalidate);
		
		JButton btnabbort = new JButton("X");
		btnabbort.setBounds(401, 11, 39, 23);
		add(btnabbort);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 45, 430, 244);
		add(panel);

	}
	
	//TODO
	public void onOpening() {
		
	}
	
	//TODO
	public void acceptAction() {
		
	}
	
	//TODO
	public void abortAction() {
		
	}
}
