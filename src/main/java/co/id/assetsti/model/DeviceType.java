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
	@Column(name = "sub_unit", length = 255)
	private String subUnit;
	@Column(length = 255)
	private String name;
	@Column(name = "serial_number", length = 255)
	private String serialNumber;
	@Column(name = "ip_address", length = 255)
	private String ipAddress;
	@Column(name = "mac_address", length = 255)
	private String macAddress;
	@Column(length = 255)
	private String brand;
	@Column(length = 255)
	private String type;
	@Column(length = 4)
	private String year;
	@Column(name = "asset_number", length = 255)
	private String assetNumber;
	@Column(length = 255)
	private String location;
	@Column(name = "total_port_rj45", precision = 10)
	private int totalPortRj45;
	@Column(name = "total_port_sfp", precision = 10)
	private int totalPortSfp;
	@Column(name = "total_port_qsfp", precision = 10)
	private int totalPortQsfp;
	@Column(length = 255)
	private String owner;
	@Column(length = 255)
	private String status;
	@Column(name = "device_category", nullable = false, length = 255)
	private String deviceCategory;
	@Column(length = 255)
	private String port;
	@Column(name = "manageable_switch", length = 255)
	private String manageableSwitch;
	@Column(length = 255)
	private String os;
	@Column(length = 255)
	private String microprocessor;
	@Column(length = 255)
	private String ram;
	@Column(length = 255)
	private String storage;
	@Column(name = "display_card", length = 255)
	private String displayCard;
	@Column(length = 255)
	private String monitor;
	@Column(name = "interface", length = 255)
	private String interface_;
	@Column(name = "laptop_year", length = 4)
	private String laptopYear;
	@Column(length = 255)
	private String guaranted;
	@Column(length = 255)
	private String classification;
	@Column(length = 255)
	private String description;
	@Column(length = 255)
	private String antivirus;
	@Column(length = 255)
	private String harddisk;
	@Column(length = 255)
	private String wps;
	@Column(length = 255)
	private String webservice;
	@Column(length = 255)
	private String db;
	@Column(length = 255)
	private String konektifitas;
	@Column(name = "pemanfaatan_server", length = 255)
	private String pemanfaatanServer;
	@Column(name = "printer_size", length = 255)
	private String printerSize;
	@Column(length = 255)
	private String ssid;
	@Column(name = "antena_gain", length = 255)
	private String antenaGain;
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
	 * Access method for port.
	 *
	 * @return the current value of port
	 */
	public String getPort() {
		return port;
	}

	/**
	 * Setter method for port.
	 *
	 * @param aPort the new value for port
	 */
	public void setPort(String aPort) {
		port = aPort;
	}

	/**
	 * Access method for manageableSwitch.
	 *
	 * @return the current value of manageableSwitch
	 */
	public String getManageableSwitch() {
		return manageableSwitch;
	}

	/**
	 * Setter method for manageableSwitch.
	 *
	 * @param aManageableSwitch the new value for manageableSwitch
	 */
	public void setManageableSwitch(String aManageableSwitch) {
		manageableSwitch = aManageableSwitch;
	}

	/**
	 * Access method for os.
	 *
	 * @return the current value of os
	 */
	public String getOs() {
		return os;
	}

	/**
	 * Setter method for os.
	 *
	 * @param aOs the new value for os
	 */
	public void setOs(String aOs) {
		os = aOs;
	}

	/**
	 * Access method for microprocessor.
	 *
	 * @return the current value of microprocessor
	 */
	public String getMicroprocessor() {
		return microprocessor;
	}

	/**
	 * Setter method for microprocessor.
	 *
	 * @param aMicroprocessor the new value for microprocessor
	 */
	public void setMicroprocessor(String aMicroprocessor) {
		microprocessor = aMicroprocessor;
	}

	/**
	 * Access method for ram.
	 *
	 * @return the current value of ram
	 */
	public String getRam() {
		return ram;
	}

	/**
	 * Setter method for ram.
	 *
	 * @param aRam the new value for ram
	 */
	public void setRam(String aRam) {
		ram = aRam;
	}

	/**
	 * Access method for storage.
	 *
	 * @return the current value of storage
	 */
	public String getStorage() {
		return storage;
	}

	/**
	 * Setter method for storage.
	 *
	 * @param aStorage the new value for storage
	 */
	public void setStorage(String aStorage) {
		storage = aStorage;
	}

	/**
	 * Access method for displayCard.
	 *
	 * @return the current value of displayCard
	 */
	public String getDisplayCard() {
		return displayCard;
	}

	/**
	 * Setter method for displayCard.
	 *
	 * @param aDisplayCard the new value for displayCard
	 */
	public void setDisplayCard(String aDisplayCard) {
		displayCard = aDisplayCard;
	}

	/**
	 * Access method for monitor.
	 *
	 * @return the current value of monitor
	 */
	public String getMonitor() {
		return monitor;
	}

	/**
	 * Setter method for monitor.
	 *
	 * @param aMonitor the new value for monitor
	 */
	public void setMonitor(String aMonitor) {
		monitor = aMonitor;
	}

	/**
	 * Access method for interface_.
	 *
	 * @return the current value of interface_
	 */
	public String getInterface_() {
		return interface_;
	}

	/**
	 * Setter method for interface_.
	 *
	 * @param aInterface_ the new value for interface_
	 */
	public void setInterface_(String aInterface_) {
		interface_ = aInterface_;
	}

	/**
	 * Access method for laptopYear.
	 *
	 * @return the current value of laptopYear
	 */
	public String getLaptopYear() {
		return laptopYear;
	}

	/**
	 * Setter method for laptopYear.
	 *
	 * @param aLaptopYear the new value for laptopYear
	 */
	public void setLaptopYear(String aLaptopYear) {
		laptopYear = aLaptopYear;
	}

	/**
	 * Access method for guaranted.
	 *
	 * @return the current value of guaranted
	 */
	public String getGuaranted() {
		return guaranted;
	}

	/**
	 * Setter method for guaranted.
	 *
	 * @param aGuaranted the new value for guaranted
	 */
	public void setGuaranted(String aGuaranted) {
		guaranted = aGuaranted;
	}

	/**
	 * Access method for classification.
	 *
	 * @return the current value of classification
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * Setter method for classification.
	 *
	 * @param aClassification the new value for classification
	 */
	public void setClassification(String aClassification) {
		classification = aClassification;
	}

	/**
	 * Access method for description.
	 *
	 * @return the current value of description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter method for description.
	 *
	 * @param aDescription the new value for description
	 */
	public void setDescription(String aDescription) {
		description = aDescription;
	}

	/**
	 * Access method for antivirus.
	 *
	 * @return the current value of antivirus
	 */
	public String getAntivirus() {
		return antivirus;
	}

	/**
	 * Setter method for antivirus.
	 *
	 * @param aAntivirus the new value for antivirus
	 */
	public void setAntivirus(String aAntivirus) {
		antivirus = aAntivirus;
	}

	/**
	 * Access method for harddisk.
	 *
	 * @return the current value of harddisk
	 */
	public String getHarddisk() {
		return harddisk;
	}

	/**
	 * Setter method for harddisk.
	 *
	 * @param aHarddisk the new value for harddisk
	 */
	public void setHarddisk(String aHarddisk) {
		harddisk = aHarddisk;
	}

	/**
	 * Access method for wps.
	 *
	 * @return the current value of wps
	 */
	public String getWps() {
		return wps;
	}

	/**
	 * Setter method for wps.
	 *
	 * @param aWps the new value for wps
	 */
	public void setWps(String aWps) {
		wps = aWps;
	}

	/**
	 * Access method for webservice.
	 *
	 * @return the current value of webservice
	 */
	public String getWebservice() {
		return webservice;
	}

	/**
	 * Setter method for webservice.
	 *
	 * @param aWebservice the new value for webservice
	 */
	public void setWebservice(String aWebservice) {
		webservice = aWebservice;
	}

	/**
	 * Access method for database.
	 *
	 * @return the current value of database
	 */
	public String getDatabase() {
		return db;
	}

	/**
	 * Setter method for database.
	 *
	 * @param aDatabase the new value for database
	 */
	public void setDatabase(String aDb) {
		db = aDb;
	}

	/**
	 * Access method for konektifitas.
	 *
	 * @return the current value of konektifitas
	 */
	public String getKonektifitas() {
		return konektifitas;
	}

	/**
	 * Setter method for konektifitas.
	 *
	 * @param aKonektifitas the new value for konektifitas
	 */
	public void setKonektifitas(String aKonektifitas) {
		konektifitas = aKonektifitas;
	}

	/**
	 * Access method for pemanfaatanServer.
	 *
	 * @return the current value of pemanfaatanServer
	 */
	public String getPemanfaatanServer() {
		return pemanfaatanServer;
	}

	/**
	 * Setter method for pemanfaatanServer.
	 *
	 * @param aPemanfaatanServer the new value for pemanfaatanServer
	 */
	public void setPemanfaatanServer(String aPemanfaatanServer) {
		pemanfaatanServer = aPemanfaatanServer;
	}

	/**
	 * Access method for printerSize.
	 *
	 * @return the current value of printerSize
	 */
	public String getPrinterSize() {
		return printerSize;
	}

	/**
	 * Setter method for printerSize.
	 *
	 * @param aPrinterSize the new value for printerSize
	 */
	public void setPrinterSize(String aPrinterSize) {
		printerSize = aPrinterSize;
	}

	/**
	 * Access method for ssid.
	 *
	 * @return the current value of ssid
	 */
	public String getSsid() {
		return ssid;
	}

	/**
	 * Setter method for ssid.
	 *
	 * @param aSsid the new value for ssid
	 */
	public void setSsid(String aSsid) {
		ssid = aSsid;
	}

	/**
	 * Access method for antenaGain.
	 *
	 * @return the current value of antenaGain
	 */
	public String getAntenaGain() {
		return antenaGain;
	}

	/**
	 * Setter method for antenaGain.
	 *
	 * @param aAntenaGain the new value for antenaGain
	 */
	public void setAntenaGain(String aAntenaGain) {
		antenaGain = aAntenaGain;
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
				+ ", totalPortQsfp=" + totalPortQsfp + ", owner=" + owner + ", status=" + status + ", deviceCategory=" + deviceCategory
				+ ", port=" + port + ", manageableSwitch=" + manageableSwitch + ", os=" + os + ", microprocessor=" + microprocessor
				+ ", ram=" + ram + ", storage=" + storage + ", displayCard=" + displayCard + ", monitor=" + monitor + ", interface_="
				+ interface_ + ", laptopYear=" + laptopYear + ", guaranted=" + guaranted + ", classification=" + classification
				+ ", description=" + description + ", antivirus=" + antivirus + ", harddisk=" + harddisk + ", wps=" + wps + ", webservice="
				+ webservice + ", db=" + db + ", konektifitas=" + konektifitas + ", pemanfaatanServer=" + pemanfaatanServer
				+ ", printerSize=" + printerSize + ", ssid=" + ssid + ", antenaGain=" + antenaGain + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + "]";
	}

}
