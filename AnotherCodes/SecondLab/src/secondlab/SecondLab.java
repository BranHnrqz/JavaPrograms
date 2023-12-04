package secondlab;
import javax.swing.JOptionPane;

/**
 * @author BRANDON
 */
public class SecondLab {
    public static void main(String[] args) {
        String DUI, name, lastName, gender, mail, carnetIdentification, contract, schedule;
        int age, signatureNumber, signatureAmount;
       
        //Estudiante
        DUI = JOptionPane.showInputDialog("Ingresa el DUI del Estudiante: ");
        name = JOptionPane.showInputDialog("Ingresa el Nombre del Estudiante: ");
        lastName = JOptionPane.showInputDialog("Ingresa el Apellido del Estudiante: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la EDAD del Estudiante: "));
        gender = JOptionPane.showInputDialog("Ingresa el Sexo/Género del Estudiante: ");
        mail = JOptionPane.showInputDialog("Ingresa el Correo del Estudiante: ");
        carnetIdentification = JOptionPane.showInputDialog("Ingresa el CARNET del Estudiante: ");
        signatureNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Numero de Materia del Estudiante: "));
        
        studentH sH = new studentH(DUI, name, lastName, age, gender);
       
        sH.setMail(mail);
        sH.setCarnet(carnetIdentification);
        sH.setSignatureNumber(signatureNumber);
        
        sH.dataShow();
        
        //Docente
        DUI = JOptionPane.showInputDialog("Ingresa el DUI del Docente: ");
        name = JOptionPane.showInputDialog("Ingresa el Nombre del Docente: ");
        lastName = JOptionPane.showInputDialog("Ingresa el Apellido del Docente: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la EDAD del Docente: "));
        gender = JOptionPane.showInputDialog("Ingresa el Sexo/Género del Docente: ");
        mail = JOptionPane.showInputDialog("Ingresa el Correo del Docente: ");
        contract = JOptionPane.showInputDialog("Ingresa el Contrato del Docente: ");
        signatureAmount = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Cantidad de Materias del Docente: "));
        
        
        professorH pH = new professorH(DUI, name, lastName, age, gender);
        
        pH.setMail(mail);
        pH.setContract(contract);
        pH.setSignatureAmount(signatureAmount);
        
        pH.dataShow();
        
        //Personal Administrativo
        DUI = JOptionPane.showInputDialog("Ingresa el DUI del Personal: ");
        name = JOptionPane.showInputDialog("Ingresa el Nombre del Personal: ");
        lastName = JOptionPane.showInputDialog("Ingresa el Apellido del Personal: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la EDAD del Personal: "));
        gender = JOptionPane.showInputDialog("Ingresa el Sexo/Género del Personal: ");
        schedule = JOptionPane.showInputDialog("Ingresa el Horario del Personal: ");
        
        adminPersonalH aPH = new adminPersonalH(DUI, name, lastName, age, gender);
        
        aPH.setSchedule(schedule);
        
        aPH.dataShow();
        
    }
}
