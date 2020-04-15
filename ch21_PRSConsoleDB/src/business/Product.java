package business;

public class Product {
	private int id;
	private int productVendorID;
	private String productPartNumber;
	private String productName;
	private double productPrice;
	private String productUnit;
	private String PhotoPath;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductVendorID() {
		return productVendorID;
	}
	public void setProductVendorID(int productVendorID) {
		this.productVendorID = productVendorID;
	}
	public String getProductPartNumber() {
		return productPartNumber;
	}
	public void setProductPartNumber(String productPartNumber) {
		this.productPartNumber = productPartNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductUnit() {
		return productUnit;
	}
	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}
	public String getPhotoPath() {
		return PhotoPath;
	}
	public void setPhotoPath(String photoPath) {
		PhotoPath = photoPath;
	}
	public Product() {
		super();
	}
	public Product(int id, int productVendorID, String productPartNumber, String productName, double productPrice,
			String productUnit, String photoPath) {
		super();
		this.id = id;
		this.productVendorID = productVendorID;
		this.productPartNumber = productPartNumber;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productUnit = productUnit;
		PhotoPath = photoPath;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productVendorID=" + productVendorID + ", productPartNumber=" + productPartNumber
				+ ", productName=" + productName + ", productPrice=" + productPrice + ", productUnit=" + productUnit
				+ ", PhotoPath=" + PhotoPath + "]";
	}
	
	

}
