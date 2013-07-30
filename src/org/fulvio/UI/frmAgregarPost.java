package org.fulvio.UI;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmAgregarPost extends JFrame {
    private JButton btnPost;
    private JLabel  lblTitulo;
    private JLabel  lblMensaje;
    private JTextField txtTitulo;
    private JTextArea txtMensaje;

    public frmAgregarPost()  {
        super();
        initializeComponents();
	    generateUI();
    }

    private void initializeComponents(){
        btnPost      = new JButton();
        lblMensaje   = new JLabel();
        lblTitulo    = new JLabel();
        txtTitulo   = new JTextField();
        txtMensaje  = new JTextArea();

        btnPost.setText("Postear");
        btnPost.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnPostActionPerformed();
            }
        });
	    lblMensaje.setText("Mensaje a postear: ");
        lblMensaje.setFont(new Font("Calibri",0, 16));

	    lblTitulo.setText("Titulo del Post: ");
        lblTitulo.setFont(new Font("Calibri",0, 16));

        this.setResizable(false);
        this.setBounds(700,200,300,200);
        this.setTitle("Crear Nuevo Post");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    private void generateUI() {
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTitulo)
                                        .addComponent(txtTitulo, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMensaje)
                                        .addComponent(txtMensaje)
                                        .addComponent(btnPost,  GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                        )
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addComponent(txtTitulo,GroupLayout.PREFERRED_SIZE,27, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMensaje)
                                .addComponent(txtMensaje)
                                .addComponent(btnPost,  GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        )
        );
    }
	private void btnPostActionPerformed() {
		//TODO: Poner funcionabilidad aqui.!
		JOptionPane.showMessageDialog(this, "Tu mensaje ha sido publicado correctamente", "Post Realizado",
				                             JOptionPane.INFORMATION_MESSAGE);
	}
}
