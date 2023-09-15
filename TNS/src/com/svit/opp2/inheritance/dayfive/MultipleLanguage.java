package com.svit.opp2.inheritance.dayfive;

public class MultipleLanguage extends MultipleFrontend{
	String language = "Java";

	  // implement method of interface
	  public void connectServer() {
	    System.out.println(language + " can be used as backend language.");
	  }

	  public static void main(String[] args) {

	    // create object of Language class
		  MultipleLanguage java = new MultipleLanguage();

	    java.connectServer();
	 // call the inherited method of Front end class
	    java.responsive(java.language);
}

}
