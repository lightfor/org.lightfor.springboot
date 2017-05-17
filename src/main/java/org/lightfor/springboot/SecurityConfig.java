package org.lightfor.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 安全配置类
 * Created by Light on 2017/5/15.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private ReaderRepository readerRepository;

    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeRequests()
                .antMatchers("/")
                .access("hasRole('READER')")
                .antMatchers("/**").permitAll()
                .and()
                .formLogin()
                .loginPage("/login")
                .failureForwardUrl("/login?error=true");
    }

    @Override
    protected  void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userName -> readerRepository.findOne(userName));
    }

}
