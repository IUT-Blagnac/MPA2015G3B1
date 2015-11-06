import Pages.*;
import Util.Lib;

import java.util.*;
import java.io.IOException;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MakeOptiTest extends TestCase {
	static String programmeATester = "MakeOPTIweb";

	
	
	public static void main(String[] args) {
	    if ( args.length > 0 ) { programmeATester = args[0] ; }
	    System.out.println("Tests du programme : " + programmeATester);
	    junit.textui.TestRunner.run(new TestSuite(MakeOptiTest.class));
	  }
	
	
	public void test_page_HTML() throws IOException {
		
		MakeOPTIweb monTest = new MakeOPTIweb();
		String attendu = Lib.Lire("OPTIweb/test/OPTIwebprof.html");
		assertEquals("Affiche : " + attendu, attendu, monTest.makeHTML());
	}
}