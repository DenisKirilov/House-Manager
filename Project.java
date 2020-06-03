
public class Project {
    public static void main(String[] args) {
        //Company
        Company company = new Company("Shelby Limitted");

        //Buildings
        Building building01 = new Building("Baker Street 22",4,4,400);
        Building building02 = new Building("Wall Street 17", 2,5,200);
        Building building03 = new Building("Bussiness park", 2,5,350);
        Building building04 = new Building("Times square 4", 2,7,500);
        Building building05 = new Building("Mile end 221", 2,3,255);

        //People
        Person Eve = new Person("Eve","Harrell",23);
        Person Christopher = new Person("Christopher","Gilbert",43);
        Person Julias = new Person("Julias", "Frame",29);
        Person Atlas = new Person("Atlas","Barlow",23);
        Person Trey = new Person("Trey","Snyder",43);

        Person Angharad = new Person("Angharad","Ryan",23);
        Person Tyrene = new Person("Tyrene","Handley",43);
        Person Meera = new Person("Meera ", "Fraser",29);
        Person Hafsah = new Person("Hafsah","Lester",23);
        Person Josephine = new Person("Josephine","Hansen",43);

        Person Jakob = new Person("Jakob","Sinclair",23);
        Person Delores = new Person("Delores","Thomson",43);
        Person Mikon = new Person("Mikon", "Mata",29);
        Person Aaran = new Person("Aaran","Poole",23);
        Person Olivia = new Person("Olivia","Compton",43);

        Person Zayaan = new Person("Zayaan","Cottrell",23);
        Person Darlene = new Person("Darlene","Navarro",43);
        Person Azra = new Person("Azra", "Knowles",29);
        Person Reiss = new Person("Reiss","Terrell",23);
        Person Michael = new Person("Michael","Schofield",43);

        Person Bethanie = new Person("Bethanie","Ballard",23);
        Person Donell = new Person("Donell","Collier",43);
        Person Traci = new Person("Traci", "Mcmahon",29);
        Person Kien = new Person("Kien","Galindo",23);
        Person Ivy = new Person("Ivy","Burton",43);

        Employee Angelo = new Employee("Angelo","Finnegan",24);
        Employee Hope = new Employee("Hope", "Cole", 27);
        Employee Eren = new Employee("Eren","Dupont",24);
        Employee Kadeem = new Employee("Kadeem", "Whelan", 27);
        Employee Abi = new Employee("Abi","Wharton",24);


        //Register the buildings in the company
        company.registerBuilding(building01);
        company.registerBuilding(building02);
        company.registerBuilding(building03);
        company.registerBuilding(building04);
        company.registerBuilding(building05);

        //Register the people who lives in the building01.
        building01.registerPeopleInBuilding(Eve);
        building01.registerPeopleInBuilding(Christopher);
        building01.registerPeopleInBuilding(Julias);
        building01.registerPeopleInBuilding(Atlas);
        building01.registerPeopleInBuilding(Trey);

        //Register the people who will lives in the building02.
        building02.registerPeopleInBuilding(Angharad);
        building02.registerPeopleInBuilding(Tyrene);
        building02.registerPeopleInBuilding(Meera);
        building02.registerPeopleInBuilding(Hafsah);
        building02.registerPeopleInBuilding(Josephine);

        //Register the people who will lives in the building03.
        building03.registerPeopleInBuilding(Jakob);
        building03.registerPeopleInBuilding(Delores);
        building03.registerPeopleInBuilding(Mikon);
        building03.registerPeopleInBuilding(Aaran);
        building03.registerPeopleInBuilding(Olivia);

        //Register the people who will lives in the building04.
        building04.registerPeopleInBuilding(Zayaan);
        building04.registerPeopleInBuilding(Darlene);
        building04.registerPeopleInBuilding(Azra);
        building04.registerPeopleInBuilding(Reiss);
        building04.registerPeopleInBuilding(Michael);

        //Register the people who will lives in the building05.
        building05.registerPeopleInBuilding(Bethanie);
        building05.registerPeopleInBuilding(Donell);
        building05.registerPeopleInBuilding(Traci);
        building05.registerPeopleInBuilding(Kien);
        building05.registerPeopleInBuilding(Ivy);

        //Register the people who works in the company.
        company.registerEmployee(Angelo);
        company.registerEmployee(Hope);
        company.registerEmployee(Eren);
        company.registerEmployee(Kadeem);
        company.registerEmployee(Abi);

        //Map the building with living people inside.
        company.mapBuilding(building01);
        company.mapBuilding(building02);
        company.mapBuilding(building03);
        company.mapBuilding(building04);
        company.mapBuilding(building05);

        //Set a employee take care for a building.
        company.setEmployeeServingOnBuilding(Angelo,building01);
        company.setEmployeeServingOnBuilding(Hope,building02);
        company.setEmployeeServingOnBuilding(Eren,building03);
        company.setEmployeeServingOnBuilding(Kadeem,building04);
        company.setEmployeeServingOnBuilding(Abi,building05);

        company.setTaxOnBuilding(15,building01);
        company.addPaidTaxes(building01,true);

        company.setTaxOnBuilding(15,building02);
        company.addPaidTaxes(building02,true);

        company.setTaxOnBuilding(15,building03);
        company.addPaidTaxes(building03,false);

        company.setTaxOnBuilding(15,building04);
        company.addPaidTaxes(building04,true);

        company.setTaxOnBuilding(13,building05);
        company.addPaidTaxes(building05,false);


        company.info();
        System.out.println("-----------------------------------------------------------------------------------------");
        company.showPeopleWhoLivesInTheBuilding(building03);
        System.out.println("-----------------------------------------------------------------------------------------");
        company.showPeopleWhoLivesInAllBuildings();
        System.out.println("-----------------------------------------------------------------------------------------");
        company.showEmployeeServingBuilding(Abi);
        System.out.println("-----------------------------------------------------------------------------------------");
        company.showEmployeesServingBuildings();
        System.out.println("-----------------------------------------------------------------------------------------");
        company.showInfoOfEmployees();
        System.out.println("-----------------------------------------------------------------------------------------");
        company.showBuildingsInTheCompany();

    }
}
