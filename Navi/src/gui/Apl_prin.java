package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import clases.Alumno;

public class Apl_prin {

	private JFrame frame;
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
	private JButton btnNewButton;
	private JButton btnTareas;
	private JButton btnAgenda;
	private JButton btnConfiguracion;
	private JButton btnHorario;
	private JTextField buffPors;


	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apl_prin window = new Apl_prin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	public void abriVentana(Alumno alu) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Apl_prin.class.getResource("/Image/NavCoin-NAV-icon.png")));
		frame.setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(46, 38, 386, 42);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("Ramos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(62, 0, 283, 42);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(46, 93, 386, 42);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnTareas = new JButton("Tareas");
		btnTareas.setBounds(62, 0, 284, 42);
		panel_1.add(btnTareas);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(46, 147, 386, 42);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		btnAgenda = new JButton("Agenda");
		btnAgenda.setBounds(61, 0, 286, 42);
		panel_2.add(btnAgenda);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(46, 201, 386, 42);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.setBounds(60, 0, 287, 42);
		panel_3.add(btnConfiguracion);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(46, 255, 386, 42);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		btnHorario = new JButton("Horario");
		btnHorario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHorario.setBounds(59, 0, 286, 42);
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
		buffNombre.setText(alu.getNombre());
		
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
		buffApellido.setText(alu.getApellidos());
		
		buffCarrera = new JTextField();
		buffCarrera.setEditable(false);
		buffCarrera.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		buffCarrera.setColumns(10);
		buffCarrera.setBounds(37, 201, 150, 20);
		panel_10.add(buffCarrera);
		buffCarrera.setText("Por agregar");
		
		buffCreditos = new JTextField();
		buffCreditos.setEditable(false);
		buffCreditos.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		buffCreditos.setColumns(10);
		buffCreditos.setBounds(37, 265, 150, 20);
		panel_10.add(buffCreditos);
		//buffCreditos.setText();
		
		buffPors = new JTextField();
		buffPors.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		buffPors.setEditable(false);
		buffPors.setColumns(10);
		buffPors.setBounds(37, 329, 150, 20);
		panel_10.add(buffPors);
		String s = Float.toString(alu.getPorcentajeAvance());
		buffPors.setText(s);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getDefaultCloseOperation();
			}
		});
		btnCerrarSesion.setBounds(0, 0, 113, 26);
		contentPane.add(btnCerrarSesion);
		
		JButton btnGenerarCsv = new JButton("Generar csv");
		btnGenerarCsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				alu.mostrarRamosAprovados("Ramos Cursados");
			}
		});
		btnGenerarCsv.setBounds(10, 327, 91, 23);
		contentPane.add(btnGenerarCsv);
		
		JButton btnConsola = new JButton("Mostrar datos Consola");
		btnConsola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ramos Aprovados:");
				alu.mostrarRamosAprovados();
				System.out.println("Ramos Cursando:");
				alu.mostrarRamosCursando();
				System.out.println("Ramos Reprovados:");
				alu.mostrarRamosReprovados();
				
			}
		});
		btnConsola.setBounds(111, 327, 141, 23);
		contentPane.add(btnConsola);
		
		frame.setVisible(true);
	}
	
	/**
	 * Create the application.
	 */
	public Apl_prin() {
		initialize();
	}
	
	/*

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Apl_prin.class.getResource("/Image/NavCoin-NAV-icon.png")));
		frame.setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(46, 38, 386, 42);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("Ramos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		btnNewButton.setBounds(62, 0, 283, 42);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(46, 93, 386, 42);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnTareas = new JButton("Tareas");
		btnTareas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnTareas.setBounds(62, 0, 284, 42);
		panel_1.add(btnTareas);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(46, 147, 386, 42);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		btnAgenda = new JButton("Agenda");
		btnAgenda.setBounds(61, 0, 286, 42);
		panel_2.add(btnAgenda);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(46, 201, 386, 42);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.setBounds(60, 0, 287, 42);
		panel_3.add(btnConfiguracion);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(46, 255, 386, 42);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		btnHorario = new JButton("Horario");
		btnHorario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHorario.setBounds(59, 0, 286, 42);
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
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getDefaultCloseOperation();
			}
		});
		btnCerrarSesion.setBounds(0, 0, 113, 26);
		contentPane.add(btnCerrarSesion);
		
		JButton btnGenerarCsv = new JButton("Generar csv");
		btnGenerarCsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnGenerarCsv.setBounds(10, 327, 91, 23);
		contentPane.add(btnGenerarCsv);
		
		JButton btnConsola = new JButton("Mostrar datos Consola");
		btnConsola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConsola.setBounds(111, 327, 141, 23);
		contentPane.add(btnConsola);
	}
}
