package snackBar;

public class VendingMachine {

  private int maxId = 0;
  private int id;
  private String name;

  public VendingMachine(String name) {
    this.maxId++;
    this.id = this.maxId;
    this.name = name;

  }

  public String setName(String name) {
    this.name = name;
    return this.name;
  }

  public int getId() {
    return this.id;
  }

}