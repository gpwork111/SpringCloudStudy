package crcc.study.feign.student.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by dell on 2019/7/11.
 */
@Service
@FeignClient("crcc-study-ribbon/user")
public interface StudentService {

    @GetMapping("/getByName/{name}")
    public String getStudent(@PathVariable("name")String name);

    @GetMapping("/getById")
    public String getById(@RequestParam("id")String id);
}
