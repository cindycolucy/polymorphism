package encapsulation1;

import encapsulation1.PublicClass;

public class SubClassInSamePkg extends PublicClass {

	public void methodThatCallsMethod() {

		PublicClass target = new PublicClass();

		target.publicMethod();

		target.protectedMethod();

		target.defaultMethod();
		{

		}
	}
}
