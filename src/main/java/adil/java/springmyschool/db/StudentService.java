
package adil.java.springmyschool.db;

import adil.java.springmyscholl.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor //lombok
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public void someExample() {
        Student student = studentRepository.findById(12);
        student.setName("some_new_name");

//readAllStudentsFromDB
        studentRepository.findAll();
//insertStudentIntoDB 
        studentRepository.save(new Student());
//deleteStudent
        studentRepository.deleteById(1);
//update
        studentRepository.save(student);
    }
}
