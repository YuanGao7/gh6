
/**
 * Write a description of class Disability here.
 * 
 * @Yuan Gao
 * @version (a version number or a date)
 */
public class Disability{
    private int personalID;
    private String disabilityID;
    private int projectEntryID;
    private String informationDate;
    private int disabilityType;
    private int disabilityResponse;
    private int indefiniteAndImpairs;
    private int documentationOnFile;
    private int PATHHowConfirmed;
    private int dataCollectionStage;
    private String dateCreated;
    private String dateUpdated;
    private int userID;
    private String dateDeleted;
    private int exportID;
    public Disability(){
        //default info;
    }
    public Disability(int p, String d, int pr, String i, int dt, int dr, int ii, int df, int pc, int dcs, String dc, String du, int user, String dd, int ex){
        //enter info;
    }
    public void changeDisabilityID(String d){
        disabilityID = d;
    }
    public void changeProjectEntryID(int p){
    }
    public void changeDisabilityType(int p){
    }
    public void changedisabilityResponse(int p){
    }
    public void changeindefiniteAndImpairs(int p){
    }
    public void changedocumentationOnFile(int p){
    }
    public void changePATHHowConfirmed(int p){
    }
    public void changedataCollectionStage(int p){
    }
    public void changeuserID(int p){
    }
    public void changeexportID(int p){
    }
    public void changeInformationDate(String i){
    }
    public void changeDataCreated(String d){
    }
    public void changeDateUpdated(String d){
    }
    public void changeDateDeleted(String d){
    }
    public int getPersonalID(){
        return personalID;
    }
    public String getDisabilityID(){
        return disabilityID;
    }
    public int getProjectEntryID(){
        return projectEntryID;
    }
    public int getDisabilityType(){
        return disabilityType;
    }
    public int getDisabilityReponse(){
        return disabilityResponse;
    }
    public int getIndefiniteAndImpairs(){
        return indefiniteAndImpairs;
    }
    public int getDocumentationOnFile(){
        return documentationOnFile;
    }
    public int getPATHHowConfirmed(){
        return PATHHowConfirmed;
    }
    public int getDataCollectionStage(){
        return dataCollectionStage;
    }
    public int getUserID(){
        return userID;
    }
    public int getExportID(){
        return exportID;
    }
    public String getDateCreated(){
        return dateCreated;
    }
    public String getDateUpdated(){
        return dateUpdated;
    }
    public String getDateDeleted(){
        return dateDeleted;
    }
    public String toString(){
        String out = " ";
        //output disability info
        return out;
    }
}
