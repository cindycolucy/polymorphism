package encapsulation2;

import encapsulation1.PublicClass;

public class ClassInDiffPackage {

	public void methodThatCallsMethod() {
		
		PublicClass target = new PublicClass();
		
		target.publicMethod();
		// can't call this because this is not a subclass
		target.protectedMethod();
		// can't call this because we are in a different package
		target.defaultMethod();
		// can't call this because only PublicClass can see it
		target.privateMethod();
	}
}