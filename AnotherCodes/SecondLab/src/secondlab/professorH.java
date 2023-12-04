package secondlab;

/**
 * @author BRANDON
 */

public class professorH extends datePerson{
    private String mail, contract;
    private int signatureAmount;
    
    public professorH(String DUI, String name, String lastName, int age, String gender){
        super(DUI, name, lastName, age, gender);
        
        mail = "";
        contract = "";
        signatureAmount = 0;
    }
    
    //Setters
    public void setMail(String mail){this.mail = mail;};
    public void setContract(String contract){this.contract = contract;};
    public void setSignatureAmount(int signatureAmount){this.signatureAmount = signatureAmount;};
    
    //Getters
    public String getMail(){return mail;};
    public String getContract(){return contract;};
    public int getSignatureAmount(){return signatureAmount;};
    
    public void dataShow()
    {
        System.out.println("Docente: \n");
        System.out.println("DUI: " + getDUI() + "\n" +
                           "Nombre: " + getName() + "\n" +
                           "Apellido: " + getlastName() + "\n" +
                           "Edad: " + getAge() + "\n" + 
                           "Sexo: " + getGender() + "\n" + 
                           "Correo Electronico: " + getMail() + "\n" +
                           "Contrato: " + getContract() + "\n" +
                           "Cantidad de Materias: " + getSignatureAmount() + "\n"
                           );
    }
}
