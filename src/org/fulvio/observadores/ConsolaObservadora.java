package org.fulvio.observadores;

import org.fulvio.observables.*;

/**
 * Created with IntelliJ IDEA.
 * User: FMoya
 * Date: 07/31/13
 * Time: 01:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConsolaObservadora implements Observer {
	private Subject blog;

	public ConsolaObservadora(Subject blog){
		 this.blog = blog;
		blog.registerObserver(this);
	}

	@Override
	public void update(String titulo, String mensaje) {
		System.out.println(mensaje.toUpperCase() + "  \n - " + titulo+ "\n\n" );
	}
}
