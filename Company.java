import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Company {
    private String name;                                               // Name of the Company
    private Map<Integer, Employee> employeeList;                       // variable to store registered employees in company.
    private Map<Integer, Building> buildings;                          // variable to store registered buildings.
    private Map<Building, ArrayList<Person>> livingPeopleInBuildings;  // variable to store living people in the buildings
    private Map<Employee, Building> employeeWorkingBuildings;          // variable to store employees working in the buildings.
    private int tax;                                                   // variable used to initialize the tax.
    private int cnt;                                                   // counter variable  for apartments of the buildings.
    private int cnt2;                                                  // counter variable for taxes needed to be paid.
    private int cnt3;                                                  // counter variable for paid taxes.


    // Constructor.
    public Company(String name) {
        this.name = name;
        this.employeeList = new HashMap<>();
        this.employeeWorkingBuildings = new LinkedHashMap<>();
        this.buildings = new HashMap<>();
        this.livingPeopleInBuildings = new LinkedHashMap<>();

    }

    // Register the building, taking the id of the building and put it into the map.
    public void registerBuilding(Building building) {
        cnt += building.getApartments();
        buildings.put(building.getId(), building);
    }

    //Map the building with living people inside. It gets the building for key and list of people for value.
    public void mapBuilding(Building building) {
            livingPeopleInBuildings.put(building,building.getListOfPeopleInBuilding());
    }

    // Register new employee.
    public void registerEmployee(Employee employee) {
        employeeList.put(employee.getId(), employee);
    }

    // Set a employer who serving current building.
    public void setEmployeeServingOnBuilding(Employee employee, Building building) {
        employeeWorkingBuildings.put(employee, building);
    }

    // Set a tax that must be paid from the living people in the building.
    public void setTaxOnBuilding(int taxPerPerson, Building building){
        this.tax = taxPerPerson * building.getListOfPeopleInBuilding().size();
        cnt2 +=tax;
    }

    // Making a file, writing the tax inside.
    public void addPaidTaxes(Building building,boolean paid) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();

        try(FileWriter file = new FileWriter("taxes.txt",true)) {
            file.write("Date: " + dtf.format(now) + ", Building: "+ building.getId() + ", Total tax: " + tax +"$" + " , Paid : " + paid + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (paid) cnt3 += tax;
    }

    // Full statistic
    public void info(){
        int tmp = 0;
        for(List<Person> l : livingPeopleInBuildings.values()){
            tmp += l.size();
        }
        System.out.println("There is "+buildings.size() + " buildings.");
        System.out.println(cnt + " apartments.");
        System.out.println(tmp + " Living people in the buildings.");
        System.out.println(employeeList.size() + " Employees working in the company.");
        System.out.println(cnt2 + "$ Total taxes have to be paid: ");
        System.out.println(cnt3 + "$ Currently total paid taxes: ");
    }

    //Takes building as argument, list all of the people in the current building.
    public void showPeopleWhoLivesInTheBuilding(Building building){
        System.out.println("List of people living in the building:" + building.getListOfPeopleInBuilding());
    }

    //Shows people in all of the buildings.
    public void showPeopleWhoLivesInAllBuildings(){
        Set<Map.Entry<Building, ArrayList<Person>>> set = livingPeopleInBuildings.entrySet();
        for (Map.Entry<Building, ArrayList<Person>> list : set) {
            System.out.println("Living people in the building:\n"+list.getKey() + " People in this building: ");
            System.out.println(list.getValue());
        }
    }

    //Shows current employee which building servers
    public void showEmployeeServingBuilding(Employee employee) {
            System.out.println("Employee: " + employee.getFullName()  + " serving: " + employeeWorkingBuildings.get(employee));

    }


    //Shows all of the employees which buildings servers
    public void showEmployeesServingBuildings(){
        System.out.println("List of employees serving the buildings");
        Set<Map.Entry<Employee, Building>> set2 = employeeWorkingBuildings.entrySet();
        for (Map.Entry<Employee, Building> list : set2) {
            System.out.println("Employee: " + list.getKey() + " Serving building: ");
            System.out.println(list.getValue());
        }
    }

    //Shows all of the building that the company have.
    public void showBuildingsInTheCompany(){
        Set<Map.Entry<Integer, Building>> set3 = buildings.entrySet();
        for (Map.Entry<Integer, Building> list : set3) {
            System.out.println("ID:" + list.getKey() + ", " + list.getValue());
        }
    }


    //Shows all of the employees in the company
    public void showInfoOfEmployees(){
        Set<Map.Entry<Integer, Employee>> set4 = employeeList.entrySet();
        for (Map.Entry<Integer, Employee> list : set4) {
            System.out.println("ID:" + list.getKey() + ", " + list.getValue());
        }
    }


}
