package gov.noaa.nws.iris.stationlog;


import java.util.Arrays;


public class StationLogImage implements java.io.Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private byte[] image;
	
	private StationLogEntry stationLogEntry;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public StationLogEntry getStationLogEntry() {
		return stationLogEntry;
	}

	public void setStationLogEntry(StationLogEntry stationLogEntry) {
		this.stationLogEntry = stationLogEntry;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + Arrays.hashCode(image);
		result = prime * result + ((stationLogEntry == null) ? 0 : stationLogEntry.hashCode());
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
		StationLogImage other = (StationLogImage) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (!Arrays.equals(image, other.image))
			return false;
		if (stationLogEntry == null) {
			if (other.stationLogEntry != null)
				return false;
		} else if (!stationLogEntry.equals(other.stationLogEntry))
			return false;
		return true;
	}	
	
	
	
}
