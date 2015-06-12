package com.isil.lesson8.applesson8;

import android.app.Application;

import com.isil.lesson8.applesson8.model.entity.ProductEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Profesor on 06/06/2015.
 */
public class LessonApplication extends Application {


    private List<ProductEntity> lstProducts;

    @Override
    public void onCreate() {
        super.onCreate();
        lstProducts= new ArrayList<ProductEntity>();

        lstProducts.add(new ProductEntity(1,"Detergente",10.00f));
        lstProducts.add(new ProductEntity(2,"Arroz",15.00f));
        lstProducts.add(new ProductEntity(3,"Azucar",6.00f));
        lstProducts.add(new ProductEntity(4,"Aceite",5.00f));

    }

    public List<ProductEntity> getLstProducts() {
        return lstProducts;
    }

    //CRUD PRoducto
    //1 agregar producto
    public void agregarProducto(ProductEntity productEntity)
    {
        lstProducts.add(productEntity);
    }
    public List<ProductEntity> productos()
    {
        return lstProducts;
    }
    public int totalProductos()
    {
        return lstProducts.size();
    }
    public ProductEntity buscarxId(ProductEntity productEntity)
    {
        int id= productEntity.getId();
        ProductEntity aux=null;
        for (int i = 0; i <lstProducts.size() ; i++) {
            aux= lstProducts.get(i);
            if(aux.getId()==id)
            {
                return aux;
            }
        }
        return  null;
    }

    public void borrarProducto(ProductEntity productEntity)
    {
        lstProducts.remove(productEntity);
    }

    public void editarProducto(ProductEntity productEntity)
    {
        ProductEntity aux= buscarxId(productEntity);
        if(aux!=null)
        {
          borrarProducto(aux);
          agregarProducto(productEntity);
        }

    }

}
