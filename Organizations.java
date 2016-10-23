
/**
 * Write a description of class Organizations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Organizations{
    private int organizationID;
    private EmergencyShelters emergencyShelters;
    private TransitionalHousing transitionalHousing;
    private PermanentSupportiveHousing permanentSupportiveHousing;
    private YouthProgram youthProgram;
    private VASystem vaSystem;
    private WinterShelters winterShelters;
    private IndependentPrograms independentPrograms;
    private RapidRehousing rapidRehousing;
    private DomesticViolence domesticViolence;
    private NonHomelessSystemServices nonHomelessSystemServices;
    public Organizations(){
        emergencyShelters = new EmergencyShelters();
        transitionalHousing = new TransitionalHousing();
        permanentSupportiveHousing = new PermanentSupportiveHousing();
        youthProgram = new YouthProgram();
        vaSystem = new VASystem();
        winterShelters = new WinterShelters();
        independentPrograms = new IndependentPrograms();
        rapidRehousing = new RapidRehousing();
        domesticViolence = new DomesticViolence();
        nonHomelessSystemServices = new NonHomelessSystemServices();
    }
}