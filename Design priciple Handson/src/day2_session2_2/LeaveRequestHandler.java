package day2_session2_2;

public interface LeaveRequestHandler {
	public void setNextChain( LeaveRequestHandler nextHandler);
	public void handlerRequest(LeaveRequest request);

}
