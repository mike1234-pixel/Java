// In Java, we create an executable JAR (Java Archive) file in order to deploy it

// TO CREATE A JAR FILE IN ECLIPSE:

// Create a java project in eclipse, 
// right click the project --> Export --> Select "Runnable JAR File" or "JAR File"

// TO CREATE A JAR FILE FROM THE COMMAND LINE:

// In our directory we need to compile our .java files so we have .class and .java files
// Then we need to create our manifest file - which contains details about our program, the most important of which we need to specify is which class contains our main program
// filename = "manifest.mf"
// content = Main-Class: ExampleProgram (hit enter before saving)

// In directory we now have
// .java file/s
// .class file/s
// manifest.mf file

// now in the terminal
// cd to your project dir
// command:

// jar -cvfm myProgram.jar manifest.mf *.class
// -->
// create jar file -- create verbose file manifest -- jar file name -- manifest file name -- take all .class files from the current folder and sub-folders and include all in the jar file
