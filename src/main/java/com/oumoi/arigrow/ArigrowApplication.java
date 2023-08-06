package com.oumoi.arigrow;

import com.oumoi.arigrow.parameters.domain.entity.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;

@SpringBootApplication
@Slf4j
public class ArigrowApplication implements CommandLineRunner {

	private final JdbcTemplate jdbcTemplate;

	public ArigrowApplication(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public static void main(String[] args) {
		SpringApplication.run(ArigrowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String query = "SELECT * FROM Category";
		log.info(query);

	}
}
