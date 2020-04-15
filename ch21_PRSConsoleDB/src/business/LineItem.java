package business;

public class LineItem {
	private int id;
	private int liRequestID;
	private int liProductID;
	private int liQuanity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLiRequestID() {
		return liRequestID;
	}
	public void setLiRequestID(int liRequestID) {
		this.liRequestID = liRequestID;
	}
	public int getLiProductID() {
		return liProductID;
	}
	public void setLiProductID(int liProductID) {
		this.liProductID = liProductID;
	}
	public int getLiQuanity() {
		return liQuanity;
	}
	public void setLiQuanity(int liQuanity) {
		this.liQuanity = liQuanity;
	}
	public LineItem() {
		super();
	}
	public LineItem(int id, int liRequestID, int liProductID, int liQuanity) {
		super();
		this.id = id;
		this.liRequestID = liRequestID;
		this.liProductID = liProductID;
		this.liQuanity = liQuanity;
	}
	@Override
	public String toString() {
		return "LineItem [id=" + id + ", liRequestID=" + liRequestID + ", liProductID=" + liProductID + ", liQuanity="
				+ liQuanity + "]";
	}
	
	
	
	

}
