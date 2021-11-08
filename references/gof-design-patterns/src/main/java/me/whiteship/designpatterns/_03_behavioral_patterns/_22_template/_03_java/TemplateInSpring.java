package me.whiteship.designpatterns._03_behavioral_patterns._22_template._03_java;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class TemplateInSpring {

    public static void main(String[] args) {
        // TODO 템플릿-콜백 패턴
        // JdbcTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.execute("insert");

        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("X-COM-PERSIST", "NO");
        headers.set("X-COM-LOCATION", "USA");

        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> responseEntity = restTemplate
                .exchange("http://localhost:8080/users", HttpMethod.GET, entity, String.class);
    }

    @Configuration
    class SecurityConfig extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests().anyRequest().permitAll();
        }
    }
}
