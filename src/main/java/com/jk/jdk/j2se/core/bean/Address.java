package com.jk.jdk.j2se.core.bean;

public class Address {

	private int flatNo;
	private String areaName;
	private String city;
	/**
	 * @param flatNo
	 * @param areaName
	 * @param city
	 */
	public Address(int flatNo, String areaName, String city) {
		super();
		this.flatNo = flatNo;
		this.areaName = areaName;
		this.city = city;
	}
	
	/**
	 * @param flatNo
	 * @param areaName
	 * @param city
	 */
	public Address() {
		super();
	}	
	/**
	 * @return the flatNo
	 */
	public int getFlatNo() {
		return flatNo;
	}
	/**
	 * @param flatNo the flatNo to set
	 */
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return areaName;
	}
	/**
	 * @param areaName the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [flatNo=");
		builder.append(flatNo);
		builder.append(", areaName=");
		builder.append(areaName);
		builder.append(", city=");
		builder.append(city);
		builder.append("]");
		return builder.toString();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((areaName == null) ? 0 : areaName.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + flatNo;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Address)) {
			return false;
		}
		Address other = (Address) obj;
		if (areaName == null) {
			if (other.areaName != null) {
				return false;
			}
		} else if (!areaName.equals(other.areaName)) {
			return false;
		}
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}
		if (flatNo != other.flatNo) {
			return false;
		}
		return true;
	}
	
}
