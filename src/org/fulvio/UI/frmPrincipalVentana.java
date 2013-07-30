package org.fulvio.UI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Created with IntelliJ IDEA.
 * User: FMoya
 * Date: 07/17/13
 * Time: 02:39 AM
 */
public class frmPrincipalVentana extends JFrame {
	private JButton btnAdd;
	private JButton btnClose;
	private JTextField textFieldPostHistory;

	public frmPrincipalVentana(){
		super();
		initiazeComponents();
		generateUI();
	}

	private void initiazeComponents() {
		btnAdd   = new JButton();
		btnClose = new JButton();

		textFieldPostHistory = new JTextField();
		textFieldPostHistory.setEditable(false);

		btnAdd.setText("Add");
		btnAdd.setMnemonic('A');
		btnAdd.setFont(new Font("Calibri", 0, 15));
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnAddActionPerformed();
			}
		});

		btnClose.setText("Close");
		btnClose.setMnemonic('C');
		btnClose.setFont(new Font("Calibri",0,15));
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCloseActionPerformed();
			}
		});



		this.setBounds(120,90, 500,300);
		this.setResizable(false);
		this.setTitle("Ventana Principal");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void generateUI(){
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(layout.createSequentialGroup()
			    .addComponent(textFieldPostHistory)
	            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
			        .addComponent(btnAdd, GroupLayout.PREFERRED_SIZE,80, GroupLayout.PREFERRED_SIZE)
			        .addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
		   );
		layout.setVerticalGroup(layout.createSequentialGroup()
				                        .addGroup(layout.createParallelGroup()
						                                  .addComponent(textFieldPostHistory)
						                                  .addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				                        .addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
		);
	}
	private void btnAddActionPerformed() {
		new frmAgregarPost();
	}
	private void btnCloseActionPerformed() {
		this.dispose();

	}
}
