package gov.noaa.nws.iris.stationlog;


import java.util.HashSet;
import java.util.Set;

//category
public class StationLogCategoryType implements java.io.Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	private Integer id;

	private String name;
	
	private String categoryType;
	
	private Set<StationLogEntry> stationLogEntries = new HashSet<StationLogEntry>(0);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<StationLogEntry> getStationLogEntries() {
		return stationLogEntries;
	}

	public void setStationLogEntries(Set<StationLogEntry> stationLogEntries) {
		this.stationLogEntries = stationLogEntries;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryType == null) ? 0 : categoryType.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((stationLogEntries == null) ? 0 : stationLogEntries.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StationLogCategoryType other = (StationLogCategoryType) obj;
		if (categoryType == null) {
			if (other.categoryType != null)
				return false;
		} else if (!categoryType.equals(other.categoryType))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stationLogEntries == null) {
			if (other.stationLogEntries != null)
				return false;
		} else if (!stationLogEntries.equals(other.stationLogEntries))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StationLogCategoryType [id=" + id + ", name=" + name + ", categoryType=" + categoryType + "]";
	}
	
	
}
