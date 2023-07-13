package com.thinkconstructive.restdemo;

public class CloudVendor {
	private String vendorId;
	private String vendorNmae;
	private String vendorAddress;
	private String venerPhoneNumber;
	
	public CloudVendor() {

	}

	public CloudVendor(String vendorId, String vendorNmae, String vendorAddress, String venerPhoneNumber) {
		this.vendorId = vendorId;
		this.vendorNmae = vendorNmae;
		this.vendorAddress = vendorAddress;
		this.venerPhoneNumber = venerPhoneNumber;
	}
	
	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorNmae() {
		return vendorNmae;
	}

	public void setVendorNmae(String vendorNmae) {
		this.vendorNmae = vendorNmae;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVenerPhoneNumber() {
		return venerPhoneNumber;
	}

	public void setVenerPhoneNumber(String venerPhoneNumber) {
		this.venerPhoneNumber = venerPhoneNumber;
	}

}
