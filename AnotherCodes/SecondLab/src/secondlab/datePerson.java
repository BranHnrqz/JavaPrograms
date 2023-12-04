package secondlab;

/**
 * @author BRANDON
 */

public class datePerson {
    private String DUI, name, lastName, gender;
    private int age;
    
    public datePerson(String DUI, String name, String lastName, int age, String gender) {
        this.DUI = DUI;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    
    public String getDUI() {return DUI;};
    public String getName() {return name;};
    public String getlastName() {return lastName;};
    public int getAge() {return age;};
    public String getGender(){return gender;};
   
}
