class Ship{
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt)
    {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName() {
        return name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void print()
    {
        System.out.println("Ship: " + name + ", Year Built: " + yearBuilt);
    }
}

class CruiseShip extends Ship{
    private int maxPassenger;
    public CruiseShip(String name, String yearBuilt, int maxPassenger){
        super(name,yearBuilt);
        this.maxPassenger = maxPassenger;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    @Override
    public void print() {
        System.out.println("Ship: " + getName() + ", Maximum Passenger: " + maxPassenger);
    }
}

class CargoShip extends Ship{
    private int cargoCapacity;
    public CargoShip(String name, String yearBuilt, int cargoCapacity){
        super(name,yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void print() {
        System.out.println("Ship: " + getName() + ", Cargo Capacity: " + cargoCapacity);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Titanic", "1910");
        ships[1] = new CruiseShip("Cruise","2000",300);
        ships[2] = new CargoShip("Cargo", "2003", 5000);

        for(Ship ship : ships)
        {
            ship.print();
        }
    }
}
