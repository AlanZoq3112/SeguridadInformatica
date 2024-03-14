package mx.edu.utez.sda.springmvc8a.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
    securedEnabled = true
)
public class SecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
        UserDetails user1 = User.withUsername("user1")
                .password(
                        passwordEncoder().encode("user123")
                )
                .roles("USER")
                .build();
        UserDetails admin = User.withUsername("admin")
                .password(
                        passwordEncoder().encode("admin123")
                )
                .roles("ADMIN")
                .build();

        UserDetails adulto = User.withUsername("adulto")
                .password(
                        passwordEncoder().encode("adulto123")
                )
                .roles("ADULTO")
                .build();
        UserDetails peque = User.withUsername("peque")
                .password(
                        passwordEncoder().encode("peque123")
                )
                .roles("PEQUE")
                .build();
        return new InMemoryUserDetailsManager(user1, admin, adulto, peque);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((request)->{
            request.requestMatchers("/","/index").permitAll();
            request.anyRequest().authenticated();
        });

        http.formLogin((login)->{
            login.loginPage("/login").permitAll();
        });

        http.logout(LogoutConfigurer::permitAll);
        return http.build();
    }

}

