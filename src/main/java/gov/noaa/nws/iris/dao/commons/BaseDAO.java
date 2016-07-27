package gov.noaa.nws.iris.dao.commons;


public interface BaseDAO <T> extends ReadableDAO<T>{

	/**
	 * Save an object out to the persistence layer, this is Transactional Propagation Required
	 * @param o object to save
	 * @return If saved
	 * @throws Exception if there is a problem saving the object to the persistence layer
	 */
	T saveOrUpdate(T o) throws Exception;

	/**
	 * merge an object out to the persistence layer, this is Transactional Propagation Required
	 * @param o object to save
	 * @return If merged
	 * @throws Exception if there is a problem saving the object to the persistence layer
	 */
	T merge(T o) throws Exception;
	
	/**
	 * Remove an object from the persistence layer, this is Transactional Propagation Required
	 * @param o object to remove
	 * @throws Exception if there is a problem removing the object from the persistence layer.
	 */
	void remove(T o) throws Exception;
	
	void flush() throws Exception;
	
	
}
