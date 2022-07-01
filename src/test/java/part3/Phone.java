package part3;
import org.testng.annotations.Test;

@Test
//Створіть клас Phone, який містить змінні number, model та weight.
// вони мають бути приватними та доступ до них організований через геттери і сеттери
public class Phone {
 public int getNumber() {
  return number;
 }
 public void setNumber(int number) {
  this.number = number;
 }
 public String getModel() {
  return model;
 }
 public void setModel(String model) {
  this.model = model;
 }
 public double getWeight() {
  return weight;
 }
 public void setWeight(double weight) {
  this.weight = weight;
 }

 private int number;
  private String model;
  private double weight;
  //Створіть три екземпляри цього класу.
  public static void main(String[] args) {
   Phone phone1 = new Phone();
   phone1.setNumber(13);
   phone1.setModel("Pro");
   phone1.setWeight(200.55);
   Phone phone2 = new Phone();
   Phone phone3 = new Phone();
//Виведіть в консоль значення їх змінних?
   System.out.println(phone1.model);
  }

}

