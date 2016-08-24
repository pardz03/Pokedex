package com.core.pokedex.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

import com.core.pokedex.util.PokedexConstants;


@EnableWebMvc
@Configuration
@ComponentScan(PokedexConstants.projectScanning)
@PropertySources({
	@PropertySource("classpath:en.properties")
})
public class SpringConfig extends WebMvcConfigurerAdapter {
	
    private static final String INTERNATIONALIZATION = "/WEB-INF/i18n/en";
    private static final String VIEWS = "/WEB-INF/views/";
    private static final String RESOURCES_LOCATION = "/resources/";
    private static final String RESOURCES_HANDLER = RESOURCES_LOCATION + "**";
    
	    /*
	     * this method uses the prefix and suffix shortcut for the page
	     */
    	@Bean(name ="templateResolver")	
	    public TemplateResolver templateResolver() {
	        TemplateResolver templateResolver = new ServletContextTemplateResolver();
	        templateResolver.setPrefix(VIEWS);
	        templateResolver.setSuffix(".html");
	        templateResolver.setTemplateMode("HTML5");
	        templateResolver.setCacheable(false);
	        return templateResolver;
	    }
	    /*
	     * this method uses the template resolver bean for suffix and prefix of the page
	     */
	    @Bean(name ="templateEngine")	
	    public SpringTemplateEngine templateEngine() {
	        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	        templateEngine.setTemplateResolver(templateResolver());
	        return templateEngine;
	    }
	    
	    /*
	     * this method is for using the template engine shortcut for suffix and prefix for the view
	     */
	    @Bean(name="viewResolver")
	    public ThymeleafViewResolver viewResolver() {
	        ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
	        thymeleafViewResolver.setTemplateEngine(templateEngine());
	        thymeleafViewResolver.setCharacterEncoding("UTF-8");
	        return thymeleafViewResolver;
	    }
	    
	    /**
	     * this method is for handling resources for the project
	     * eg. css,js
	     */
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry
	        	.addResourceHandler(RESOURCES_HANDLER)
	        	.addResourceLocations(RESOURCES_LOCATION);
	    }
	    
	    /**
	     * this method is for internationalization purposes
	     * @return
	     */
	    @Bean(name = "messageSource")
	    public MessageSource messageSource() {
	        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	        messageSource.setBasenames(INTERNATIONALIZATION);
	        messageSource.setCacheSeconds(5);
	        return messageSource;
	    }
}
