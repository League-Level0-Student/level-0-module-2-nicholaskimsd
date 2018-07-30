import javax.swing.JOptionPane;

public class afefew {
@SuppressWarnings("unused")
public static void main(String[] args) {
	String joe= JOptionPane.showInputDialog("how old are you");
	int cats = Integer.parseInt(joe);
	if(cats>17) {
	JOptionPane.showMessageDialog(null,"you can vote.  Change America, make it great");
	}
	else {
		JOptionPane.showMessageDialog(null,"you are to young get a life");
	}
}
}
