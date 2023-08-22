# My Java and maven set up!

Install java 11 using the link below
https://www.oracle.com/java/technologies/downloads/#java11-windows
Recommendation: Download the compressed file

# Proceed to :
Install maven using the link below
https://dlcdn.apache.org/maven/maven-3/3.9.4/binaries/apache-maven-3.9.4-bin.zip

Extract your downloaded files and then..
Save your files in ./localdisk C/Program Files, copy and paste the files inside the folder.
Both files exist in the programs File folder
Run the java application as admin


# Setting up system environment vaiables
Right click on this pc
Click Properties
Advanced System Settings
click environment Variables

Create the Java variable through java home and maven through maven home.
On the system variables section 
select new
## Variable name: JAVA_HOME
## Value and browse to the folder ./Local disk C/Program files/java/jdk11.
Click on Jdk11 and press ok

# Repeat the same for Maven
# Variable name: MAVEN_HOME
# Value,browse through .Local disk C/Program Files/Apache Maven
Click on APache maven and click okay.

Both variable should be seen under Sytem Variables.

Under syatem Variable click the path folder, click edit then select new
Add this %MAVEN_HOME%\bin
Do the same for Java and add %JAVA_HOME%\bin

Click okay on all windows open to close them..

## To command prompt
Type java

# To Check for versions 
mvn -version
java -version

