package vvkingg.myblog;

import org.apache.tomcat.util.http.fileupload.UploadContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;

@SpringBootApplication
public class MyblogApplication implements WebMvcConfigurer {

	public static void main(String[] args) {

		SpringApplication.run(MyblogApplication.class, args);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry){
		registry.addResourceHandler("/Files/**")
				.addResourceLocations("file:Files/");
	}
}
