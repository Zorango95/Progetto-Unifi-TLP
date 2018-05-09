package Esempi.Pattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTemplate {

	@Test
	void test() {
		/*
		ExtendOne trip1pt = new ExtendOne();
		trip1pt.doTripTempleate("12/12/2012", "15/12/2012");
		ExtendTwo trip1ps = new ExtendTwo();
		trip1ps.doTripTempleate("14/04/2008", "17/04/2008");
		*/
		
		whereDay fd;
		whereDay sd;
		TemplateLambda tl;
		fd = ()->System.out.println("Il primo giorno i turisti visiteranno Lecce");
		sd = ()->System.out.println("Il primo giorno i turisti visiteranno Foggia");
		tl = new TemplateLambda(fd,sd);
		tl.doTripTempleate("12/12/2012", "15/12/2012");
		
		fd = ()->System.out.println("Il primo giorno i turisti visiteranno Firenze");
		sd = ()->System.out.println("Il primo giorno i turisti visiteranno Empoli");
		tl = new TemplateLambda(fd,sd);
		tl.doTripTempleate("14/04/2008", "17/04/2008");	
		
	}

}
