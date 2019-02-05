package snackBar;

public class Snack {
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  public Snack(String name, int quantity, double cost, int vmId) {
    this.maxId++;
    this.id = this.maxId;
    this.name = name;
    this.quantity = quantiy;
    this.cost = cost;
    this.vendingMachineId = vmId;
  }

  public void setname(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public int addQuantity(int quantity) {
    this.quantity += quantity;
    return this.quantity;
  }

  public int getId() {
    return this.id;
  }
}
/// Users/hilalaissani/javaLambda/projects/EmployeeApp/src/employeeApp/Main.java