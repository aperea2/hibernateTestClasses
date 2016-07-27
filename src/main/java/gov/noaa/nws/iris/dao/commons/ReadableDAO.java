package gov.noaa.nws.iris.dao.commons;

import java.io.Serializable;

public interface ReadableDAO<T> {

	/**
	 * Find an object in the database by providing the class and the id
	 * @param classtosearch Class to use in request to persistence layer
	 * @param id Id that uniquely identifies the object
	 * @return return the object, returns null if no object is found.
	 * @throws Exception If there an Exception thrown by persistence layer we catch and rethrow a new error
	 */
	T findByClassAndId(Class<T> classtosearch, Serializable id) throws Exception;
}
