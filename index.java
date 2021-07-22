import java.util.ArrayList;
import java.util.Map; 

abstract class Bike implements Comparable<Bike> {
    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    Bike(String n, double p){
        this.name = n;
        this.price = p;
    }

    public abstract String toString();

    public int compareTo(Bike bi) {
        if(price > bi.price){
        System.out.println("Expensive");
            return 1;
        }
        else if(price < bi.price) {
        System.out.println("Cheaper");
            return -1;
        }
        else
            return 0;

    }

  }

  class MountainBike extends Bike {
    private int suspension;
    private String type = "Mountain bike";

    MountainBike(double p, String n , int s) {
      super(n, p);
      this.suspension = s;
    }


  public String getType() {
    return this.type;
  }

  public int getSuspension() {
      return suspension;
    }


  @Override
  public String toString() {
    return "{" +
      " suspension='" + getSuspension() + "'" +
      ", type='" + getType() + "'" +
      "}";
  }
   

  }

  class ElectricBike extends Bike {
    private int batteryLife;
    private String type = "Electric Bike";
  public void setBatteryLife(int batteryLife) {
    this.batteryLife = batteryLife;
  }
  
  ElectricBike(double p, String n , int s, String type) {
    super(n, p);
    this.batteryLife = s;
    this.type = type;
  }

  public String getType() {
    return this.type;
  }

  public int getBatteryLife() {
    return this.batteryLife;
  }

  @Override
  public String toString() {
    return "{" +
      " batteryLife='" + getBatteryLife() + "'" +
      ", type='" + getType() + "'" +
      "}";
  }


  }

  class Repair {
        private String customerName;
        private Bike bike;
        private RepairType type;
    
        public enum RepairType {
            CHAIN, BRAKE, WHEEL;
        }
    
    
        public Repair(String customerName, Bike bike, RepairType type) {
            this.customerName = customerName;
            this.bike = bike;
            this.type = type;
        }
    
        public String getCustomerName() {
            return this.customerName;
        }
    
        public Bike getBike() {
            return this.bike;
        }
    
        public RepairType getType() {
            return this.type;
        }
    
    
        @Override
        public String toString() {
            return "{" +
                " customerName='" + getCustomerName() + "'" +
                ", bike='" + getBike() + "'" +
                ", type='" + getType() + "'" +
                "}";
        }
    
    }

    class Mechanic implements Comparable<Mechanic>{
      private String name;
      private int numJobs;
      private ArrayList<String> expertise;
      

  public String getName() {
    return this.name;
  }

  public int getNumJobs() {
    return this.numJobs;
  }

  public ArrayList<String> getExpertise() {
    return this.expertise;
  }

  public void increaseJobs() {
          this.numJobs += 1;
  }
  
  public int compareTo(Mechanic me) {
          if(numJobs > me.numJobs) {
              System.out.println("More Jobs");
              return 1;
          }
          else if (numJobs < me.numJobs) {
              System.out.println("Less Jobs");
              return -1;
          }
          else {
              return 0;
          }
      }
  }

  class WorkShop {
    private ArrayList<String> mechanics;
    private Map<Object, Object> jobs;

  public WorkShop(ArrayList<String> mechanics, Map<Object,Object> jobs) {
    this.mechanics = mechanics;
    this.jobs = jobs;
  }

  public ArrayList<String> getMechanics() {
    return this.mechanics;
  }

  public Map<Object,Object> getJobs() {
    return this.jobs;
  }


  @Override
  public String toString() {
    return "{" +
      " mechanics='" + getMechanics() + "'" +
      ", jobs='" + getJobs() + "'" +
      "}";
  }



  }

  class Main {
    public static void main(String[] args){
      // System.out.println("Hello World");
      System.out.println();
      MountainBike b = new MountainBike(20, "Dennis", 100);
      MountainBike c = new MountainBike(10, "Dennis", 200);
      c.compareTo(b);
  }

  }


    