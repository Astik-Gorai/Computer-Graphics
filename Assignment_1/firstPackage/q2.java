// 2020CSB038 Astik Gorai  
package ABC.firstPackage;
import java.util.*;

public class first{
    String name;
    int age;
    String college;
    first(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        System.out.print("Enter College Name: ");
        Scanner sc2 = new Scanner(System.in);
        college = sc2.nextLine();
        sc.close();

    }
    void printDetail(){
        System.out.println("Details Recived in the first Class: ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("College: "+college);
    }
}
