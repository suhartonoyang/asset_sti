// Generated with g9.

package co.id.assetsti.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "device_rented")
public class DeviceRented implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, precision = 10)
	private int id;
	@Column(nullable = false, length = 255)
	private String name;
	@Column(name = "serial_number", nullable = false, length = 255)
	private String serialNumber;
	@Column(nullable = false, length = 255)
	private String brand;
	@Column(name = "tenant_name", nullable = false, length = 255)
	private String tenantName;
	@Column(nullable = false, length = 255)
	private String unit;
	@Column(nullable = false, length = 255)
	private String email;
	@Column(nullable = false, length = 255)
	private String status;
	@Column(name = "created_date", nullable = false)
	private Date createdDate;
	@Column(name = "modified_date")
	private Date modifiedDate;

	/** Default constructor. */
	public DeviceRented() {
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
	 * Access method for tenantName.
	 *
	 * @return the current value of tenantName
	 */
	public String getTenantName() {
		return tenantName;
	}

	/**
	 * Setter method for tenantName.
	 *
	 * @param aTenantName the new value for tenantName
	 */
	public void setTenantName(String aTenantName) {
		tenantName = aTenantName;
	}

	/**
	 * Access method for unit.
	 *
	 * @return the current value of unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * Setter method for unit.
	 *
	 * @param aUnit the new value for unit
	 */
	public void setUnit(String aUnit) {
		unit = aUnit;
	}

	/**
	 * Access method for email.
	 *
	 * @return the current value of email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter method for email.
	 *
	 * @param aEmail the new value for email
	 */
	public void setEmail(String aEmail) {
		email = aEmail;
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
	 * Compares the key for this instance with another DeviceRented.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class DeviceRented and the key
	 *         objects are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DeviceRented)) {
			return false;
		}
		DeviceRented that = (DeviceRented) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another DeviceRented.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof DeviceRented))
			return false;
		return this.equalKeys(other) && ((DeviceRented) other).equalKeys(this);
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
		return "DeviceRented [id=" + id + ", name=" + name + ", serialNumber=" + serialNumber + ", brand=" + brand + ", tenantName="
				+ tenantName + ", unit=" + unit + ", email=" + email + ", status=" + status + "]";
	}

}
