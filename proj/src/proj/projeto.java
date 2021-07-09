package proj;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.Date;

public class projeto {
	public String cod_proj, cod_emp, nome_p, contratatante;
	public Date data_ini, data_fim;
	public boolean status;
}
