package edu.depaul.se452.group4.takeaseat.demo.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
    } 

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers("/resources/public/**")
                .permitAll()
                .and()
            .authorizeRequests()  
                .antMatchers("/", "/reservations/**", "/team/**",
                "/spaces/**", "/employee/**").hasRole("USER")
                .anyRequest().permitAll() 
                .and()  
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login?logout")
                .permitAll();
                

        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
    
    @Override  
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {  
        auth.inMemoryAuthentication()  
            .withUser("demo-user")  
            .password("{noop}password") // Spring Security 5 requires specifying the password storage format  
            .roles("USER");  
    } 

    
}