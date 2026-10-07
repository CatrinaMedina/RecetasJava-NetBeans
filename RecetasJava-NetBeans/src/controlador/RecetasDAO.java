package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Preparacion;
import modelo.Recetas;

public class RecetasDAO {

    public boolean ingresarReceta(Recetas receta) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "INSERT INTO tablapreparacion (nombre, ingredientes, tipo, porciones, tiempopreparacion, idPreparacion) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, receta.getNombre());
            ps.setString(2, receta.getIngredientes());
            ps.setString(3, receta.getTipo());
            ps.setInt(4, receta.getUnPreparacion().getPorciones());  
            ps.setInt(5, receta.getUnPreparacion().getTiempoPreparacion());
            ps.setInt(6, receta.getUnPreparacion().getIdPreparacion());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RecetasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarReceta(Recetas receta) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "UPDATE tablapreparacion SET ingredientes = ?, tipo = ?, porciones = ?, tiempopreparacion = ?, idPreparacion=? WHERE nombre = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, receta.getIngredientes()); 
            ps.setString(2, receta.getTipo()); 
            ps.setInt(3, receta.getUnPreparacion().getPorciones()); 
            ps.setInt(4, receta.getUnPreparacion().getTiempoPreparacion()); 
            ps.setInt(5, receta.getUnPreparacion().getIdPreparacion());
            ps.setString(6, receta.getNombre());
            
            resultado=ps.executeUpdate()==1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(RecetasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RecetasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  resultado;
    }
    public boolean eliminarReceta(String nombre)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="delete from tablapreparacion where nombre='"+nombre+"'";
            PreparedStatement ps=con.prepareStatement(query);
            resultado=ps.executeUpdate()==1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(RecetasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RecetasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
        public ArrayList<Recetas> obtenerTodos() {
        ArrayList<Recetas> receta = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            String query = "Select * from tablapreparacion";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(); 
            Recetas cc;
            while (rs.next()) {
                cc= new Recetas(rs.getString(1) ,rs.getString(2), rs.getString(3), rs.getInt(4),rs.getInt(5),rs.getInt(6));
                receta.add(cc);
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RecetasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return receta; 
    }
        
        
public Recetas buscarReceta(String nombre)
    {
        Recetas mas=null;
        try {
            Connection con=Conexion.getConexion();
            String query="select * from tablapreparacion where nombre='"+nombre+"'";
            PreparedStatement ps=con.prepareStatement(query);
         //   ps.setString(1, rut);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                mas=new Recetas(rs.getString(2),rs.getString(1),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(RecetasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RecetasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mas;
    }
    public int UltimoId()
    {
        int idPreparacion = 0;
        try {
            Connection con = Conexion.getConexion();
            String query = "select max(idPreparacion) as id from tablapreparacion";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idPreparacion = rs.getInt("id");
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RecetasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idPreparacion;
    }
    
}

    