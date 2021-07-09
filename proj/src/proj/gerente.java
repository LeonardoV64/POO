package proj;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

@SuppressWarnings("unused")
public class gerente extends empregado {
	public String senha;
	public int cargo, horas, cod_proj;
	
	public void Incluir() throws SQLException{
		String user = "root";
		String senha= "";
		String url = "jdbc:mysql://localhost/poo";
		java.sql.Connection c = DriverManager.getConnection(url, user, senha);
		String sql = "insert into emp_proj values(" + cargo + "," + cod_emp + "," + cod_proj + "," + horas + ")";
		PreparedStatement com = (PreparedStatement) c.prepareStatement(sql);
		com.execute();
		com.close();
		}
	
	public void Deletar() throws SQLException{
		String user = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/poo";
        java.sql.Connection c = DriverManager.getConnection(url, user, senha);
        String Sql = "delete from emp_proj where codEmp = " + cod_emp;
        if(JOptionPane.showConfirmDialog(null, "Confirma exclusão ?", "Atenção", JOptionPane.OK_CANCEL_OPTION) == 0) 
        {
        	PreparedStatement com = (PreparedStatement) c.prepareStatement(Sql);
        	com.execute();
        	com.close();       
        }
	}
	
	public void Alterar() throws SQLException{
		String user = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/poo";
        java.sql.Connection c = DriverManager.getConnection(url, user, senha);
        String Sql = "update emp_proj set cargo = '" + cargo + "', codEmp = '" + cod_emp + "codPro = " + cod_proj + "horas = " + horas +
                 "' where codEmp = " + cod_emp;
        PreparedStatement com = (PreparedStatement) c.prepareStatement(Sql);
        com.execute();
        com.close();
	}
	
	public void Pesquisar() throws SQLException{
		String user = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/poo";
        Connection c = (Connection) DriverManager.getConnection(url, user, senha);
        String SqlCom = "select * from emp_proj where codEmp = " + cod_emp;
        PreparedStatement com = (PreparedStatement) c.prepareStatement(SqlCom);
        ResultSet res = com.executeQuery();
        res.next();
        cargo = res.getInt("cargo");
        cod_emp = res.getString("codEmp");
        cod_proj = res.getInt("codPRo");
        horas = res.getInt("horas");
        com.close();
        c.close();
	}
	
	public void Consultar() throws SQLException{
		String user= "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/locadora";
        Connection conn = (Connection) DriverManager.getConnection(url, user, senha);
        String SqlCom = "select * from condutores";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        ArrayList<String> registros = new ArrayList<>();
        while(resultado.next())
        {
            registros.add(resultado.getString("codEmp") + 
                    " " + resultado.getString("codPro") + " " +
                    " " + resultado.getString("horas") + " " +
                    " " + resultado.getString("cargo"));
        }
        String lista = "";
        int j;
        for(j=0; j<registros.size(); j++) {
            lista = lista + registros.get(j) + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
        resultado.close();
        comando.close();
        conn.close();
	}
	
	
}
