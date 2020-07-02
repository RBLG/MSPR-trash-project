package trashproj.view.generic.crudui;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JToggleButton;

public class ItemListPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ItemListPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 44, 450, 256);
		add(panel);
		
		JList<ItemPanel> listitem = new JList<ItemPanel>();
		panel.add(listitem);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(10, 10, 121, 23);
		add(tglbtnNewToggleButton);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(135, 10, 89, 23);
		add(btnNewButton);
		
		JPanel item = new ItemPanel();
		panel.add(item);

	}
	
	//TODO
	public void loadList() {
		
	}
}
