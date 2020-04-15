package business;

public class Request {
	private int id;
	private int requestUserID;
	private String requestDescription;
	private String requestJustification;
	private String requestDateNeeded;
	private String requestDeliveryMode;
	private String requestStatus;
	private double requestTotal;
	private String requestDateTime;
	private String requestReasonForRejection;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRequestUserID() {
		return requestUserID;
	}
	public void setRequestUserID(int requestUserID) {
		this.requestUserID = requestUserID;
	}
	public String getRequestDescription() {
		return requestDescription;
	}
	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}
	public String getRequestJustification() {
		return requestJustification;
	}
	public void setRequestJustification(String requestJustification) {
		this.requestJustification = requestJustification;
	}
	public String getRequestDateNeeded() {
		return requestDateNeeded;
	}
	public void setRequestDateNeeded(String requestDateNeeded) {
		this.requestDateNeeded = requestDateNeeded;
	}
	public String getRequestDeliveryMode() {
		return requestDeliveryMode;
	}
	public void setRequestDeliveryMode(String requestDeliveryMode) {
		this.requestDeliveryMode = requestDeliveryMode;
	}
	public String getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	public double getRequestTotal() {
		return requestTotal;
	}
	public void setRequestTotal(double requestTotal) {
		this.requestTotal = requestTotal;
	}
	public String getRequestDateTime() {
		return requestDateTime;
	}
	public void setRequestDateTime(String requestDateTime) {
		this.requestDateTime = requestDateTime;
	}
	public String getRequestReasonForRejection() {
		return requestReasonForRejection;
	}
	public void setRequestReasonForRejection(String requestReasonForRejection) {
		this.requestReasonForRejection = requestReasonForRejection;
	}
	public Request() {
		super();
	}
	public Request(int id, int requestUserID, String requestDescription, String requestJustification,
			String requestDateNeeded, String requestDeliveryMode, String requestStatus, double requestTotal,
			String requestDateTime, String requestReasonForRejection) {
		super();
		this.id = id;
		this.requestUserID = requestUserID;
		this.requestDescription = requestDescription;
		this.requestJustification = requestJustification;
		this.requestDateNeeded = requestDateNeeded;
		this.requestDeliveryMode = requestDeliveryMode;
		this.requestStatus = requestStatus;
		this.requestTotal = requestTotal;
		this.requestDateTime = requestDateTime;
		this.requestReasonForRejection = requestReasonForRejection;
	}
	@Override
	public String toString() {
		return "Request [id=" + id + ", requestUserID=" + requestUserID + ", requestDescription=" + requestDescription
				+ ", requestJustification=" + requestJustification + ", requestDateNeeded=" + requestDateNeeded
				+ ", requestDeliveryMode=" + requestDeliveryMode + ", requestStatus=" + requestStatus
				+ ", requestTotal=" + requestTotal + ", requestDateTime=" + requestDateTime
				+ ", requestReasonForRejection=" + requestReasonForRejection + "]";
	}
	
	
	
	
	
}
