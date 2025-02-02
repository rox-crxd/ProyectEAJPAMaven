package TestEntidades;

import java.util.Date;
import java.util.List;

import DaoImp.ProductoImp;
import model.TblProducto;

public class TestProducto {

	public static void main(String[] args) {
		// INSTANCIAMOS LAS RESPECTIVAS CLASES
		TblProducto tbl=new TblProducto();
		ProductoImp crudimp=new ProductoImp();
		
		/*//ASIGNAMOS LOS RESPECTIVOS VALORES
		tbl.setNomprod("fideos");
		tbl.setCantidad(4);
		tbl.setPrecio(5);
		tbl.setTotal(tbl.getCantidad()*tbl.getPrecio());
		tbl.setNrolote("lote12025");
		tbl.setCodbarras("cod789456");
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		tbl.setFechaven(fechasql);
		//Invocamos el respectivo metodo registrar
		crudimp.RegistrarProducto(tbl);*/
		
		List<TblProducto> listadoproductos=crudimp.ListadoProducto();
		//Aplicamos un bucle for
		for(TblProducto prod:listadoproductos){
			//Imprimimos 
			System.out.println("codigo: " + prod.getIdproducto()+" producto: " + prod.getNomprod() +" precio: " +
			prod.getPrecio() + " cantidad: " + prod.getCantidad() + " total: " + prod.getTotal() + " codigo de barras: " + 
			prod.getCodbarras());
		}
		
	}

}
