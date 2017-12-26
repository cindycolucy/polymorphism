package encapsulation2;

import encapsulation1.PublicClass;

public class SubClassOfPublicClass extends PublicClass {

	public void methodThatCallsMethod() {
		
		publicMethod();
		// can call this because this is not a subclass
		protectedMethod();
		// can call this because we are in the same package
		defaultMethod();
		// can't call this because only PublicClass can see it
		privateMethod();
	}
}