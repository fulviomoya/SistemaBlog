package org.fulvio.observables;

import org.fulvio.observadores.Observer;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: FMoya
 * Date: 07/30/13
 * Time: 04:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Blog implements Subject {
	private ArrayList<Observer> subcripcion;
	private String mensajePost;
	private String tituloPost;

	private static Blog blog;
	private Blog() {
		subcripcion= new ArrayList();
	}

	public static Blog getInstance(){
		return blog == null? new Blog():blog;
	}
	@Override
	public void registerObserver(Observer observer) {
		subcripcion.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int i = subcripcion.indexOf(observer);
		if(i >= 0){
			subcripcion.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < subcripcion.size(); i++) {
			Observer observer = subcripcion.get(i);
			observer.update(this.mensajePost, this.tituloPost);
		}
	}
	public void nuevoPost(String titulo, String mensaje){
		this.tituloPost = titulo;
		this.mensajePost = mensaje;
		notifyObservers();
	}
}
