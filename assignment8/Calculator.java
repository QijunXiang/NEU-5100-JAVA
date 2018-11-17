package assignment8;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

enum Operation {
	ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Calculator extends JFrame{

	//private static final ActionListener  = null;
	private JTextField rs;
	private JButton add, subtract, multiply, divide, compute;
	
	private JButton[] nums;
	
	private Font font;
	
	private long first;
	private long second;
	
	boolean firstIsSet;
	
	private Operation o;
	
	
	public Calculator() {
		firstIsSet = false;
		createComponents();
		setLayout();
		addComponents();
		addBehaviors();
		display();
	}
	
	long getFirst() {
		return this.first;
	}
	
	void setFirst(int val) {
		this.first = val;
	}
	
	
	long getSecond() {
		return this.second;
	}
	
	void setSecont(int val) {
		this.second = val;
	}
	
	void setFirstState(boolean state) {
		firstIsSet = state;
	}
	
	private void createComponents( ) {
		font = new Font("TimesRoman", Font.PLAIN, 36);
		rs = new JTextField();
		rs.setFont(font);
		add = new JButton("+");
		add.setFont(font);
		subtract = new JButton("-");
		subtract.setFont(font);
		multiply = new JButton("*");
		multiply.setFont(font);
		divide = new JButton("/");
		divide.setFont(font);
		compute = new JButton("compute");
		compute.setFont(font);
		
		nums = new JButton[9];
		
		for(int i = 0; i < 9; i++ ) {
			nums[i] = new JButton(i+1+"");
			nums[i].setFont(font);
		}
		
	}
	
	private void setLayout() {
		GridLayout gl = new GridLayout(6, 1);
		Container c =  this.getContentPane();
		c.setLayout(gl);
	}
	
	private void addComponents() {

		Container c = getContentPane();
		c.add(rs);

		JPanel panel = new JPanel();
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		c.add(panel);

		panel = new JPanel();
		panel.add(compute);
		c.add(panel);

		JPanel p = new JPanel();
		p.add(nums[0]);
		p.add(nums[1]);
		p.add(nums[2]);

		c.add(p);

		p = new JPanel();
		p.add(nums[3]);
		p.add(nums[4]);
		p.add(nums[5]);

		c.add(p);

		p = new JPanel();
		p.add(nums[6]);
		p.add(nums[7]);
		p.add(nums[8]);

		c.add(p);
	}
	
	private void addBehaviors() {
		Computelistener cl = new Computelistener();
		compute.addActionListener(cl);
		Operationlistener ol = new Operationlistener();
		add.addActionListener(ol);
		subtract.addActionListener(ol);
		multiply.addActionListener(ol);
		divide.addActionListener(ol);
		
		for(int i = 0; i <= 8; i++) {
			Numlistener nl = new Numlistener();
			nums[i].addActionListener(nl);
		}
		
	}
	
	private void display() {
		setSize(600, 600);
		setVisible(true);
		
	}
	
	public class Computelistener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			long ans = 0;
			if(o == Operation.ADD) {
				ans = first + second;
			}
			if(o == Operation.SUBTRACT) {
				ans = first - second;
			}
			if(o == Operation.MULTIPLY) {
				ans = first * second;
			}
			if(o == Operation.DIVIDE) {
			    ans = first / second;
			}
			rs.setText(ans+"");
			
			firstIsSet = false;
			first = 0;
			second = 0;
		}

	}
	
	public class Operationlistener implements ActionListener{ 
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == add) {
				o = Operation.ADD;
			}
			if(e.getSource() == subtract) {
				o = Operation.SUBTRACT;
			}
			if(e.getSource() == multiply) {
				o = Operation.MULTIPLY;
			}
			if(e.getSource() == divide) {
				o = Operation.DIVIDE;
			}
			firstIsSet = true;
		}

	}
	
	public class Numlistener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if(firstIsSet == false) {
				for(int i = 0; i <= 8; i++) {
					if(e.getSource() == nums[i]) {
						first = first * 10 + i + 1;
						rs.setText(first+"");
						break;
					}
				}
			} else {
				for(int i = 0; i <= 8; i++) {
					if(e.getSource() == nums[i]) {
						second = second * 10 + i + 1;
						//rs = new JTextField(second+"");
						rs.setText(second+"");
						break;
					}
				}
			}
			
		}
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
