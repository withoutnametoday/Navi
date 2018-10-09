package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import controlador.Main;

@SuppressWarnings("serial")
public class Apl_login extends JFrame {

	/**
	 * 
	 */
	private JPasswordField buffClave;
	private JTextField buffRut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apl_login frame = new Apl_login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private Apl_login() {
		setUndecorated(true);
		setResizable(false);
		getContentPane().setBackground(new Color(72, 209, 204));
		setFont(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Apl_login.class.getResource("/Image/NavCoin-NAV-icon.png")));
		setTitle("Navi ");
		setBounds(100, 100, 700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("\u00A1BIENVENIDO ESTUDIANTE!");
		lblNewLabel.setBounds(73, 25, 363, 46);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		JPanel panel = new JPanel();
		panel.setBounds(515, 0, 201, 416);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(0, 153, 255));
		panel.setLayout(null);
		
		JLabel label = new JLabel("Entrar");
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setBounds(80, 94, 46, 17);
		panel.add(label);
		
		JLabel lblClave = new JLabel("Clave:");
		lblClave.setBounds(12, 183, 39, 16);
		panel.add(lblClave);
		
		buffClave = new JPasswordField();
		buffClave.setBounds(59, 182, 98, 23);
		panel.add(buffClave);
		
		JLabel label_2 = new JLabel("Rut :");
		label_2.setBounds(12, 151, 25, 16);
		panel.add(label_2);
		
		buffRut = new JTextField();
		buffRut.setHorizontalAlignment(SwingConstants.LEFT);
		buffRut.setBounds(59, 151, 98, 20);
		panel.add(buffRut);
		
		JButton BtnIngresar = new JButton("Ingresar");
		BtnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String clav = String.valueOf(buffClave.getPassword());
				
				Main m = new Main();
				
				try {
					m.iniciarSecion(buffRut.getText(), clav);
					setVisible(false);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Problemas al recoger los datos");
				}
				
				
			}
		});
		BtnIngresar.setVerticalAlignment(SwingConstants.BOTTOM);
		BtnIngresar.setBounds(59, 239, 98, 26);
		panel.add(BtnIngresar);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{label, lblClave, buffClave, label_2, buffRut}));
		getContentPane().setLayout(null);
		getContentPane().add(lblNewLabel);
		getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Apl_login.class.getResource("/Image/Fondo.jpeg")));
		lblNewLabel_1.setBounds(-78, -167, 794, 598);
		getContentPane().add(lblNewLabel_1);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel}));
	}

}
