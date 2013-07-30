package org.fulvio.UI;


import javax.swing.*;
import java.awt.Container;
import java.awt.GridLayout;


/**
 * Created with IntelliJ IDEA.
 * User: FMoya
 * Date: 07/17/13
 * Time: 02:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class ObservadorGrafico extends JFrame {
	private JLabel lblTituloMensaje;
	private JLabel  lblDescripcion;
	private JButton btnEnviar;
	private JTextField txtTituloMensaje;
	private JTextField txtCuerpoMensaje;
	private JPanel mainPanel;

	public ObservadorGrafico(){
		super();
		lblDescripcion   = new JLabel("Descripcion: ");
		lblTituloMensaje = new JLabel("Titulo");
		btnEnviar        = new JButton();
		mainPanel        = new JPanel();

		this.setBounds(40, 60, 700, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		//btnEnviar.setSize(35,35);
		Container container = new Container();
		this.setLayout(new GroupLayout(container));
		container.setLayout(new GridLayout());

		container = this.getContentPane();
		this.setResizable(false);
		mainPanel.add(lblTituloMensaje);
		mainPanel.add(btnEnviar);
		container.add(mainPanel);


		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (javax.swing.UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
		} catch (IllegalAccessException e) {
			e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
		}
		this.setVisible(true);
	}


}
