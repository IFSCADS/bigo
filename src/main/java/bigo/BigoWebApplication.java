package bigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class BigoWebApplication {

    record Request(int n, int passo){}

    public static void main(String[] args) {
        SpringApplication.run(BigoWebApplication.class, args);
    }

    @PostMapping("/bigo")
    List<Ponto> executa(@RequestBody Request params) {
        ArrayList<Ponto> result = new ArrayList<>();

        for (int j=1; j < params.n; j += params.passo) {
            App app = new App(j);
            long t1 = System.currentTimeMillis();
            app.executa();
            double dt = System.currentTimeMillis() - t1;
            Ponto p = new Ponto(j, dt/1000);
            result.add(p);
        }
        return result;
    }

}
