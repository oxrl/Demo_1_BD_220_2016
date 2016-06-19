/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bean;

import cl.pojos.Producto;
import cl.services.ProductoFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author oxrl
 */
@Named(value = "bean")
@RequestScoped
public class ProductoBean {

    @EJB
    private ProductoFacadeLocal productoFalcade;
             
    public ProductoBean() {
    }
    
    public List<Producto> getProductos(){
        return this.productoFalcade.findAll();
    }
    
    
}
