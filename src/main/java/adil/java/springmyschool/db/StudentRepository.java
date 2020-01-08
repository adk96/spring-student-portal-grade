
package adil.java.springmyschool.db;

import adil.java.springmyscholl.entity.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, Long> {

    public Student findById(int i);

    public void deleteById(int i);
}