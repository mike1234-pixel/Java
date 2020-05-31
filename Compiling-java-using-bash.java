// Use javac command from bash terminal to compile code (to computer readable java bytecode).

// javac ClientProgram.java Multiplier.java

// Two new bytecode files should now be in directory with extension .class

// To run the code, use java command on the program's entry point (file that contains the main method). No extension required:

// java ClientProgram

//////////////////
// Possible Error

// "Test has been compiled to a more recent version of a Java runtime..."
// Means that jdk and jre versions are different, so code is compiled for one version such as Java 11, and executing for another such as Java 8
// You can either update the jre or compile to Java 8 in order to be able to run program for Java 8:

// javac -target 8 -source 8 ClientProgram.java Multiplier.java

// program should now run.

// JRE = Java Runtime Environment
// JDK = Java Development Kit
