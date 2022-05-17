 package ai.jobiak.core;

import lombok.Getter;
import lombok.Setter;

public class Employee {
	@Setter
	@Getter
	private String empName;
	@Setter
	@Getter
	private String empId;
	@Setter
	@Getter
	private String company;
	@Setter
	@Getter
	private String empRole;
	@Setter
	@Getter
	private Address communication;
	@Setter
	@Getter
	private Address residance;
	@Setter
	@Getter
	private String manager;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String empId, String company, String empRole, Address communication,
			Address residance, String manager) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.company = company;
		this.empRole = empRole;
		
		this.communication = communication;
		this.residance = residance;
		this.manager = manager;
	}

//	public String getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(String empId) {
//		this.empId = empId;
//	}
//
//	public String getCompany() {
//		return company;
//	}
//
//	public void setCompany(String company) {
//		this.company = company;
//	}
//
//	
//
//	public String getEmpRole() {
//		return empRole;
//	}
//
//	public void setEmpRole(String empRole) {
//		this.empRole = empRole;
//	}
//
//	public Address getCommunication() {
//		return communication;
//	}
//
//	public void setCommunication(Address communication) {
//		this.communication = communication;
//	}
//
//	public Address getResidance() {
//		return residance;
//	}
//
//	public void setResidance(Address residance) {
//		this.residance = residance;
//	}
//
//	public String getManager() {
//		return manager;
//	}
//
//	public void setManager(String manager) {
//		this.manager = manager;
//	}

	@Override
	public String toString() {
		return "Employee [empName=" +empName+ "empId=" + empId + ", company=" + company + ", empRole=" + empRole
				+ ", communication=" + communication + ", residance=" + residance + ", manager=" + manager + "]";
	}
	
	
}
