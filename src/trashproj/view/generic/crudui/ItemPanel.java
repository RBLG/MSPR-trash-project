package trashproj.view.generic.crudui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

public class ItemPanel extends JPanel {
	private static final long serialVersionUID = 1L;

		protected JLabel iteminfo;
	/**
	 * Create the panel.
	 */
	public ItemPanel() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setLayout(null);
		
		this.iteminfo = new JLabel("info item");
		iteminfo.setBounds(10, 11, 321, 48);
		iteminfo.setVerticalAlignment(SwingConstants.TOP);
		iteminfo.setHorizontalAlignment(SwingConstants.LEFT);
		add(iteminfo);
		
		JButton btndel = new JButton("X");
		btndel.setBounds(395, 11, 45, 45);
		add(btndel);
		
		JButton btninfo = new JButton("+");
		btninfo.setBounds(340, 11, 45, 45);
		add(btninfo);

	}
}
