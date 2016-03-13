package com.tnz.app.configuration;


import com.tnz.app.services.WriteImpl.Crayon;
import com.tnz.app.services.WriteImpl.Pen;
import com.tnz.app.services.WriteImpl.Pencil;
import com.tnz.app.services.WritingImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Admin on 3/10/16.
 */


@Configuration
public class AppConfig {

    @Bean(name = "pen")
    public WritingImplement getPen(){
        return new Pen();
    }

    @Bean(name = "default")
    public WritingImplement getCrayon(){
        return new Crayon();
    }

    @Bean(name = "pencil")
    public WritingImplement getPencil(){
        return new Pencil();
    }

}


