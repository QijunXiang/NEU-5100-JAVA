
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import assignment8.Operation;
import assignment8.Calculator.Computelistener;

public class StudentsApplication extends JFrame {

	JTable studentsTable;
	String id_content;
	String fn_content;
	String ln_content;
	String gender_content;
	//Students students;
	
	JTextField id ;
	JTextField fn;
	JTextField ln;
	JTextField gender;
	DefaultTableModel d_model;
	JScrollPane jsp;
	
	public StudentsApplication() {		
		d_model = new DefaultTableModel();
		Object[] columns = {"ROLL","First Name","Last Name","Gender"};
		d_model.setColumnIdentifiers(columns);
		String[] row1 = {"101", "Mihir", "Salunke", "female"};
		String[] row2 = {"100", "Divya", "Sharma", "male"};
		d_model.addRow(row1);
		d_model.addRow(row2);
		
		studentsTable = new JTable(d_model);
		jsp = new JScrollPane(studentsTable);
		JButton add = new JButton("Add");
		Font font = new Font("TimesRoman", Font.PLAIN, 36);
		add.setFont(font);
		
		JPanel panel1 = new JPanel();
		panel1.add(add);
		
		JPanel panel2 = new JPanel();
		id = new JTextField();
		fn = new JTextField();
		ln = new JTextField();
		gender = new JTextField();
		
		id.setPreferredSize(new Dimension(130,30));
		fn.setPreferredSize(new Dimension(130,30));
		ln.setPreferredSize(new Dimension(130,30));
		gender.setPreferredSize(new Dimension(130,30));
		
		JLabel id_label = new JLabel();
		JLabel fn_label = new JLabel();
		JLabel ln_label = new JLabel();
		JLabel gender_label = new JLabel();
		id_label.setText("ID");
		fn_label.setText("First Name");
		ln_label.setText("Last Name");
		gender_label.setText("Gender");
		panel2.add(id_label);
		panel2.add(id);
		panel2.add(fn_label);
		panel2.add(fn);
		panel2.add(ln_label);
		panel2.add(ln);
		panel2.add(gender_label);
		panel2.add(gender);

		GridLayout gl = new GridLayout(3, 1);
		Container con = getContentPane();
		con.setLayout(gl);
		con.add(jsp);
		con.add(panel2);
		con.add(panel1);
		
		Addlistener al = new Addlistener();
	    add.addActionListener(al);
	   
		setSize(400, 400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	
		StudentsApplication sa = new StudentsApplication();
	}
	
	class Addlistener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//Students s = new Students();
			id_content = id.getText();
			fn_content = fn.getText();
			ln_content = ln.getText();
			gender_content = gender.getText();
			if (id_content.trim().length()==0 || fn_content.trim().length()==0 || ln_content.trim().length()==0 || gender_content.trim().length()==0)
				return;
			String[] row = {id_content, fn_content, ln_content, gender_content};
			d_model.addRow(row);

		}

	}

}





