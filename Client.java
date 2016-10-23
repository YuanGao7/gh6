
/**
 * Write a description of class Client here.
 * 
 * @Yuan Gao
 * @version (a version number or a date)
 */
public class Client{
    private int personalID;
    private int UUID;
    private String firstName;
    private String lastName;
    private char middleInitial;
    private int nameDataQuality;
    private int SSN;
    private int SSNDataQuality;
    private String DOB;
    private int DOBDataQuality;
    private String race;
    private int gender; // 1 if male, 0 if female, 2 if other
    private int veteran; //0 for no, 1 for yes
    private int yearEnteredService;
    private int yearSeparated;
    private String war;
    private int dischargeStatus;
    private int reputationPoint;
    public Client(){
        //default personal information
        //blank account
    }
    public Client(int p, int u, String f, String l, char m, int n, int s, int d, String o, int q, String r, int g, int v, int e, int t, String w, int b, int reputation){
        personalID = p;
        UUID = u;
        firstName = f;
        lastName = l;
        m = middleInitial;
        nameDataQuality = n;
        SSN = s;
        SSNDataQuality = d;
        DOB = o;
        DOBDataQuality = q;
        race = r;
        gender = g;
        veteran = v;
        yearEnteredService = e;
        yearSeparated = t;
        war = w;
        dischargeStatus = b;
        reputationPoint = reputation;
    }
    public void changeReputationPoint(int r){
        reputationPoint += r;
    }
    public int getReputationPoint(){
        return reputationPoint;
    }
    public void changeFirstName(String first){
        firstName = first;
        nameDataQuality = 1;
    }
    public void changeLastName(String last){
        lastName = last;
        nameDataQuality = 1;
    }
    public void changeMiddleInitial(char middle){
        middleInitial = middle;
        nameDataQuality = 1;
    }
    public void changeSSN(int ss){
        SSN = ss;
        SSNDataQuality = 1;
    }
    public void changeRace(String r){
        race = r;
    }
    public void changeGender(int g){
        gender = g;
    }
    public void changeVeteran(int v){
        veteran = v;
    }
    public void changeYearEnteredService(int y){
        yearEnteredService = y;
    }
    public void changeYearSeparated(int y){
        yearSeparated = y;
    }
    public void changeWar(String w){
        war = w;
    }
    public void changeDischargeStatus(int d){
        dischargeStatus = d;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public char getMiddleInitial(){
        return middleInitial;
    }
    public int getSSN(){
        return SSN;
    }
    public int getSSNDataQuality(){
        return SSNDataQuality;
    }
    public String getRace(){
        return race;
    }
    public int getVeteranStatus(){
        return veteran;
    }
    public int getYearEnteredService(){
        return yearEnteredService;
    }
    public int getYearSeparated(){
        return yearSeparated;
    }
    public String getWar(){
        return war;
    }
    public int getDischargeStatus(){
        return dischargeStatus;
    }
    public String toString(){
        String out = "ID: " + personalID 
        + "\nUUID: " + UUID 
        + "Name: " + firstName + " " + middleInitial + ". " + lastName 
        + "SSN: " + SSN + "Race: " + race 
        + "Veteran (0 as no, 1 as yes): " + veteran 
        + "Year Entered Service: " + yearEnteredService 
        + "Year Separated: " + yearSeparated + "Battle Field: " + war 
        + "Discharge Status: " + dischargeStatus;
        return out;
    }
}