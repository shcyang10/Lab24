package co.gc.CoffeeShopLab24.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CoffeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Items> findItems() {
		return jdbcTemplate.query("select * from Items", new BeanPropertyRowMapper<Items>(Items.class));
	}
	public int addUser(String name, String email, String phoneNum, String password) {
		String addQuery = "insert into Users(name, email, phoneNumber, password)values(?,?,?,?)";
		return jdbcTemplate.update(addQuery, name, email, phoneNum, password);
	}

}
