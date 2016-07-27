package gov.noaa.nws.iris.dao.stationlog;

import java.util.Date;

import gov.noaa.nws.iris.dao.commons.BaseDAO;
import gov.noaa.nws.iris.stationlog.StationLogEntry;

public interface StationLogEntryDAO extends BaseDAO<StationLogEntry>{
	/**
	 * Gets the StationLogEntry for the given id.
	 * 
	 * @param id the id of this StationLogEntry type.
	 * @return the paramter or null if parameter not found.
	 * @throws Exception the exception
	 */
	public StationLogEntry getStationLogEntryById(Integer id) throws Exception;
	
	/**
	 * Gets the StationLogEntry for the given employeeName.
	 * 
	 * @param employeeName the employeeName of this StationLogEntry type.
	 * @return the paramter or null if parameter not found.
	 * @throws Exception the exception
	 */
	public StationLogEntry[] getStationLogEntriesByEmployeeName(String employeeName) throws java.lang.Exception;

	/**
	 * Saves a StationLogEntry
	 * @param i the StationLogEntry
	 */
	public StationLogEntry saveOrUpdate(StationLogEntry i) throws Exception;
	
	/**
	 * Gets the station log entries by cwa between dates.
	 *
	 * @param cwa the cwa
	 * @param begin the begin date to start search for
	 * @param end the end date to end search
	 * @return the stationLogEntries by valid office between dates, returns null if none is found.
	 * @throws Exception the exception
	 */
	public StationLogEntry[] getStationLogEntriesByModifiedTime(String nwsOffice, Date begin, Date end) throws Exception;
	
}