
package multilevelInheritance;

/**
 *
 * @author SAIM HASAN
 */
public class Teacher extends person {
    
    String qualification;
    
    void displayInformation2(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Qualification :"+qualification);
    }
    
}
