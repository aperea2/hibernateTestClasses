package gov.noaa.nws.iris.nwsoffice;

import java.util.HashSet;
import java.util.Set;

import gov.noaa.nws.iris.contact.Contact;
import gov.noaa.nws.iris.stationlog.StationLogEntry;

// TODO: Auto-generated Javadoc
/**
 * The Class NwsOffices.
 */

public class NwsOffices implements java.io.Serializable {

	/** The sid associated with this office, e.g. HUN for Huntsville, AL. */
	private String sid;

	/** The name of the office, e.g. Huntsville, AL WFO. */
	private String name;

	/** The cccc. */
	private String cccc;

	/** The timezone where the office is located. */
	private String timezone;
	
	/** The parent office */
	private String parentOffice;
	
	/** The type of office (WFO, RFC, etc.) */
	private String type;
	
	private Set<Contact> contacts = new HashSet<Contact>(0);

	/**
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the cccc
	 */
	public String getCccc() {
		return cccc;
	}

	/**
	 * @param cccc the cccc to set
	 */
	public void setCccc(String cccc) {
		this.cccc = cccc;
	}

	/**
	 * @return the timezone
	 */
	public String getTimezone() {
		return timezone;
	}

	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}


	/**
	 * @return the parentOffice
	 */
	public String getParentOffice() {
		return parentOffice;
	}

	/**
	 * @param parentOffice the parentOffice to set
	 */
	public void setParentOffice(String parentOffice) {
		this.parentOffice = parentOffice;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sid == null) ? 0 : sid.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NwsOffices other = (NwsOffices) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sid == null) {
			if (other.sid != null)
				return false;
		} else if (!sid.equals(other.sid))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public Set<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}    

}