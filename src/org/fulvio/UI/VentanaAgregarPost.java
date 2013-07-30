package com.fulvio.ui;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarPost extends JFrame {
    private JButton btnPost;
    private JLabel  lblTitulo;
    private JLabel  lblMensaje;
    private JTextField txtTitulo;
    private JTextArea txtMensaje;

    public VentanaAgregarPost()  {
        super();
        initializeComponents();
    }

    private void initializeComponents(){
        btnPost      = new JButton();
        lblMensaje   = new JLabel();
        lblTitulo    = new JLabel();
        txtTitulo   = new JTextField();
        txtMensaje  = new JTextArea();

        btnPost.setFocusPainted(false);
        btnPost.setText("Postear");
        btnPost.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnPostActionPerformed();
            }
        });

        lblMensaje.setFont(new Font("Calibri",0, 16));
        lblMensaje.setText("Mensaje a postear: ");

        lblTitulo.setFont(new Font("Calibri",0, 16));
        lblTitulo.setText("Titulo del Post: ");

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (ClassNotFoundException e) { }         catch (InstantiationException e) { }
        catch (IllegalAccessException e) { }         catch (UnsupportedLookAndFeelException e) {  }

        generateUI();
        this.setResizable(false);
        this.setBounds(50,350,300,200);
        this.setTitle("Crear Nuevo Post");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void btnPostActionPerformed() {
        JOptionPane.showMessageDialog(this, "Tu mensaje ha sido publicado correctamente", "Post Realizado",
                JOptionPane.INFORMATION_MESSAGE);
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
                                        .addComponent(txtTitulo, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMensaje)
                                        .addComponent(txtMensaje)
                                        .addComponent(btnPost))
                        )
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addComponent(txtTitulo,GroupLayout.PREFERRED_SIZE,21, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMensaje)
                                .addComponent(txtMensaje)
                                .addComponent(btnPost)

                        )
        );
    }
}
