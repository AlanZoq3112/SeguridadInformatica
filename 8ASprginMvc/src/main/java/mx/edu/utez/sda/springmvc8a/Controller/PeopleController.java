package mx.edu.utez.sda.springmvc8a.Controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Optional;

@Controller
public class PeopleController {

    String UN_VARIABLEmaldeclarada = "Un valor x";

    @Secured("ROLE_ADULTO")
    @GetMapping("/accion")
    public String accion(){
        String x = "";
        while (x != null){
            //nd
        }
        System.out.println("Entró a ACCION de personas");
        return "accion";
    }

//    @Secured("ROLE_ADULTO")
//    @GetMapping("/accion")
//    public String accion(){
//        System.out.println("Entró a ACCION de personas");
//        return "accion";
//    }
//
//    @Secured({"ROLE_ADULTO","ROLE_PEQUE"})
//    @GetMapping("/animal")
//    public String animal(){
//        System.out.println("Entró a animal de personas");
//        return "animal";
//    }
//
//    @Secured({"ROLE_ADULTO","ROLE_PEQUE"})
//    @GetMapping("/infantil")
//    public String infantil(){
//        System.out.println("Entró a infantil de personas");
//        return "infantil";
//    }
//
//    @Secured({"ROLE_ADULTO","ROLE_PEQUE"})
//    @GetMapping("/anime")
//    public String anime(){
//        System.out.println("Entró a anime de personas");
//        return "anime";
//    }
//
//    @Secured("ROLE_ADULTO")
//    @GetMapping("/eroticas")
//    public String eroticas(){
//        System.out.println("Entró a eroticas de personas");
//        return "eroticas";
//    }
//
//    @Secured("ROLE_ADULTO")
//    @GetMapping("/suspenso")
//    public String suspenso(){
//        System.out.println("Entró a suspenso de personas");
//        return "suspenso";
//    }




}
