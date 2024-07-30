package model;

public class User {
  private String name;
  private int age;
  private int blabla;
  private int weight;

  public User(int age, int blabla, String name, int weight) {
    this.age = age;
    this.blabla = blabla;
    this.name = name;
    this.weight = weight;
  }

  public int age() {
    return age;
  }

  public int height() {
    return blabla;
  }

  public String name() {
    return name;
  }

  public int weight() {
    return weight;
  }

  public User age(int age) {
    this.age = age;
    return this;
  }

  public User height(int height) {
    this.blabla = height;
    return this;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  public User weight(int weight) {
    this.weight = weight;
    return this;
  }
}
