class Country {
    private String name;
    private String capital;
    private String language;
    private String pm;
    private double area;
    private long population;
    private char currency;

    Country(String name, String capital, String language, String pm, double area, long population, char currency) {
        this.name = name;
        this.capital = capital;
        this.language = language;
        this.pm = pm;
        this.area = area;
        this.population = population;
        this.currency = currency;
    }

    public void getCountryInfo() {
        System.out.println("Country Details : ");
        System.out.println("Name : " + name);
        System.out.println("Capital : " + capital);
        System.out.println("Language : " + language);
        System.out.println("Prime Minister : " + pm);
        System.out.println("Area : " + area);
        System.out.println("Population : " + population);
        System.out.println("Currency : " + currency);
    }
}

class State extends Country {
    private String name;
    private String capital;
    private String cm;
    private String language;
    private int districts;
    private long population;
    private double area;

    State(String name, String capital, String language, String pm, double area, long population, char currency,
            String stateName, String stateCapital, String cm, String stateLanguage, int districts, long statePopulation,
            double stateArea) {
        super(name, capital, language, pm, area, population, currency);
        this.name = stateName;
        this.capital = stateCapital;
        this.cm = cm;
        this.language = stateLanguage;
        this.districts = districts;
        this.population = statePopulation;
        this.districts = districts;
        this.population = statePopulation;
        this.area = stateArea;

    }

    public void getStateInfo() {
        getCountryInfo();
        System.out.println("-------\n");
        System.out.println("State Details : ");
        System.out.println("State Name : " + name);
        System.out.println("State CM : " + cm);
        System.out.println("State Language : " + language);
        System.out.println("Districts : " + districts);
        System.out.println("State Population : " + population);
        System.out.println("State Area : " + area);

    }
}

class District extends State {
    private String name;
    private String muncipalComm;
    private long population;
    private double area;
    private String mp;

    District(String name, String capital, String language, String pm, double area, long population, char currency,
            String stateName, String stateCapital, String cm, String stateLanguage, int districts, long statePopulation,
            double stateArea, String distName, String muncipalComm, long distPopulation, double distArea, String mp) {
        super(name, capital, language, pm, area, population, currency, stateName, stateCapital, cm, stateLanguage,
                districts, statePopulation, stateArea);
        this.name = distName;
        this.muncipalComm = muncipalComm;
        this.population = distPopulation;
        this.area = distArea;
        this.mp = mp;
    }
}

public class Example1 {

    public static void main(String[] args) {

    }
}