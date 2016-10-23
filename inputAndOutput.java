
/**
 * Write a description of class inputAndOutput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class inputAndOutput{
    public void readFileInd() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("client.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader("incomeBenefits.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("enrollment.txt"));
        BufferedReader br3 = new BufferedReader(new FileReader("healthAndDVID.txt"));
        BufferedReader br4 = new BufferedReader(new FileReader("exit.txt"));
        BufferedReader br5 = new BufferedReader(new FileReader("service.txt"));
        BufferedReader br6 = new BufferedReader(new FileReader("disability.txt"));
        BufferedReader br7 = new BufferedReader(new FileReader("employment.txt"));
        Users [] user = new Users [500];
        int counter = 0;
        while(br.ready()){
            user[counter] = new Users();
            //input intoo users.client class
            counter ++;
            //read in the client file and store info in user objects
        }
        counter = 0;
        while(br1.ready()){
            //input into users.incomeBenefit class
            counter++;
        }
        //read other files;
    }
    public void readFileOrg() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("transitionalHousing"));
        BufferedReader br1 = new BufferedReader(new FileReader("permenentSupport.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("youthProgram.txt"));
        BufferedReader br3 = new BufferedReader(new FileReader("independentProgram.txt"));
        BufferedReader br4 = new BufferedReader(new FileReader("rapidRehousing.txt"));
        BufferedReader br5 = new BufferedReader(new FileReader("nonHomelessSystem.txt"));
        BufferedReader br6 = new BufferedReader(new FileReader("emergencyShelters.txt"));
        BufferedReader br7 = new BufferedReader(new FileReader("winterShelters.txt"));
        BufferedReader br8 = new BufferedReader(new FileReader("vaSystem.txt"));
        BufferedReader br9 = new BufferedReader(new FileReader("domesticViolent.txt"));
        Organizations [] orgs = new Organizations [500];
        int counter = 0;
        while(br.ready()){
            orgs[counter] = new Organizations();
            //input intoo users.client class
            counter ++;
            //read in the client file and store info in user objects
        }
        counter = 0;
        while(br1.ready()){
            //input into users.incomeBenefit class
            counter++;
        }
        //read other files;
    }
    public void outputInd() throws IOException{
        PrintWriter pw1 = new PrintWriter(new File("client.txt"));
        PrintWriter pw2 = new PrintWriter(new File("incomeBenefit.txt"));
        PrintWriter pw3 = new PrintWriter(new File("enrollment.txt"));
        PrintWriter pw4 = new PrintWriter(new File("healthAndDVID.txt"));
        PrintWriter pw5 = new PrintWriter(new File("exit.txt"));
        PrintWriter pw6 = new PrintWriter(new File("services.txt"));
        PrintWriter pw7 = new PrintWriter(new File("disability.txt"));
        PrintWriter pw8 = new PrintWriter(new File("employment.txt"));
        //print out everything in the correct file
    }
    public void outputOrg() throws IOException{
        PrintWriter pw1 = new PrintWriter(new File("transitionalHousing"));
        PrintWriter pw2 = new PrintWriter(new File("permenentSupport.txt"));
        PrintWriter pw3 = new PrintWriter(new File("youthProgram.txt"));
        PrintWriter pw4 = new PrintWriter(new File("independentProgram.txt"));
        PrintWriter pw5 = new PrintWriter(new File("rapidRehousing.txt"));
        PrintWriter pw6 = new PrintWriter(new File("emergencyShelters.txt"));
        PrintWriter pw7 = new PrintWriter(new File("nonHomelessSystem.txt"));
        PrintWriter pw8 = new PrintWriter(new File("winterShelters.txt"));
        PrintWriter pw9 = new PrintWriter(new File("vaSystem.txt"));
        PrintWriter pw10 = new PrintWriter(new File("domesticViolence.txt"));
        //print out everything in the correct file
    }
}
    