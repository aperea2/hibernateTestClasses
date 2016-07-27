package gov.noaa.nws.iris.dao.stationlog;

import gov.noaa.nws.iris.dao.commons.BaseDAO;
import gov.noaa.nws.iris.stationlog.StationLogCategoryType;


public interface StationLogCategoryTypeDAO extends BaseDAO<StationLogCategoryType>{
	
	/**
	 * Gets the StationLogCategoryType for the given id.
	 * 
	 * @param id the id of this StationLogCategoryType type.
	 * @return the paramter or null if parameter not found.
	 * @throws Exception the exception
	 */
	public StationLogCategoryType getStationLogCategoryTypeById(Integer id) throws Exception;
	
	/**
	 * Gets the StationLogCategoryType for the given name and categoryType.
	 * 
	 * @param name the name of this StationLogCategoryType type.
	 * @return the paramter or null if parameter not found.
	 * @throws Exception the exception
	 */
	public StationLogCategoryType getStationLogCategoryTypeByNameAndCategoryType(String name, String categoryType) throws java.lang.Exception;
	
	/**
	 * Saves an StationLogCategoryType
	 * @param i the StationLogCategoryType
	 */
	public StationLogCategoryType saveOrUpdate(StationLogCategoryType i) throws Exception;
	
}
