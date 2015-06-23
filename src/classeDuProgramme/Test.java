package classeDuProgramme;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;





/**
 * classe Test
 * 
 *
 */
public class Test extends JFrame {
	private JPanel p1;
	private JPanel p2;
	private JButton b1;
	private JButton b2;
	private JLabel lab;
	private JMenu menu;
	private JMenuBar menuBar;
	private JTextArea text;

	
	public Test(){
		initializegui();
	}
	@Override
	public void paint(Graphics arg0) {
		super.paint(arg0);
		packgui();
	}
	JCanvas jcanvas;
	
	
	private final void initializegui(){
		setVisible(true);
		setSize(1200, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1=new JPanel();
		p1.setBackground(Color.WHITE);
		
		p2=new JPanel();
		p2.setBackground(Color.WHITE);
		
		b1=new JButton("Enter"); 
		b2=new JButton("Clear");  //add listener to "Clear" button
		lab=new JLabel("Press ENTER, your instructions will be displayed here:)");
		text=new JTextArea("Enter the instructions", 4, 10);   
		//text.setLineWrap(true);
		//add listeners to this JTextFiled after the background program is done
		
		JScrollPane jsp = new JScrollPane(text,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		p2.add(b2);
		

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String str=text.getText();
				lab.setText(str);
			}
		});
		//p1.add(lab);
		
		add(p1,BorderLayout.NORTH);
				
		
		GroupLayout layout = new GroupLayout(p1);
		p1.setLayout(layout);

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.setHorizontalGroup(
		   layout.createSequentialGroup()
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		           .addComponent(jsp)
		           .addComponent(lab))
		      .addComponent(b1)
		      
		);
		layout.setVerticalGroup(
		   layout.createSequentialGroup()
		      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
		           .addComponent(jsp)
		           .addComponent(b1))
		      .addComponent(lab)
		);

		
		
		add(p2,BorderLayout.SOUTH);
		
		
		
		//Be able to read a complete program to paint
		menu=new JMenu("File");
		//JMenuItem item1 = new JMenuItem("New file", 'N');
		//JMenuItem item2 = new JMenuItem("Open", 'N');
		menuBar= new JMenuBar();
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		jcanvas = new JCanvas();
	 
		add(jcanvas,BorderLayout.CENTER);
	     
	    ImageIcon img= new ImageIcon("tortue ninja.png");
	    setIconImage(img.getImage());
	    
	
	}
	private final void packgui(){
		//pack();
		jcanvas.repaint();
	}

	
	public static void main(String[] args){
		 SwingUtilities.invokeLater(new Runnable() {
	     @Override
	     public void run() {
	          Test ex = new Test();
	              ex.setVisible(true);
	            }
	        });
	}
}
