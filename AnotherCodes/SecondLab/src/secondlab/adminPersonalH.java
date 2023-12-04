package secondlab;

/**
 * @author BRANDON
 */

public class adminPersonalH extends datePerson{
    private String schedule;
    
    public adminPersonalH(String DUI, String name, String lastName, int age, String gender){
        super(DUI, name, lastName, age, gender);
        
        schedule = "";
     }
    
    //Setters
    public void setSchedule(String schedule){this.schedule = schedule;};
    
    //Getters
    public String getSchedule(){return schedule;};
    
     public void dataShow()
    {
        System.out.println("Personal Administrativo: \n");
        System.out.println("DUI: " + getDUI() + "\n" +
                           "Nombre: " + getName() + "\n" +
                           "Apellido: " + getlastName() + "\n" +
                           "Edad: " + getAge() + "\n" + 
                           "Sexo: " + getGender() + "\n" + 
                           "Horario: " + getSchedule() + "\n" 
                
                           );
    }
}
