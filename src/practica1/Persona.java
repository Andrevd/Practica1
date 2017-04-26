/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author root
 */
public class Persona 
{private int edad;
     
   public void setEdad(int edadParametro)
   {
     this.edad=edadParametro;  
   }
   public int getEdad(){
      return this.edad;
   }
   
   
private String nombre;
public void setNombre(String nombreParametro)
   {
     this.nombre=nombreParametro;  
   }
   public String getNombre()
   {
      return this.nombre;
   }
   
   
   private char id;
     public void setId(char idPara)
   {
     this.id=idPara;
   }
    public char getId()
  {
    return this.id;
  }

    
    private char tipoDocumento;
     public void setTipoDocumento(char tipoDocumentoPara)
   {
     this.tipoDocumento=tipoDocumentoPara;
   }
    public char getTipoDocumento()
  {
    return this.tipoDocumento;
  }
   public void andar(){}
   public void comer(){}
  }
