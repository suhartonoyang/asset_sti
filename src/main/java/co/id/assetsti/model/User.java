// Generated with g9.

package co.id.assetsti.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user")
public class User implements Serializable {

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
	@Column(nullable = false, length = 255)
	private String nip;
	@Column(nullable = false, length = 255)
	private String email;
	@Column(nullable = false, length = 255)
	private String password;
	@Column(nullable = false, length = 255)
	private String jabatan;
	@Column(name = "unit_sub_unit", length = 255)
	private String unitSubUnit;
	@Column(length = 255)
	private String location;
	@Column(name = "handphoneNumber", length = 15)
	private String handphoneNumber;
	@Column(name = "is_admin", nullable = false, length = 1)
	private boolean isAdmin;

	/** Default constructor. */
	public User() {
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
	 * Access method for nip.
	 *
	 * @return the current value of nip
	 */
	public String getNip() {
		return nip;
	}

	/**
	 * Setter method for nip.
	 *
	 * @param aNip the new value for nip
	 */
	public void setNip(String aNip) {
		nip = aNip;
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
	 * Access method for password.
	 *
	 * @return the current value of password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter method for password.
	 *
	 * @param aPassword the new value for password
	 */
	public void setPassword(String aPassword) {
		password = aPassword;
	}

	/**
	 * Access method for jabatan.
	 *
	 * @return the current value of jabatan
	 */
	public String getJabatan() {
		return jabatan;
	}

	/**
	 * Setter method for jabatan.
	 *
	 * @param aJabatan the new value for jabatan
	 */
	public void setJabatan(String aJabatan) {
		jabatan = aJabatan;
	}

	/**
	 * Access method for unitSubUnit.
	 *
	 * @return the current value of unitSubUnit
	 */
	public String getUnitSubUnit() {
		if (this.isAdmin) {
			return unitSubUnit;
		}

		return null;
	}

	/**
	 * Setter method for unitSubUnit.
	 *
	 * @param aUnitSubUnit the new value for unitSubUnit
	 */
	public void setUnitSubUnit(String aUnitSubUnit) {
		unitSubUnit = aUnitSubUnit;
	}

	/**
	 * Access method for location.
	 *
	 * @return the current value of location
	 */
	public String getLocation() {
		if (this.isAdmin) {
			return location;
		}

		return null;
	}

	/**
	 * Setter method for location.
	 *
	 * @param aLocation the new value for location
	 */
	public void setLocation(String aLocation) {
		location = aLocation;
	}

	public String getHandphoneNumber() {
		return handphoneNumber;
	}

	public void setHandphoneNumber(String handphoneNumber) {
		this.handphoneNumber = handphoneNumber;
	}

	/**
	 * Access method for isAdmin.
	 *
	 * @return true if and only if isAdmin is currently true
	 */
	public boolean isIsAdmin() {
		return isAdmin;
	}

	/**
	 * Setter method for isAdmin.
	 *
	 * @param aIsAdmin the new value for isAdmin
	 */
	public void setIsAdmin(boolean aIsAdmin) {
		isAdmin = aIsAdmin;
	}

	/**
	 * Compares the key for this instance with another User.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class User and the key objects
	 *         are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof User)) {
			return false;
		}
		User that = (User) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another User.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof User))
			return false;
		return this.equalKeys(other) && ((User) other).equalKeys(this);
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
		return "User [id=" + id + ", name=" + name + ", nip=" + nip + ", email=" + email + ", password=" + password + ", jabatan=" + jabatan
				+ ", unitSubUnit=" + unitSubUnit + ", location=" + location + ", isAdmin=" + isAdmin + "]";
	}

}
