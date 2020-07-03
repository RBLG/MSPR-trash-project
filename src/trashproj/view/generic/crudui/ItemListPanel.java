package trashproj.view.generic.crudui;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JToggleButton;

import java.util.ArrayList;

import javax.swing.JButton;

public abstract class ItemListPanel<ITEM extends Item> extends JPanel {
	private static final long serialVersionUID = 1L;

	JList<ItemPanel> listitem;
	
	/**
	 * Create the panel.
	 */
	public ItemListPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 44, 450, 256);
		add(panel);
		
		listitem = new JList<ItemPanel>();
		panel.add(listitem);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(10, 10, 121, 23);
		//add(tglbtnNewToggleButton);
		
		JPanel item = new ItemPanel();
		panel.add(item);
		
		JButton btnrefresh = new JButton("Refresh");
		btnrefresh.setBounds(351, 10, 89, 23);
		add(btnrefresh);

	}
	
	//TODO
	public void loadList(ItemManager<ITEM> manager) {
		listitem.removeAll();
		ArrayList<ITEM> list= manager.select("");
		for(ITEM item:list) {
			listitem.add(this.loadPanel(item));
		}
	}
	
	abstract protected ItemPanel loadPanel(ITEM item);
}
