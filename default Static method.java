package Aniamal1;

public interface Animal {
default void abc() {
	System.out.println("Animal is a dog");
}
 class Pet implements Animal{
}

public static void main(String args[]) {
	
	new Pet().abc();
}
}




package Aniamal1;


public interface Pet {
	static void cat(){
	 	System.out.println("This is a cat ");
	}

	 class Animal implements Pet {
		
	}
public static void main(String args[]) {
	Pet.cat();
}
}



