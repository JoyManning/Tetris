// Main testing method for all unit tests

public class TetrisTester {

    public static void main(String[] args) {
	
	Result result = JUnitCore.runClasses(//Add class files here);
	
	for (Failure failure : result.getFailures()) {
	    
	    System.out.println(failure.toString());

	}
    }
    
}
