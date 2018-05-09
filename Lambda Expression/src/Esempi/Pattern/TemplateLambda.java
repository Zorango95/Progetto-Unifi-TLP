package Esempi.Pattern;

public class TemplateLambda {

	private whereDay wfd;
	private whereDay wsd;
	
	TemplateLambda(whereDay wfd, whereDay wsd) {
		this.wfd = wfd;
		this.wsd = wsd;
	}

	public final void doTripTempleate(String dataComing,String dataReturning ){
		busComing(dataComing);
		wfd.printWhereDay();
		wsd.printWhereDay();
		busReturning(dataReturning);
	}
	
	public void busComing(String data){
		System.out.println("Il Bus parte il : " + data);
	}	

	public void busReturning(String data){
		System.out.println("Il Bus torna il : " + data);
	}
}
