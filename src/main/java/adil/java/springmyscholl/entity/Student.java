
package adil.java.springmyscholl.entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

   private int id;
   private String name;
   private String surname;
   private String image;

 public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

  

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setName(String some_new_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

