// Generated with g9.

package co.id.assetsti.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "device_type")
public class DeviceType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "sub_unit", nullable = false, length = 255)
	private String subUnit;
	@Column(nullable = false, length = 255)
	private String name;
	@Column(name = "serial_number", nullable = false, length = 255)
	private String serialNumber;
	@Column(name = "ip_address", nullable = false, length = 255)
	private String ipAddress;
	@Column(name = "mac_address", nullable = false, length = 255)
	private String macAddress;
	@Column(nullable = false, length = 255)
	private String brand;
	@Column(nullable = false, length = 255)
	private String type;
	@Column(nullable = false, length = 4)
	private String year;
	@Column(name = "asset_number", nullable = false, length = 255)
	private String assetNumber;
	@Column(nullable = false, length = 255)
	private String location;
	@Column(name = "total_port_rj45", nullable = false, precision = 10)
	private int totalPortRj45;
	@Column(name = "total_port_sfp", nullable = false, precision = 10)
	private int totalPortSfp;
	@Column(name = "total_port_qsfp", nullable = false, precision = 10)
	private int totalPortQsfp;
	@Column(nullable = false, length = 255)
	private String owner;
	@Column(nullable = false, length = 255)
	private String status;
	@Column(name = "created_date", nullable = false)
	private Date createdDate;
	@Column(name = "modified_date")
	private Date modifiedDate;

	/** Default constructor. */
	public DeviceType() {
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
	 * Access method for ipAddress.
	 *
	 * @return the current value of ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * Setter method for ipAddress.
	 *
	 * @param aIpAddress the new value for ipAddress
	 */
	public void setIpAddress(String aIpAddress) {
		ipAddress = aIpAddress;
	}

	/**
	 * Access method for macAddress.
	 *
	 * @return the current value of macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * Setter method for macAddress.
	 *
	 * @param aMacAddress the new value for macAddress
	 */
	public void setMacAddress(String aMacAddress) {
		macAddress = aMacAddress;
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
	 * Access method for type.
	 *
	 * @return the current value of type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter method for type.
	 *
	 * @param aType the new value for type
	 */
	public void setType(String aType) {
		type = aType;
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
	 * Access method for assetNumber.
	 *
	 * @return the current value of assetNumber
	 */
	public String getAssetNumber() {
		return assetNumber;
	}

	/**
	 * Setter method for assetNumber.
	 *
	 * @param aAssetNumber the new value for assetNumber
	 */
	public void setAssetNumber(String aAssetNumber) {
		assetNumber = aAssetNumber;
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
	 * Access method for totalPortRj45.
	 *
	 * @return the current value of totalPortRj45
	 */
	public int getTotalPortRj45() {
		return totalPortRj45;
	}

	/**
	 * Setter method for totalPortRj45.
	 *
	 * @param aTotalPortRj45 the new value for totalPortRj45
	 */
	public void setTotalPortRj45(int aTotalPortRj45) {
		totalPortRj45 = aTotalPortRj45;
	}

	/**
	 * Access method for totalPortSfp.
	 *
	 * @return the current value of totalPortSfp
	 */
	public int getTotalPortSfp() {
		return totalPortSfp;
	}

	/**
	 * Setter method for totalPortSfp.
	 *
	 * @param aTotalPortSfp the new value for totalPortSfp
	 */
	public void setTotalPortSfp(int aTotalPortSfp) {
		totalPortSfp = aTotalPortSfp;
	}

	/**
	 * Access method for totalPortQsfp.
	 *
	 * @return the current value of totalPortQsfp
	 */
	public int getTotalPortQsfp() {
		return totalPortQsfp;
	}

	/**
	 * Setter method for totalPortQsfp.
	 *
	 * @param aTotalPortQsfp the new value for totalPortQsfp
	 */
	public void setTotalPortQsfp(int aTotalPortQsfp) {
		totalPortQsfp = aTotalPortQsfp;
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
	 * Compares the key for this instance with another DeviceType.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class DeviceType and the key
	 *         objects are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DeviceType)) {
			return false;
		}
		DeviceType that = (DeviceType) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another DeviceType.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof DeviceType))
			return false;
		return this.equalKeys(other) && ((DeviceType) other).equalKeys(this);
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
		return "DeviceType [id=" + id + ", subUnit=" + subUnit + ", name=" + name + ", serialNumber=" + serialNumber + ", ipAddress="
				+ ipAddress + ", macAddress=" + macAddress + ", brand=" + brand + ", type=" + type + ", year=" + year + ", assetNumber="
				+ assetNumber + ", location=" + location + ", totalPortRj45=" + totalPortRj45 + ", totalPortSfp=" + totalPortSfp
				+ ", totalPortQsfp=" + totalPortQsfp + ", owner=" + owner + ", status=" + status + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + "]";
	}

}
