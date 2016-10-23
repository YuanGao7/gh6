
/**
 * Write a description of class Users here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Users{
    private int personalID;
    private Client client;
    private Disability disability;
    private Enrollment enrollment;
    private Employment employment;
    private HealthAndDVID healthAndDVID;
    private IncomeBenefits incomeBenefits;
    private Exit exit;
    private Services services;
    public Users(){
        client = new Client();
        disability = new Disability();
        enrollment = new Enrollment();
        employment = new Employment();
        healthAndDVID = new HealthAndDVID();
        incomeBenefits = new IncomeBenefits();
        exit = new Exit();
        services = new Services();
    }
    //methods that allow access to info
}