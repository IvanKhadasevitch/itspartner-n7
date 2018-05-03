package by.ivan.itspartnertestn7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {
    private static final String TEMPLATE = "Hello, %s!";
    public static final String TEMPLATE_ERROR = "Error, specify parameter of GET request /hello, as: /hello?name=...";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(name = "/hello", method = RequestMethod.GET)
    public Hello greeting(@RequestParam(value="name") String name) throws Exception {
        if (name != null && ! name.isEmpty() ) {

            return new Hello(counter.incrementAndGet(),
                    String.format(TEMPLATE, name));
        }
        else {
            throw new Exception(TEMPLATE_ERROR);
        }
    }
}
