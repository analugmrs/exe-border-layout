import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.WindowConstants;

public class Window extends JFrame {
	
	private BorderLayout layout = null;
	
	public Window() {
		
		super ("Teste BorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setPreferredSize(new Dimension(400,200));
		
		layout = new BorderLayout();
		setLayout(layout);
		
		layout.setHgap(5);
		layout.setVgap(5);
		
		add(new JButton("Norte"), BorderLayout.NORTH);
		add(new JButton("Sul"), BorderLayout.SOUTH);
		add(new JButton("Leste"), BorderLayout.EAST);
		add(new JButton("Oeste"), BorderLayout.WEST);
		add(new JButton("Centro"), BorderLayout.CENTER);
		
		pack();
		
		//getContentPane().setLayout(new BorderLayout());
		
		
		
	}

}
