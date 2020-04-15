package business;

public class Vendor {
	private int id;
	private String vendorCode;
	private String vendorName;
	private String vendorAddress;
	private String vendorCity;
	private String vendorState;
	private String vendorZip;
	private String vendorPhoneNumber;
	private String vendorEmail;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getVendorCity() {
		return vendorCity;
	}
	public void setVendorCity(String vendorCity) {
		this.vendorCity = vendorCity;
	}
	public String getVendorState() {
		return vendorState;
	}
	public void setVendorState(String vendorState) {
		this.vendorState = vendorState;
	}
	public String getVendorZip() {
		return vendorZip;
	}
	public void setVendorZip(String vendorZip) {
		this.vendorZip = vendorZip;
	}
	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}
	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	public String getVendorEmail() {
		return vendorEmail;
	}
	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}
	public Vendor() {
		super();
	}
	
	public Vendor(int id, String vendorCode, String vendorName, String vendorAddress, String vendorCity,
			String vendorState, String vendorZip, String vendorPhoneNumber, String vendorEmail) {
		super();
		this.id = id;
		this.vendorCode = vendorCode;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorCity = vendorCity;
		this.vendorState = vendorState;
		this.vendorZip = vendorZip;
		this.vendorPhoneNumber = vendorPhoneNumber;
		this.vendorEmail = vendorEmail;
	}
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", vendorCode=" + vendorCode + ", vendorName=" + vendorName + ", vendorAddress="
				+ vendorAddress + ", vendorCity=" + vendorCity + ", vendorState=" + vendorState + ", vendorZip="
				+ vendorZip + ", vendorPhoneNumber=" + vendorPhoneNumber + ", vendorEmail=" + vendorEmail + "]";
	}
	
	
	
	
	
	
	
	
}
