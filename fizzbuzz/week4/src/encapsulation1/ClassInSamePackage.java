package encapsulation1;

public class ClassInSamePackage {

public void methodThatCallsMethod(){
	
	PublicClass target = new PublicClass();
	
	target.publicMethod();
	
	target.protectedMethod();
	
	target.defaultMethod();
}
}
