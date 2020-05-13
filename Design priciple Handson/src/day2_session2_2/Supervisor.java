package day2_session2_2;

public class Supervisor implements LeaveRequestHandler {

	protected LeaveRequestHandler nextHandler;
	@Override
	public void setNextChain(LeaveRequestHandler nextHandler) {
		this.nextHandler=nextHandler;
	}

	@Override
	public void handlerRequest(LeaveRequest request) {
		boolean deptSec=request.getEmployee().getDepartment().equalsIgnoreCase("Security");
		 int days=request.getDays().getLeaveDays();
		if(deptSec||(days>10)) {
			System.out.println("Not Passed by Supervisor");
			
		}else {
			System.out.println("Passed by Supervisor");
			nextHandler.handlerRequest(request);		}
		
	}

}
