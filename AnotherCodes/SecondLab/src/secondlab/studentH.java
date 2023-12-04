package secondlab;

/**
 * @author BRANDON
 */

public class studentH extends datePerson{
    private String mail, carnetIdentification;
    private int signatureNumber;
    
    public studentH(String DUI, String name, String lastName, int age, String gender){
        super(DUI, name, lastName, age, gender);
        mail = "";
        carnetIdentification = "";
        signatureNumber = 0;
    }
    
    //Setters
    public void setMail(String mail){this.mail = mail;};
    public void setCarnet(String carnetIdentification){this.carnetIdentification = carnetIdentification;};
    public void setSignatureNumber(int signatureNumber){this.signatureNumber = signatureNumber;};
    
    //Getters
    public String getMail(){return mail;};
    public String getCarnet(){return carnetIdentification;};
    public int getSignatureNumber(){return signatureNumber;};
    
    public void dataShow()
    {
        System.out.println("Estudiante: \n");
        System.out.println("DUI: " + getDUI() + "\n" +
                           "Nombre: " + getName() + "\n" +
                           "Apellido: " + getlastName() + "\n" +
                           "Edad: " + getAge() + "\n" + 
                           "Sexo: " + getGender() + "\n" + 
                           "Correo Electronico: " + getMail() + "\n" +
                           "Carnet: " + getCarnet() + "\n" +
                           "Numero de Materia: " + getSignatureNumber() + "\n"
                           );
    }
}
