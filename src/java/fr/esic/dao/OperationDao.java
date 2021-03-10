/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.dao;

import fr.esic.model.Operation;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author marye
 */
/*
public class OperationDao {
    
    	 Connection con=null;
 PreparedStatement st=null;
 ResultSet rs=null;
	


  
	public ArrayList<Operation> AfficheListe()
	{
		 ArrayList <Operation> liste=new ArrayList<Operation>();
		try
		{
			st=con.prepareStatement("select * from operation");
			rs=st.executeQuery();
			while(rs.next())
			{
				Operation c=new Operation();
				
				c.setIdOperation(rs.getInt("NumOp"));
				c.setTypeOperation(rs.getString("LibelleOp"));
				c.setMontantOperation(rs.getInt("MontantOp"));
			
				c.setNumcp(rs.getInt("NumCp"));

				
				liste.add(c);
				
			}
			
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		return liste;
	}
    
	public ArrayList<Operation> AfficheListeOp(int numcp)
	{
		 ArrayList <Operation> liste=new ArrayList<Operation>();
		try
		{
			st=con.prepareStatement("select * from operation where NumCp=?");
			st.setInt(1,numcp);
			rs=st.executeQuery();
			while(rs.next())
			{
				Operation c=new Operation();
				
				c.setNumop(rs.getInt("NumOp"));
				c.setLibelleop(rs.getString("LibelleOp"));
				c.setSenseop(rs.getString("SensOp"));
				c.setMontantop(rs.getInt("MontantOp"));
			
				
				c.setNumcp(rs.getInt("NumCp"));

				
				liste.add(c);
				
			}
			
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		return liste;
	}
	
    public void AjouterOperation(Operation c)
	{
		try
		{
			st=con.prepareStatement("insert into Operation(LibelleOp,SensOp,MontantOp, DateOp,NumCp) values (?,?,?,?,?)");
			//st.setInt(1, c.getNumop());
			st.setString(1, c.getLibelleop());
			st.setString(2, c.getSenseop());
			st.setInt(3, c.getMontantop());
			
			Date date=new java.sql.Date(new java.util.Date().getTime());			
			st.setDate(4, date);
			
			st.setInt(5, c.getNumcp());
			

			st.executeUpdate();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
    
    public Operation RechercherOperationc(int code)
	{
		Operation c=null;
		try
		{
			st=con.prepareStatement("select * from Operation where NumOp=?");
			st.setInt(1,code);
			rs=st.executeQuery();
			if(rs.next())
			{
				 c=new Operation();
				
				 c.setNumop(rs.getInt("NumOp"));
					c.setLibelleop(rs.getString("LibelleOp"));
					c.setSenseop(rs.getString("SensOp"));
					c.setMontantop(rs.getInt("MontantOp"));
					
					//c.setDateop(rs.getDate("dateOp"));
					c.setNumcp(rs.getInt("NumCp"));
				
			}
		
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		return c;
	}
    /* 
    public Operation RechercherOperation(int code)
	{
		Operation c=null;
		try
		{
			st=con.prepareStatement("select * from Operation where NumOp=?");
			st.setInt(1,code);
			rs=st.executeQuery();
			if(rs.next())
			{
				 c=new Operation();
				
				 c.setNumop(rs.getInt("NumOp"));
					c.setLibelleop(rs.getString("LibelleOp"));
					c.setSenseop(rs.getString("SensOp"));
					c.setMontantop(rs.getInt("MontantOp"));
					sqld=rs.getDate("DateOp");
					dn=String.valueOf(sqld);
					dtn=this.sqlEnChaine(dn);
					c.setDateop(dtn);
					c.setNumcp(rs.getInt("NumCp"));
				
			}
		
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		return c;
	}
   
    public void ModifierOperation(Operation c)
	{
		try
		{
			st=con.prepareStatement("update operation set LibelleOp=?,SensOp=?, MontantOp=?, DateOp=?, NumCp=? where NumOp=?");
			st.setString(1, c.getLibelleop());
			st.setString(2, c.getSenseop());
			st.setInt(3, c.getMontantop());
			st.setString(4, c.getDateop());
			st.setInt(5, c.getNumcp());
			st.setInt(6, c.getNumop());
			
			st.executeUpdate();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
   
 
*/

