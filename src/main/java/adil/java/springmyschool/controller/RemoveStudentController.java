
package adil.java.springmyschool.controller;


import adil.java.springmyscholl.entity.Student;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RemoveStudentController {
    
    @RequestMapping(value = "/RemoveStudent", method = RequestMethod.GET)
    public ModelAndView student(){
        return new ModelAndView("RemoveStudent", "command", new Student());
    }

    @RequestMapping(value = "/RemoveStudent",
            method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("RemoveStudent") Student student,
                            ModelMap  model,
                            BindingResult result) {
        model.addAttribute("name",student.getName());
        model.addAttribute("surname",student.getSurname());
        model.addAttribute("image",student.getImage());

        return "ShowAllStudent";
    }
}
    
