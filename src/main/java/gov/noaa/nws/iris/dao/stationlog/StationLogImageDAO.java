package gov.noaa.nws.iris.dao.stationlog;

import gov.noaa.nws.iris.dao.commons.BaseDAO;
import gov.noaa.nws.iris.stationlog.StationLogImage;

public interface StationLogImageDAO extends BaseDAO<StationLogImage>{
	/**
	 * Gets the StationLogImage for the given id.
	 * 
	 * @param id the id of this StationLogImage type.
	 * @return the paramter or null if parameter not found.
	 * @throws Exception the exception
	 */
	public StationLogImage getStationLogImageById(Integer id) throws Exception;
	
	/**
	 * Saves a StationLogImage
	 * @param i the StationLogImage
	 */
	public StationLogImage saveOrUpdate(StationLogImage i) throws Exception;
}
