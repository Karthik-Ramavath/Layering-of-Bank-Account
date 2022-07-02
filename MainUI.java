import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MainUI extends JFrame implements ActionListener
{
	BranchUI ob1;
	AccountUI	ob2;
	CustomerUI ob3;
	
	
	JButton submit,modify,delete,m1,m2,m3;
	JPanel p1,p2,p3,pb;
	JMenuBar mb;
	
	public MainUI()
	{
		setSize(600,550);
		setLayout(null);
		setVisible(true);
		setTitle("Layering of Bank Account");
		
		ob1 = new BranchUI();
		ob2 = new AccountUI();
		ob3 = new CustomerUI();
		
		
		createPanels();
		createMenu();	
		createButtons();
		addComponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void createPanels()
	{
		p1 = ob1.p;
		p2 = ob2.p;
		p3 = ob3.p;
		
		
		
		pb = new JPanel(new FlowLayout(FlowLayout.CENTER,50,0));
		pb.setBounds(0,400,600,150);
	}
	
	void createMenu()
	{
		mb = new JMenuBar();
		
		m1 = new JButton("Branch");
		m1.setFocusable(false);
		
		m2 = new JButton("Account");
		m2.setFocusable(false);
		
		
		m3 = new JButton("Customer");
		m3.setFocusable(false);
		
	
		
		
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		remove(p1);
		remove(p2);
		remove(p3);
		
		if(e.getSource()==m1)
			add(p1);
		
		else if(e.getSource()==m2)
			add(p2);
			
		
		else
			add(p3);
	}
	
	void createButtons()
	{
		submit = new JButton("Submit");
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(new JFrame(),"Successfully Inserted!","NOTICE",JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		
		
		modify = new JButton("Modify");
		modify.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(new JFrame(),"Successfully Modified!","NOTICE",JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		
		
		delete = new JButton("Delete");
		delete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(new JFrame(),"Successfully Deleted!","NOTICE",JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		
		pb.add(submit);
		pb.add(modify);
		pb.add(delete);
	}
	
	void addComponents()
	{
		add(p1);
		add(pb);
		setJMenuBar(mb);
	}
	
	public static void main(String a[])
	{
		new MainUI();
	}
}