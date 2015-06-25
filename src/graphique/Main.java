package graphique;
import javax.swing.*;

import parser.parser_logo;

import java.awt.*;
import java.awt.event.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import classeDuProgramme.*;


public class Main extends JFrame {
	private JCanvas jc = new JCanvas();
	private JPanel p1;
	private JPanel p2;
	private JButton b1;
	private JButton b2;
	private JLabel lab;
	private JMenuBar menuBar;
	private JTextArea text;
	private Etat etatCourant = new Etat();

	
	public Main(){
		initializegui();
	}
	
	public void paint(Graphics arg0) {
		super.paint(arg0);
		packgui();
	}
	
	private final void initializegui(){
		setVisible(true);
		setSize(1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1=new JPanel();
		p1.setBackground(Color.WHITE);
		
		p2=new JPanel();
		p2.setBackground(Color.WHITE);
		
		b1=new JButton("Enter"); 
		b2=new JButton("Clear");  //add listener to "Clear" button
		lab=new JLabel("Press ENTER, your instructions will be displayed here:)");
		text=new JTextArea("Enter the instructions", 4, 10);   
		text.setLineWrap(true);
		//add listeners to this JTextFiled after the background program is done
		
		JScrollPane jsp = new JScrollPane(text,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		JPanel jp =new JPanel() {
			public void paint(Graphics g) {
				super.paint(g); 
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, getWidth(), getHeight());
				jc.setLocation(jc.getParent().getWidth()/2-jc.getWidth()/2, 0);
				jc.repaint();
			}
		};
		jp.setLayout(null);

		jp.add(jc,BorderLayout.CENTER);
		jc.setSize(800,800);
		jc.rotateTurtleRight(1.50);
		
		add(jp,BorderLayout.CENTER);
		
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				jc.clear();
				text.setText("");
				lab.setText("");
			}
		});
		p2.add(b2);
	
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String str=text.getText();
				lab.setText(str);
				
				InputStream input = new ByteArrayInputStream(str.getBytes());
				parser_logo parser = new parser_logo (input);
				try
			    {
			      Programme programme = parser.program(jc);
			      System.out.println("OK.");
			      etatCourant = programme.executerProgramme(etatCourant);
			      System.out.println(etatCourant.toString());
			    }
			    catch (Exception exc)
			    {
			      System.out.println("NOK.");
			      exc.printStackTrace();
			    }
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
		
		
		/*ActionListener afficherMenuListener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("Elément de menu [" + event.getActionCommand()+ "] utilisé.");
			}
		};*/


			JMenu fichierMenu = new JMenu("File");
			JMenuItem item = new JMenuItem("New", 'N');
			item.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					jc.clear();
					text.setText("");
					lab.setText("");
				}
			});
			fichierMenu.add(item);
			
			
			
			item = new JMenuItem("Open", 'O');
			item.addActionListener(new ActionListener(){
				 public void actionPerformed(ActionEvent event) {
					   JFileChooser chooser = new JFileChooser();
					    chooser.showOpenDialog(null);
				    }
			});
			fichierMenu.add(item);
			
			
			
			item = new JMenuItem("Save", 'S');
			item.addActionListener(new ActionListener(){
				 public void actionPerformed(ActionEvent event) {
					   JFileChooser chooser = new JFileChooser();
					    chooser.showSaveDialog(null);
				    }
			});
			fichierMenu.insertSeparator(1);
			fichierMenu.add(item);
			
			
			
			item = new JMenuItem("Quit",'Q');
			item.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent event) {
			        System.exit(0);
			    }
			});
			fichierMenu.add(item);
		
			menuBar= new JMenuBar();
			menuBar.add(fichierMenu);
			setJMenuBar(menuBar);
	     
	    ImageIcon img= new ImageIcon("TortueConceptuelle.png");
	    setIconImage(img.getImage());
	    
	
	}
	private final void packgui(){
		
	}

	
	public static void main(String[] args)
	{
		 SwingUtilities.invokeLater(new Runnable() 
		 	{
			 public void run() 
			 {
	          Main main = new Main();
	          main.setVisible(true);
	         }
		 	}
		 );
	}
}
