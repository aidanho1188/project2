package edu.ho.java.wk1.hw;

/**
 * 
 * @author Aidan
 *          Exercise 6
 * Print out the source code of a java program call hello with the output "Hello world!"
 */
public class Meta {
	public static void main(String[] args) {
        System.out.println("public class Hello {");
        System.out.println("    public static void main(String[] args) {");
        System.out.println("        System.out.println(\"Hello, world!\");");
        System.out.println("    }");
        System.out.println("}");
	}

}
