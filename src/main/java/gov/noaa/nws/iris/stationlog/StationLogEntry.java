package gov.noaa.nws.iris.stationlog;


import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class StationLogEntry implements java.io.Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	private Integer id;

	private String employeeName;

	private String nwsOffice;

	private Timestamp modifiedTime;

	private Timestamp createdTime;

	private String externalTracking;

	private Integer followupId;



	private Integer imageId;

	private Boolean important;

	private Integer relatedContactId;

	private Integer relatedImpactId;

	private Integer relatedProductId;

	private Integer relatedStationId;

	private String text;
//stock
	private Set<StationLogCategoryType> stationLogCategoryTypes = new HashSet<StationLogCategoryType>(0);

	private Set<StationLogImage> stationLogImages = new HashSet<StationLogImage>(0);

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}


	/**
	 * @return the nwsOffice
	 */
	public String getNwsOffice() {
		return nwsOffice;
	}

	/**
	 * @param nwsOffice the nwsOffice to set
	 */
	public void setNwsOffice(String nwsOffice) {
		this.nwsOffice = nwsOffice;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getExternalTracking() {
		return externalTracking;
	}

	public void setExternalTracking(String externalTracking) {
		this.externalTracking = externalTracking;
	}

	public Integer getFollowupId() {
		return followupId;
	}

	public void setFollowupId(Integer followupId) {
		this.followupId = followupId;
	}



	public Integer getImageId() {
		return imageId;
	}

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	public Boolean getImportant() {
		return important;
	}

	public void setImportant(Boolean important) {
		this.important = important;
	}

	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Integer getRelatedContactId() {
		return relatedContactId;
	}

	public void setRelatedContactId(Integer relatedContactId) {
		this.relatedContactId = relatedContactId;
	}

	public Integer getRelatedImpactId() {
		return relatedImpactId;
	}

	public void setRelatedImpactId(Integer relatedImpactId) {
		this.relatedImpactId = relatedImpactId;
	}

	public Integer getRelatedProductId() {
		return relatedProductId;
	}

	public void setRelatedProductId(Integer relatedProductId) {
		this.relatedProductId = relatedProductId;
	}

	public Integer getRelatedStationId() {
		return relatedStationId;
	}

	public void setRelatedStationId(Integer relatedStationId) {
		this.relatedStationId = relatedStationId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Set<StationLogCategoryType> getStationLogCategoryTypes() {
		return stationLogCategoryTypes;
	}

	public void setStationLogCategoryTypes(Set<StationLogCategoryType> stationLogCategoryTypes) {
		this.stationLogCategoryTypes = stationLogCategoryTypes;
	}

	public Set<StationLogImage> getStationLogImages() {
		return stationLogImages;
	}

	public void setStationLogImages(Set<StationLogImage> stationLogImages) {
		this.stationLogImages = stationLogImages;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdTime == null) ? 0 : createdTime.hashCode());
		result = prime * result + ((nwsOffice == null) ? 0 : nwsOffice.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + ((externalTracking == null) ? 0 : externalTracking.hashCode());
		result = prime * result + ((followupId == null) ? 0 : followupId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imageId == null) ? 0 : imageId.hashCode());
		result = prime * result + ((important == null) ? 0 : important.hashCode());
		result = prime * result + ((modifiedTime == null) ? 0 : modifiedTime.hashCode());
		result = prime * result + ((relatedContactId == null) ? 0 : relatedContactId.hashCode());
		result = prime * result + ((relatedImpactId == null) ? 0 : relatedImpactId.hashCode());
		result = prime * result + ((relatedProductId == null) ? 0 : relatedProductId.hashCode());
		result = prime * result + ((relatedStationId == null) ? 0 : relatedStationId.hashCode());
		result = prime * result + ((stationLogCategoryTypes == null) ? 0 : stationLogCategoryTypes.hashCode());
		result = prime * result + ((stationLogImages == null) ? 0 : stationLogImages.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		StationLogEntry other = (StationLogEntry) obj;
		if (createdTime == null) {
			if (other.createdTime != null)
				return false;
		} else if (!createdTime.equals(other.createdTime))
			return false;
		if (nwsOffice == null) {
			if (other.nwsOffice != null)
				return false;
		} else if (!nwsOffice.equals(other.nwsOffice))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (externalTracking == null) {
			if (other.externalTracking != null)
				return false;
		} else if (!externalTracking.equals(other.externalTracking))
			return false;
		if (followupId == null) {
			if (other.followupId != null)
				return false;
		} else if (!followupId.equals(other.followupId))
			return false;		
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imageId == null) {
			if (other.imageId != null)
				return false;
		} else if (!imageId.equals(other.imageId))
			return false;
		if (important == null) {
			if (other.important != null)
				return false;
		} else if (!important.equals(other.important))
			return false;
		if (modifiedTime == null) {
			if (other.modifiedTime != null)
				return false;
		} else if (!modifiedTime.equals(other.modifiedTime))
			return false;
		if (relatedContactId == null) {
			if (other.relatedContactId != null)
				return false;
		} else if (!relatedContactId.equals(other.relatedContactId))
			return false;
		if (relatedImpactId == null) {
			if (other.relatedImpactId != null)
				return false;
		} else if (!relatedImpactId.equals(other.relatedImpactId))
			return false;
		if (relatedProductId == null) {
			if (other.relatedProductId != null)
				return false;
		} else if (!relatedProductId.equals(other.relatedProductId))
			return false;
		if (relatedStationId == null) {
			if (other.relatedStationId != null)
				return false;
		} else if (!relatedStationId.equals(other.relatedStationId))
			return false;
		if (stationLogCategoryTypes == null) {
			if (other.stationLogCategoryTypes != null)
				return false;
		} else if (!stationLogCategoryTypes.equals(other.stationLogCategoryTypes))
			return false;
		if (stationLogImages == null) {
			if (other.stationLogImages != null)
				return false;
		} else if (!stationLogImages.equals(other.stationLogImages))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StationLogEntry [id=" + id + ", employeeName=" + employeeName + ", nwsOffice=" + nwsOffice
				+ ", modifiedTime=" + modifiedTime + ", createdTime=" + createdTime + ", externalTracking="
				+ externalTracking + ", followupId=" + followupId + ", imageId=" + imageId + ", important=" + important
				+ ", relatedContactId=" + relatedContactId + ", relatedImpactId=" + relatedImpactId
				+ ", relatedProductId=" + relatedProductId + ", relatedStationId=" + relatedStationId + ", text=" + text
				+ "]";
	}
	
	

}
