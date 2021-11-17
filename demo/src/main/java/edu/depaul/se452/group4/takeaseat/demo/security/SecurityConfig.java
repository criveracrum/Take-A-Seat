package edu.depaul.se452.group4.takeaseat.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
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
                .antMatchers("/dashboard/**").hasRole("ADMIN")
                .antMatchers("/", "/reservations/**", "/team/**",
                "/spaces/**", "/employee/**").hasAnyRole("ADMIN","USER")
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
    
    // @Override  
    // protected void configure(AuthenticationManagerBuilder auth) throws Exception {  
    //     auth.inMemoryAuthentication()  
    //         .withUser("demo-user")  
    //         .password("{noop}password") // Spring Security 5 requires specifying the password storage format  
    //         .roles("USER");  
    // } 
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth
                .authenticationProvider(dbAuthenticationProvider());
//                .inMemoryAuthentication()
//                .withUser("reg-user").password(encoder.encode("password")).roles("USER")
//                .and()
//                .withUser("admin-user").password(encoder.encode("password")).roles("ADMIN");
    }

    @Autowired
    private UserDetailsService userDetailsService;

    
    public DaoAuthenticationProvider dbAuthenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

  
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    
}