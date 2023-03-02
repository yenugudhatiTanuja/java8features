package com.hqlquery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="Trainer")
public class Trainer {
	@Id
	@GeneratedValue(generator="Id_generator")
	@GenericGenerator(name = "Id_generator",strategy ="org.hibernate.id.enhanced.SequenceStyleGenerator",
	parameters = { @Parameter(name="sequence_name", value="user_sequence"),
						      @Parameter(name ="initial_value",value="1001"),
							  @Parameter(name="increment_size",value = "1")})
   private int T_id;
   private String T_name;
   private String T_salary;
   private String T_city;
public int getT_id() {
	return T_id;
}
public void setT_id(int t_id) {
	T_id = t_id;
}
public String getT_name() {
	return T_name;
}
public void setT_name(String t_name) {
	T_name = t_name;
}
public String getT_salary() {
	return T_salary;
}
public void setT_salary(String t_salary) {
	T_salary = t_salary;
}


public Trainer(String t_name, String t_salary, String t_city) {
	super();
	T_name = t_name;
	T_salary = t_salary;
	T_city = t_city;
}
public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}
   
	
}
