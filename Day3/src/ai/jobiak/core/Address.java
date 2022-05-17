package ai.jobiak.core;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
public class Address {
	
	@Setter
	@Getter
	private String doorNo;
	@Setter
	@Getter
	private String street;
	@Setter
	@Getter
	private String city;
	@Setter
	@Getter
	private long phoneNo;
	@Setter
	@Getter
	private long pincode;

	public Address() {
		
	}
	public Address(String doorNo, String street, String city, long phoneNo, long pincode) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.phoneNo = phoneNo;
		this.pincode = pincode;
	}
	public String getDoorNo() {
		return doorNo;
	}
//	public void setDoorNo(String doorNo) {
//		this.doorNo = doorNo;
//	}
//	public String getStreet() {
//		return street;
//	}
//	public void setStreet(String street) {
//		this.street = street;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public long getPhoneNo() {
//		return phoneNo;
//	}
//	public void setPhoneNo(long phoneNo) {
//		this.phoneNo = phoneNo;
//	}
//	public long getPincode() {
//		return pincode;
//	}
//	public void setPincode(long pincode) {
//		this.pincode = pincode;
//	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", phoneNo=" + phoneNo
				+ ", pincode=" + pincode + "]";
	}
	

}
