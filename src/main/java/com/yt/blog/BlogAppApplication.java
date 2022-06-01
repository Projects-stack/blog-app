package com.yt.blog;

import com.yt.blog.config.AppConstants;
import com.yt.blog.entities.Role;
import com.yt.blog.repositories.RoleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class BlogAppApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(BlogAppApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Override
	public void run(String... args) {
		System.out.println(passwordEncoder.encode("abc"));
		try {
			Role normal = new Role();
			normal.setId(AppConstants.NORMAL_USER);
			normal.setName("ROLE_NORMAL");

			Role admin = new Role();
			 admin.setId(AppConstants.ADMIN_USER);
			admin.setName("ROLE_ADMIN");

			List<Role> roles = List.of(normal, admin);

			List<Role> result = this.roleRepository.saveAll(roles);

			result.forEach(r -> {
				System.out.println(r.getName());
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
