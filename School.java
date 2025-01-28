
public class School {
	
	
	private String sName;
	private int sNumber;
	private String sAddress;
	private int sBuses;
	private String sPrincipal;
	public School(String sName, int sNumber, String sAddress, int sBuses, String sPrincipal) {
		super();
		this.sName = sName;
		this.sNumber = sNumber;
		this.sAddress = sAddress;
		this.sBuses = sBuses;
		this.sPrincipal = sPrincipal;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsNumber() {
		return sNumber;
	}
	public void setsNumber(int sNumber) {
		this.sNumber = sNumber;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public int getsBuses() {
		return sBuses;
	}
	public void setsBuses(int sBuses) {
		this.sBuses = sBuses;
	}
	public String getsPrincipal() {
		return sPrincipal;
	}
	public void setsPrincipal(String sPrincipal) {
		this.sPrincipal = sPrincipal;
	}
	@Override
	public String toString() {
		return "School [sName=" + sName + ", sNumber=" + sNumber + ", sAddress=" + sAddress + ", sBuses=" + sBuses
				+ ", sPrincipal=" + sPrincipal + "]";
	}
	

	

}
