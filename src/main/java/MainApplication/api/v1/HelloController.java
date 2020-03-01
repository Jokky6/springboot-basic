package MainApplication.api.v1;

import MainApplication.exception.http.ForbiddenException;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/banner")
public class HelloController {

    @GetMapping("/hello")
    public String HelloWorld() {
        throw new RuntimeException("123123");
    }

    @PostMapping("/hello")
    public String Hello() {
        throw new ForbiddenException(10001);
    }
}
