package singletonClassPractice;

//File Name: Singleton.java
public class Sngleton {

private static Sngleton singleton = new Sngleton( );

/* A private Constructor prevents any other
 * class from instantiating.
 */
private Sngleton() { }

/* Static 'instance' method */
public static Sngleton getInstance( ) {
   return singleton;
}

/* Other methods protected by singleton-ness */
protected static void demoMethod( ) {
   System.out.println("demoMethod for singleton");
}
}