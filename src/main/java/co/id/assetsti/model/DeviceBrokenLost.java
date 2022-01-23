// Generated with g9.

package co.id.assetsti.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "device_broken_lost")
public class DeviceBrokenLost implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "employee_name", nullable = false, length = 255)
	private String employeeName;
	@Column(name = "sub_unit", nullable = false, length = 255)
	private String subUnit;
	@Column(nullable = false, length = 255)
	private String name;
	@Column(name = "serial_number", nullable = false, length = 255)
	private String serialNumber;
	@Column(nullable = false, length = 255)
	private String brand;
	@Column(nullable = false, length = 255)
	private String location;
	@Column(nullable = false, length = 255)
	private String owner;
	@Column(nullable = false, length = 255)
	private String status;
	@Column(nullable = false, length = 255)
	private String notes;
	@Column(length = 255)
	private String deviceCategory;
	@Column(name = "created_date", nullable = false)
	private Date createdDate;
	@Column(name = "modified_date")
	private Date modifiedDate;

	/** Default constructor. */
	public DeviceBrokenLost() {
		super();
	}

	/**
	 * Access method for id.
	 *
	 * @return the current value of id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter method for id.
	 *
	 * @param aId the new value for id
	 */
	public void setId(int aId) {
		id = aId;
	}

	/**
	 * Access method for employeeName.
	 *
	 * @return the current value of employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * Setter method for employeeName.
	 *
	 * @param aEmployeeName the new value for employeeName
	 */
	public void setEmployeeName(String aEmployeeName) {
		employeeName = aEmployeeName;
	}

	/**
	 * Access method for subUnit.
	 *
	 * @return the current value of subUnit
	 */
	public String getSubUnit() {
		return subUnit;
	}

	/**
	 * Setter method for subUnit.
	 *
	 * @param aSubUnit the new value for subUnit
	 */
	public void setSubUnit(String aSubUnit) {
		subUnit = aSubUnit;
	}

	/**
	 * Access method for name.
	 *
	 * @return the current value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for name.
	 *
	 * @param aName the new value for name
	 */
	public void setName(String aName) {
		name = aName;
	}

	/**
	 * Access method for serialNumber.
	 *
	 * @return the current value of serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Setter method for serialNumber.
	 *
	 * @param aSerialNumber the new value for serialNumber
	 */
	public void setSerialNumber(String aSerialNumber) {
		serialNumber = aSerialNumber;
	}

	/**
	 * Access method for brand.
	 *
	 * @return the current value of brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Setter method for brand.
	 *
	 * @param aBrand the new value for brand
	 */
	public void setBrand(String aBrand) {
		brand = aBrand;
	}

	/**
	 * Access method for location.
	 *
	 * @return the current value of location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Setter method for location.
	 *
	 * @param aLocation the new value for location
	 */
	public void setLocation(String aLocation) {
		location = aLocation;
	}

	/**
	 * Access method for owner.
	 *
	 * @return the current value of owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * Setter method for owner.
	 *
	 * @param aOwner the new value for owner
	 */
	public void setOwner(String aOwner) {
		owner = aOwner;
	}

	/**
	 * Access method for status.
	 *
	 * @return the current value of status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Setter method for status.
	 *
	 * @param aStatus the new value for status
	 */
	public void setStatus(String aStatus) {
		status = aStatus;
	}

	/**
	 * Access method for notes.
	 *
	 * @return the current value of notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * Setter method for notes.
	 *
	 * @param aNotes the new value for notes
	 */
	public void setNotes(String aNotes) {
		notes = aNotes;
	}

	public String getDeviceCategory() {
		return deviceCategory;
	}

	public void setDeviceCategory(String deviceCategory) {
		this.deviceCategory = deviceCategory;
	}

	/**
	 * Access method for createdDate.
	 *
	 * @return the current value of createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * Setter method for createdDate.
	 *
	 * @param aCreatedDate the new value for createdDate
	 */
	public void setCreatedDate(Date aCreatedDate) {
		createdDate = aCreatedDate;
	}

	/**
	 * Access method for modifiedDate.
	 *
	 * @return the current value of modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * Setter method for modifiedDate.
	 *
	 * @param aModifiedDate the new value for modifiedDate
	 */
	public void setModifiedDate(Date aModifiedDate) {
		modifiedDate = aModifiedDate;
	}

	/**
	 * Compares the key for this instance with another DeviceBrokenLost.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class DeviceBrokenLost and the
	 *         key objects are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DeviceBrokenLost)) {
			return false;
		}
		DeviceBrokenLost that = (DeviceBrokenLost) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another DeviceBrokenLost.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof DeviceBrokenLost))
			return false;
		return this.equalKeys(other) && ((DeviceBrokenLost) other).equalKeys(this);
	}

	/**
	 * Returns a hash code for this instance.
	 *
	 * @return Hash code
	 */
	@Override
	public int hashCode() {
		int i;
		int result = 17;
		i = getId();
		result = 37 * result + i;
		return result;
	}

	@Override
	public String toString() {
		return "DeviceBrokenLost [id=" + id + ", employeeName=" + employeeName + ", subUnit=" + subUnit + ", name=" + name
				+ ", serialNumber=" + serialNumber + ", brand=" + brand + ", location=" + location + ", owner=" + owner + ", status="
				+ status + ", notes=" + notes + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + "]";
	}

}
