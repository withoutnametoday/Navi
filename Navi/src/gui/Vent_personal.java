package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Vent_personal extends JFrame {

	private JPanel contentPane;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField buffNombre;
	private JTextField txtCarrera;
	private JTextField txtCreditosAprovados;
	private JTextField txtPorsentajeAvance;
	private JTextField buffApellido;
	private JTextField buffCarrera;
	private JTextField buffCreditos;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JButton btnNewButton;
	private JButton btnTareas;
	private JButton btnAgenda;
	private JButton btnConfiguracion;
	private JButton btnHorario;
	private JLabel label;
	private JLabel label_4;
	private JTextField buffPors;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vent_personal frame = new Vent_personal();
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
	public Vent_personal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vent_personal.class.getResource("/Image/NavCoin-NAV-icon.png")));
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(46, 38, 386, 42);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(77, 0, 43, 42);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		label_4 = new JLabel("New label");
		label_4.setBounds(0, 0, 43, 42);
		panel_5.add(label_4);
		
		btnNewButton = new JButton("Ramos");
		btnNewButton.setBounds(132, 0, 213, 42);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(46, 93, 386, 42);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(78, 0, 43, 42);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		label = new JLabel("New label");
		label.setBounds(0, 0, 43, 42);
		panel_6.add(label);
		
		btnTareas = new JButton("Tareas");
		btnTareas.setBounds(133, 0, 213, 42);
		panel_1.add(btnTareas);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(46, 147, 386, 42);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(79, 0, 43, 42);
		panel_2.add(panel_7);
		panel_7.setLayout(null);
		
		label_1 = new JLabel("New label");
		label_1.setBounds(0, 0, 43, 42);
		panel_7.add(label_1);
		
		btnAgenda = new JButton("Agenda");
		btnAgenda.setBounds(134, 0, 213, 42);
		panel_2.add(btnAgenda);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(46, 201, 386, 42);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(79, 0, 43, 42);
		panel_3.add(panel_8);
		panel_8.setLayout(null);
		
		label_2 = new JLabel("New label");
		label_2.setBounds(0, 0, 43, 42);
		panel_8.add(label_2);
		
		btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.setBounds(134, 0, 213, 42);
		panel_3.add(btnConfiguracion);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(46, 255, 386, 42);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(77, 0, 43, 42);
		panel_4.add(panel_9);
		panel_9.setLayout(null);
		
		label_3 = new JLabel("New label");
		label_3.setBounds(0, 0, 43, 42);
		panel_9.add(label_3);
		
		btnHorario = new JButton("Horario");
		btnHorario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHorario.setBounds(132, 0, 213, 42);
		panel_4.add(btnHorario);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 51, 255));
		panel_10.setBounds(457, 0, 227, 361);
		contentPane.add(panel_10);
		panel_10.setLayout(null);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setText("Apellido");
		txtApellido.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtApellido.setHorizontalAlignment(SwingConstants.CENTER);
		txtApellido.setBounds(37, 105, 150, 20);
		panel_10.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtNombre.setEditable(false);
		txtNombre.setText("Nombre");
		txtNombre.setColumns(10);
		txtNombre.setBounds(37, 41, 150, 20);
		panel_10.add(txtNombre);
		
		buffNombre = new JTextField();
		buffNombre.setEditable(false);
		buffNombre.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		buffNombre.setColumns(10);
		buffNombre.setBounds(37, 73, 150, 20);
		panel_10.add(buffNombre);
		
		txtCarrera = new JTextField();
		txtCarrera.setText("Carrera");
		txtCarrera.setHorizontalAlignment(SwingConstants.CENTER);
		txtCarrera.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtCarrera.setEditable(false);
		txtCarrera.setColumns(10);
		txtCarrera.setBounds(37, 169, 150, 20);
		panel_10.add(txtCarrera);
		
		txtCreditosAprovados = new JTextField();
		txtCreditosAprovados.setText("Creditos Aprovados");
		txtCreditosAprovados.setHorizontalAlignment(SwingConstants.CENTER);
		txtCreditosAprovados.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtCreditosAprovados.setEditable(false);
		txtCreditosAprovados.setColumns(10);
		txtCreditosAprovados.setBounds(37, 233, 150, 20);
		panel_10.add(txtCreditosAprovados);
		
		txtPorsentajeAvance = new JTextField();
		txtPorsentajeAvance.setText("Porsentaje avance");
		txtPorsentajeAvance.setHorizontalAlignment(SwingConstants.CENTER);
		txtPorsentajeAvance.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtPorsentajeAvance.setEditable(false);
		txtPorsentajeAvance.setColumns(10);
		txtPorsentajeAvance.setBounds(37, 297, 150, 20);
		panel_10.add(txtPorsentajeAvance);
		
		buffApellido = new JTextField();
		buffApellido.setEditable(false);
		buffApellido.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		buffApellido.setColumns(10);
		buffApellido.setBounds(37, 137, 150, 20);
		panel_10.add(buffApellido);
		
		buffCarrera = new JTextField();
		buffCarrera.setEditable(false);
		buffCarrera.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		buffCarrera.setColumns(10);
		buffCarrera.setBounds(37, 201, 150, 20);
		panel_10.add(buffCarrera);
		
		buffCreditos = new JTextField();
		buffCreditos.setEditable(false);
		buffCreditos.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		buffCreditos.setColumns(10);
		buffCreditos.setBounds(37, 265, 150, 20);
		panel_10.add(buffCreditos);
		
		buffPors = new JTextField();
		buffPors.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		buffPors.setEditable(false);
		buffPors.setColumns(10);
		buffPors.setBounds(37, 329, 150, 20);
		panel_10.add(buffPors);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBounds(0, 0, 113, 26);
		contentPane.add(btnCerrarSesion);
	}
}
