package Interfaces;

import java.util.List;

import model.TblProducto;

public interface IProducto {
	//DECLARAMOS M�TODOS
	void RegistrarProducto(TblProducto tblproducto);
	void ActualizarProducto(TblProducto tblproducto);
	void EliminarProducto(TblProducto tblproducto);
	List<TblProducto> ListadoProducto();
	TblProducto BuscarProducto(TblProducto tblproducto);
}
