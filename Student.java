public class Student {
          private int id;
          private String name;
          private String branch;
      
          public Student(int id, String name, String branch) {
              this.id = id;
              this.name = name;
              this.branch = branch;
          }
      
          public int getId() { return id; }
          public String getName() { return name; }
          public String getBranch() { return branch; }
      
          public void setName(String name) { this.name = name; }
          public void setBranch(String branch) { this.branch = branch; }
      
          public void displayInfo() {
              System.out.println("ID: " + id + ", Name: " + name + ", Branch: " + branch);
          }
      }
      
