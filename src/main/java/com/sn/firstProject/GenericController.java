package com.sn.firstProject;

import java.util.*;
import java.util.Map;

import com.sn.firstProject.Utility.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class GenericController {

    Map<Integer,String> mp = new HashMap<>();
    GenericController(){
        mp.put(1,"FistValue");
        mp.put(2,"SecondValue");
        mp.put(3,"ThirdValue");
        mp.put(4,"FourthValue");
    }

    @GetMapping(path ="/getFirst")
    public String getInfo(){
        return "Raju";
    }

    @GetMapping(path ="/getAll")
    public Map<Integer,String> getMapInfo(){
        return mp;
    }

//    Using Path Variable
    @GetMapping(path ="/getByIdUsingPathVariable/{id}")
    public String getByIdUsingPathVariable(@PathVariable Integer id){
        return mp.get(id);
    }

//    Using Request Param
    @GetMapping(path ="/getByIdUsingRequestParam")
    public String getByIdUsingRequestParam(@RequestParam Integer id){
        return mp.get(id);
    }

    //    Using Request Body
    @GetMapping(path ="/getStudentDetailsUsingRequestParam")
    public String getStudentDetailsUsingRequestParam(@RequestBody Student student){
        return "Name: " + student.getName() + " Info: " + mp.get(student.getId());
    }

}
