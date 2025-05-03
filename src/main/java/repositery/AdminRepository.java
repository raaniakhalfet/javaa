package repositery;


import com.SpringPro.SpringPro.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.*;


@Repository

public interface AdminRepository extends CrudRepository<Admin, Integer> {}

