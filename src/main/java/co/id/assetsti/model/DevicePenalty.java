// Generated with g9.

package co.id.assetsti.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "device_penalty")
public class DevicePenalty implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "device_category", nullable = false, length = 255)
	private String deviceCategory;
	@Column(nullable = false, length = 255)
	private String name;
	@Column(name = "serial_number", nullable = false, length = 255)
	private String serialNumber;
	@Column(nullable = false, length = 4)
	private String year;
	@Column(name = "total_penalty_day", nullable = false, precision = 10)
	private int totalPenaltyDay;
	@Column(nullable = false, length = 255)
	private String status;
	@Column(name = "created_date", nullable = false)
	private Date createdDate;
	@Column(name = "modified_date")
	private Date modifiedDate;

	/** Default constructor. */
	public DevicePenalty() {
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
	 * Access method for deviceCategory.
	 *
	 * @return the current value of deviceCategory
	 */
	public String getDeviceCategory() {
		return deviceCategory;
	}

	/**
	 * Setter method for deviceCategory.
	 *
	 * @param aDeviceCategory the new value for deviceCategory
	 */
	public void setDeviceCategory(String aDeviceCategory) {
		deviceCategory = aDeviceCategory;
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
	 * Access method for year.
	 *
	 * @return the current value of year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * Setter method for year.
	 *
	 * @param aYear the new value for year
	 */
	public void setYear(String aYear) {
		year = aYear;
	}

	/**
	 * Access method for totalPenaltyDay.
	 *
	 * @return the current value of totalPenaltyDay
	 */
	public int getTotalPenaltyDay() {
		return totalPenaltyDay;
	}

	/**
	 * Setter method for totalPenaltyDay.
	 *
	 * @param aTotalPenaltyDay the new value for totalPenaltyDay
	 */
	public void setTotalPenaltyDay(int aTotalPenaltyDay) {
		totalPenaltyDay = aTotalPenaltyDay;
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
	 * Compares the key for this instance with another DevicePenalty.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class DevicePenalty and the key
	 *         objects are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DevicePenalty)) {
			return false;
		}
		DevicePenalty that = (DevicePenalty) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another DevicePenalty.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof DevicePenalty))
			return false;
		return this.equalKeys(other) && ((DevicePenalty) other).equalKeys(this);
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
		return "DevicePenalty [id=" + id + ", deviceCategory=" + deviceCategory + ", name=" + name + ", serialNumber=" + serialNumber
				+ ", year=" + year + ", totalPenaltyDay=" + totalPenaltyDay + ", status=" + status + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + "]";
	}

}
