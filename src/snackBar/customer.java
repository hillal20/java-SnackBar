package snackBar;

public class Customer {
  private int maxId = 0;
  private int id;
  private String name;
  private int cash;

  public Customer(Srting name, int cash) {
    this.maxId++;
    this.id = this.maxId;
    this.name = name;
    this.cash = cash;
  }

}