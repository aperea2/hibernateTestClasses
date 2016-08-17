package gov.noaa.nws.iris.contact;


import gov.noaa.nws.iris.nwsoffice.NwsOffices;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;




/**
 * The Class Contact represents an instrument, person, or organization.
 */

public class Contact implements java.io.Serializable {

	/** The constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The ID provided by Hibernate. id is of the form of UUID, so it is unique. */
	private String id;
		
	/** The contact's name */
	private String name;
	
	/** Is this contact an NWS employee? */
	private Boolean isNwsEmployee;
	
	/** Is this contact a national organization? */
	private Boolean isNational;
	
	/** Is this contact a state organization? */
	private Boolean isState;
	
	/** If this contact is a state organization, this is the state. */
	private String state;
		
	/** A person contact's job title */
	private String jobTitle;
	
	/** An organization contact's point of contact */
	private String pointOfContact;
	
	/** The contact's area of responsibility */
	private String areaOfResponsibility;
		
	/** The set containing all of the NWS offices with whom this 
	 * contact is associated. */
	private Set<NwsOffices> nwsOffices = new HashSet<NwsOffices>(0);
	
	/** The contact's Facebook page **/
	private String facebook;
	
	/** The contact's Twitter feed **/
	private String twitter;

	/** The contact's website. */
	private String website;
	
	/** Information if the contact is a COOP Observer */
	private Boolean isCoop;
	private String stationId;
	
	/** Information if the contact is a Ham Radio Operator */
	private Boolean isHamRadioOp;
	private String callsign;
	
	/** Information if the contact is a trained spotter */
	private Boolean isTrainedSpotter;
	private String spotterId;
	private Date dateTrained;	
	
	/** The location (e.g. Boise 7E). */
	private String location;
	
	/** Does the contact have an anemometer? */
	private Boolean hasAnemometer;
    
	/** Does the contact have a barometer? */
	private Boolean hasBarometer;
     
	/** Does the contact have a rain gauge? */
	private Boolean hasRainGauge; 
	
	/** Does the contact have a river gauge? */
	private Boolean hasRiverGauge;
	
	/** If the contact has a river gauge, this is the associated river. */
	private String river;
	
	/** Does the contact have the ability to measure snowfall? */
	private Boolean hasSnow;
	
	/** Does the contact have a thermometer? */
	private Boolean hasThermometer; 
	
	/** Does the contact have a weather station? */
	private Boolean hasWxStation;
	
	/** The notes about this contact. */
	private String notes;
	
	/** The set containing the impacts for this contact. */
	private Set<String> impact = new HashSet<String>(0);
	
	/** The initial date that this contact was added to the database. */
	private Date createdAt;
	
	/** The updated at date for this contact. Made current whenever there are changes to this contact. */
	private Date updatedAt;
	
	/** The deleted at date for this contact. Since contacts are not really deleted, just deactivated this represents the date the contact was deactivated. */
	private Date deletedAt;

	/** The last time this contact was contacted. */
	private Date lastContact;
	
	/** If this is a portal contact */
	private Boolean isPortalContact;
	
	/** The portal email address. */
	private String portalEmail;
	
	/** The portal phone number. */
	private String portalPhone;
	
	/** The last time this contact's information was validated. */
	private Date lastValidationDate;
	
	/** The portal password. */
	private String password;
	
	/** The last time the password was updated. */
	private Date lastPasswordChange;

	/** The portal reset key. */
	private String passwordResetKey;
		
	
	/** The contact's iNWS username. */
	private String inwsUsername;
	
	/** The contact's NWSChat username. */
	private String nwschatUsername;
	
	
	/** If an NWS employee, their office */
	private String nwsEmployeeOffice;
	
	/** If an NWS employee, whether they are allowed to approve partners */
	private Boolean isApprover;

	/** Verification key for the portal email */
	private String portalEmailVerificationKey;
	
	/** If portal email has been verified */
	private Boolean portalEmailVerified;
	
	/** Verification key for the portal phone */
	private String portalPhoneVerificationKey;
	
	/** If portal phone has been verified */
	private Boolean portalPhoneVerified;
	
	/** Contact's employer */
	private String employer;
	
	/** Who approved this contact */
	private String approvedBy;
	
	/** A hex character sequence used for loading contacts */
	private String loadSequence;
	
