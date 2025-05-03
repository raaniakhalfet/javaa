package controler;


import com.SpringPro.SpringPro.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositery.AdminRepository;

@RestController

@RequestMapping(path = "/SpringPro")
public class adminControler {

    @Autowired
    private AdminRepository adminRepository;

    @PostMapping(path = "/add")
    public @ResponseBody Admin addAdmin (@RequestParam String name, @RequestParam String prenom, @RequestParam String email){
        Admin springAdmin = new Admin();
        springAdmin.setName(name);
        springAdmin.setPrenom(prenom);
        springAdmin.setEmail(email);
        return springAdmin;
    }
    @GetMapping(path = "/all")
    public Iterable<Admin> getAllAdmins(){
        return adminRepository.findAll();
    }

}

