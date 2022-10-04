package mds.uvod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

@RestController
public class StudentController {
    @GetMapping("student")
    public String Student(@RequestParam(defaultValue = "Matus Sandor") String name,
                          @RequestParam(defaultValue = "233267") int id) {
        return String.format("Student : <b>%s</b> ID: <b>%d</b>", name, id);
    }
    @GetMapping("students")
    public String Students(@RequestParam(required = false,defaultValue = "0") int vutid){
            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("Sivak", "Mykyta", 214410, 1999));
            students.add(new Student("Varga", "Oliver", 223335, 1999));
            students.add(new Student("Peňáz", "Vladimír", 227802, 1998));
            students.add(new Student("Ševčík", "Jan", 227840, 1999));
            students.add(new Student("Vlková", "Monika", 229233, 2001));
            students.add(new Student("Jarina", "Jakub", 230086, 2000));
            students.add(new Student("Popelka", "Adam", 230307, 2001));
            students.add(new Student("Kondás", "Peter", 230588, 2001));
            students.add(new Student("Kudela", "Ondřej", 230610, 2001));
            students.add(new Student("Kunčický", "Daniel", 230612, 2001));
            students.add(new Student("Lakomý", "Jan", 230613, 2000));
            students.add(new Student("Macek", "Josef", 230619, 2000));
            students.add(new Student("Pecháček", "Vilém", 230626, 2000));
            students.add(new Student("Repa", "Pavol", 230632, 2000));
            students.add(new Student("Skoumal", "Vladimír", 230665, 2000));
            students.add(new Student("Strouhal", "David", 230671, 2000));
            students.add(new Student("Svěcený", "Tomáš", 230675, 2000));
            students.add(new Student("Svozil", "Jiří", 230676, 2001));
            students.add(new Student("Vychodilová", "Natálie", 230911, 2001));
            students.add(new Student("Zárecký", "Martin", 230916, 2000));
            students.add(new Student("Svoboda", "Martin", 231283, 2001));
            students.add(new Student("Vomočil", "Radek", 232197, 2000));
            students.add(new Student("Pikhart", "Aleš", 233263, 2000));
            students.add(new Student("Šándor", "Matúš", 233267, 2001));
            students.add(new Student("Kohout", "David", 195823, 1996));
            students.add(new Student("Číka", "Petr", 10, 1982));
            students.add(new Student("Masaryk", "Tomáš", 123456, 1850));
        String w = "";
            if(vutid == 0) {
            for (Student s : students) {
                w += "<b>meno : </b>" + s.name + " " + s.surname + "<b> ID : </b>" + s.id + "<b> Rok : </b>" + s.year + "<br>";
            }
        }else {
                w += "neexistuje";
                for(Student s : students){
                    if(s.id == vutid){
                        w = "<b>meno : </b>" + s.name + " " + s.surname + "<b> ID : </b>" + s.id + "<b> Rok : </b>" + s.year + "<br>";
                        break;
                    }
                }
            }
        return w;
    }
}
