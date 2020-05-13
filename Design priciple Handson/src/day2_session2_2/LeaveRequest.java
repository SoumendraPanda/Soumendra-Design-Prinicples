package day2_session2_2;

public class LeaveRequest {
	private Employee employee;
	private LeaveDays days;
	public LeaveRequest(Employee employee, LeaveDays days) {
		super();
		this.employee = employee;
		this.days = days;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public LeaveDays getDays() {
		return days;
	}
	public void setDays(LeaveDays days) {
		this.days = days;
	}
	
	

}
