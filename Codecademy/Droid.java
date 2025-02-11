public class Droid{
  
    // Instance Fields
  
    int batteryLevel;
    String name;
    String task; 
    
    // Constructor
    public Droid(String droidName){
    name = droidName;
    batteryLevel = 100; 
    }
    
    public String toString(){
      return "Hello, I am the droid: " + name;
    }
    
  public void performTask(String newTask){
  task = newTask;
  System.out.println(name + " is performing task: " + task);
  
  batteryLevel = batteryLevel - 10;
  }
    
  public void energyReport(){
    System.out.println("Current battery level is: " + batteryLevel + "\n");
  }
  
  public void charge(){
    System.out.println("Current battery level: " + batteryLevel);
    batteryLevel = 100; 
    System.out.println("Battery is now charged. Level: " + batteryLevel);
  }
    
  // Main Method
   public static void main(String[] args) {
  
  // New instance of Droid
  Droid codey = new Droid("Codey");
  
  System.out.println(codey);
  
  codey.energyReport();
  
  codey.performTask("Dance");
  codey.energyReport();
  
  codey.performTask("Update Software");
  codey.energyReport();
  
  codey.performTask("Clean the house");
  codey.energyReport();
  
  codey.performTask("Save the world!");
  codey.energyReport();
  
  codey.charge();
  codey.energyReport();
  
  codey.performTask("Go grocery shopping!");
  codey.energyReport();
    }
  }