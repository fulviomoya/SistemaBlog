package org.fulvio.observables;

import org.fulvio.observadores.*;

/**
 * Created with IntelliJ IDEA.
 * User: FMoya
 * Date: 07/18/13
 * Time: 05:11 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
