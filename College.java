
public class College {
	
	private String name;
	private int code;
	private String address;
	private int noofbuses;
	private int fees;
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public College(String name, int code, String address, int noofbuses, int fees, String sports) {
		super();
		this.name = name;
		this.code = code;
		this.address = address;
		this.noofbuses = noofbuses;
		this.fees = fees;
		this.sports = sports;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNoofbuses() {
		return noofbuses;
	}
	public void setNoofbuses(int noofbuses) {
		this.noofbuses = noofbuses;
	}
	public String getSports() {
		return sports;
	}
	public void setSports(String sports) {
		this.sports = sports;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", code=" + code + ", address=" + address + ", noofbuses=" + noofbuses
				+ ", fees=" + fees + ", sports=" + sports + "]";
	}
	public College(String name, int code, String address, int noofbuses, String sports) {
		super();
		this.name = name;
		this.code = code;
		this.address = address;
		this.noofbuses = noofbuses;
		this.sports = sports;
	}
	private String sports;

}
