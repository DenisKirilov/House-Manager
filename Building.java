import java.util.*;

public class Building {
    private static int instanceId =0;
    private int id = 0;
    private String address;
    private int floors;
    private int apartments;
    private int areaOfBuilding;
    private ArrayList<Person> peopleLivingInBuilding;




    public Building(String address, int floors, int apartments, int areaOfBuilding) {
        this.instanceId++;
        this.id = instanceId;
        this.address = address;
        this.floors = floors;
        this.apartments = apartments;
        this.areaOfBuilding = areaOfBuilding;
        this.peopleLivingInBuilding = new ArrayList<>();

    }

    public void registerPeopleInBuilding(Person person) {
        peopleLivingInBuilding.add(person);
    }

    public ArrayList<Person> getListOfPeopleInBuilding(){
        return peopleLivingInBuilding;
    }


    public int getId() {
        return id;
    }

    public int getApartments() {
        return apartments;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", floors=" + floors +
                ", apartments=" + apartments +
                ", areaOfBuilding=" + areaOfBuilding +
                '}';
    }
}