	/**
	 * Instantiate a new contact.
	 */
	public Contact() {
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsNwsEmployee() {
		return isNwsEmployee;
	}

	public void setIsNwsEmployee(Boolean isNwsEmployee) {
		this.isNwsEmployee = isNwsEmployee;
	}

	public Boolean getIsNational() {
		return isNational;
	}

	public void setIsNational(Boolean isNational) {
		this.isNational = isNational;
	}

	public Boolean getIsState() {
		return isState;
	}

	public void setIsState(Boolean isState) {
		this.isState = isState;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPointOfContact() {
		return pointOfContact;
	}

	public void setPointOfContact(String pointOfContact) {
		this.pointOfContact = pointOfContact;
	}

	public String getAreaOfResponsibility() {
		return areaOfResponsibility;
	}

	public void setAreaOfResponsibility(String areaOfResponsibility) {
		this.areaOfResponsibility = areaOfResponsibility;
	}

	public Set<NwsOffices> getNwsOffices() {
		return nwsOffices;
	}

	public void setNwsOffices(Set<NwsOffices> nwsOffices) {
		this.nwsOffices = nwsOffices;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Boolean getIsCoop() {
		return isCoop;
	}

	public void setIsCoop(Boolean isCoop) {
		this.isCoop = isCoop;
	}

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public Boolean getIsHamRadioOp() {
		return isHamRadioOp;
	}

	public void setIsHamRadioOp(Boolean isHamRadioOp) {
		this.isHamRadioOp = isHamRadioOp;
	}

	public String getCallsign() {
		return callsign;
	}

	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}

	public Boolean getIsTrainedSpotter() {
		return isTrainedSpotter;
	}

	public void setIsTrainedSpotter(Boolean isTrainedSpotter) {
		this.isTrainedSpotter = isTrainedSpotter;
	}

	public String getSpotterId() {
		return spotterId;
	}

	public void setSpotterId(String spotterId) {
		this.spotterId = spotterId;
	}

	public Date getDateTrained() {
		return dateTrained;
	}

	public void setDateTrained(Date dateTrained) {
		this.dateTrained = dateTrained;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getHasAnemometer() {
		return hasAnemometer;
	}

	public void setHasAnemometer(Boolean hasAnemometer) {
		this.hasAnemometer = hasAnemometer;
	}

	public Boolean getHasBarometer() {
		return hasBarometer;
	}

	public void setHasBarometer(Boolean hasBarometer) {
		this.hasBarometer = hasBarometer;
	}

	public Boolean getHasRainGauge() {
		return hasRainGauge;
	}

	public void setHasRainGauge(Boolean hasRainGauge) {
		this.hasRainGauge = hasRainGauge;
	}

	public Boolean getHasRiverGauge() {
		return hasRiverGauge;
	}

	public void setHasRiverGauge(Boolean hasRiverGauge) {
		this.hasRiverGauge = hasRiverGauge;
	}

	public String getRiver() {
		return river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public Boolean getHasSnow() {
		return hasSnow;
	}

	public void setHasSnow(Boolean hasSnow) {
		this.hasSnow = hasSnow;
	}

	public Boolean getHasThermometer() {
		return hasThermometer;
	}

	public void setHasThermometer(Boolean hasThermometer) {
		this.hasThermometer = hasThermometer;
	}

	public Boolean getHasWxStation() {
		return hasWxStation;
	}

	public void setHasWxStation(Boolean hasWxStation) {
		this.hasWxStation = hasWxStation;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Set<String> getImpact() {
		return impact;
	}

	public void setImpact(Set<String> impact) {
		this.impact = impact;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public Date getLastContact() {
		return lastContact;
	}

	public void setLastContact(Date lastContact) {
		this.lastContact = lastContact;
	}

	public Boolean getIsPortalContact() {
		return isPortalContact;
	}

	public void setIsPortalContact(Boolean isPortalContact) {
		this.isPortalContact = isPortalContact;
	}

	public String getPortalEmail() {
		return portalEmail;
	}

	public void setPortalEmail(String portalEmail) {
		this.portalEmail = portalEmail;
	}

	public String getPortalPhone() {
		return portalPhone;
	}

	public void setPortalPhone(String portalPhone) {
		this.portalPhone = portalPhone;
	}

	public Date getLastValidationDate() {
		return lastValidationDate;
	}

	public void setLastValidationDate(Date lastValidationDate) {
		this.lastValidationDate = lastValidationDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastPasswordChange() {
		return lastPasswordChange;
	}

	public void setLastPasswordChange(Date lastPasswordChange) {
		this.lastPasswordChange = lastPasswordChange;
	}

	public String getPasswordResetKey() {
		return passwordResetKey;
	}

	public void setPasswordResetKey(String passwordResetKey) {
		this.passwordResetKey = passwordResetKey;
	}

	public String getInwsUsername() {
		return inwsUsername;
	}

	public void setInwsUsername(String inwsUsername) {
		this.inwsUsername = inwsUsername;
	}

	public String getNwschatUsername() {
		return nwschatUsername;
	}

	public void setNwschatUsername(String nwschatUsername) {
		this.nwschatUsername = nwschatUsername;
	}

	public String getNwsEmployeeOffice() {
		return nwsEmployeeOffice;
	}

	public void setNwsEmployeeOffice(String nwsEmployeeOffice) {
		this.nwsEmployeeOffice = nwsEmployeeOffice;
	}

	public Boolean getIsApprover() {
		return isApprover;
	}

	public void setIsApprover(Boolean isApprover) {
		this.isApprover = isApprover;
	}

	public String getPortalEmailVerificationKey() {
		return portalEmailVerificationKey;
	}

	public void setPortalEmailVerificationKey(String portalEmailVerificationKey) {
		this.portalEmailVerificationKey = portalEmailVerificationKey;
	}

	public Boolean getPortalEmailVerified() {
		return portalEmailVerified;
	}

	public void setPortalEmailVerified(Boolean portalEmailVerified) {
		this.portalEmailVerified = portalEmailVerified;
	}

	public String getPortalPhoneVerificationKey() {
		return portalPhoneVerificationKey;
	}

	public void setPortalPhoneVerificationKey(String portalPhoneVerificationKey) {
		this.portalPhoneVerificationKey = portalPhoneVerificationKey;
	}

	public Boolean getPortalPhoneVerified() {
		return portalPhoneVerified;
	}

	public void setPortalPhoneVerified(Boolean portalPhoneVerified) {
		this.portalPhoneVerified = portalPhoneVerified;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getLoadSequence() {
		return loadSequence;
	}

	public void setLoadSequence(String loadSequence) {
		this.loadSequence = loadSequence;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((spotterId == null) ? 0 : spotterId.hashCode());
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
		Contact other = (Contact) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (spotterId == null) {
			if (other.spotterId != null)
				return false;
		} else if (!spotterId.equals(other.spotterId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", isNwsEmployee=" + isNwsEmployee + "]";
	}
	
	
	
}
