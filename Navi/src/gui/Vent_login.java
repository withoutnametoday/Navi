package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import controlador.Login;

public class Vent_login {

	private JFrame frmNavi;
	private JPasswordField buffClave;
	private JTextField buffRut;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vent_login window = new Vent_login();
					window.frmNavi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vent_login() {
		
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNavi = new JFrame();
		frmNavi.getContentPane().setBackground(new Color(72, 209, 204));
		frmNavi.setFont(null);
		frmNavi.setIconImage(Toolkit.getDefaultToolkit().getImage(Vent_login.class.getResource("/Image/NavCoin-NAV-icon.png")));
		frmNavi.setTitle("Navi ");
		frmNavi.setResizable(false);
		frmNavi.setBounds(100, 100, 700, 400);
		frmNavi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("\u00A1BIENVENIDO ESTUDIANTE!");
		lblNewLabel.setBounds(73, 25, 363, 46);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		JPanel panel = new JPanel();
		panel.setBounds(515, 0, 169, 361);
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
				Login log = new Login();
				String clav = String.valueOf(buffClave.getPassword());
				
				if(log.ingreso(buffRut.getText(), clav)){
					Vent_personal.main(null);
				}
				else {
					JOptionPane.showMessageDialog(null,"Error al ingresar, intente nuevamente");
				}
				
			}
		});
		BtnIngresar.setVerticalAlignment(SwingConstants.BOTTOM);
		BtnIngresar.setBounds(59, 239, 98, 26);
		panel.add(BtnIngresar);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{label, lblClave, buffClave, label_2, buffRut}));
		frmNavi.getContentPane().setLayout(null);
		frmNavi.getContentPane().add(lblNewLabel);
		frmNavi.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Vent_login.class.getResource("/Image/Fondo.jpeg")));
		lblNewLabel_1.setBounds(-78, -167, 762, 528);
		frmNavi.getContentPane().add(lblNewLabel_1);
		frmNavi.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel}));
	}
}
