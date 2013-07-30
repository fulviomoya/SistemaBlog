package org.fulvio.sistemablog;


import org.fulvio.UI.*;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: FMoya
 * Date: 07/18/13
 * Time: 07:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sistema {
	public static void main(String... args){
		try {

			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			frmPrincipalVentana observadorGrafico  = new frmPrincipalVentana();
		}
		catch (ClassNotFoundException e) { }         catch (InstantiationException e) { }
		catch (IllegalAccessException e) { }         catch (UnsupportedLookAndFeelException e) {  }
	}
}
