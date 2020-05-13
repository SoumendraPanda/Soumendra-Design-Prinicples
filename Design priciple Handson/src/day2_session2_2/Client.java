package day2_session2_2;

public class Client {

	public static void main(String[] args) {

		LeaveRequestHandler handlerHR=new HR();
		LeaveRequestHandler handlerPM=new ProjectManager();
		LeaveRequestHandler handlerSuper=new Supervisor();
		
		handlerSuper.setNextChain(handlerPM);
		handlerPM.setNextChain(handlerHR);
		
		Employee e=new Employee("Tom","I.T");
		LeaveDays days=new LeaveDays(6);
		LeaveRequest request= new LeaveRequest(e,days);
		handlerSuper.handlerRequest(request);
		
	}

}
