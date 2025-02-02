package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProducto;

public class ProductoImp implements IProducto{

	@Override
	public void RegistrarProducto(TblProducto tblproducto) {
		// ESTBABLECEMOS CONEXION CON PERSISTENCE (PORQUE AHI ESTA LA BD)
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoEAJPAMaven");
		//Permite gestionar entidades
		EntityManager em=emf.createEntityManager();
		//Iniciamos la transaccion
		em.getTransaction().begin();
		//Registramos
		em.persist(tblproducto);
		//Emitimos mensaje por pantalla
		System.out.println("Producto registrado en la BD");
		//Confirmamos
		em.getTransaction().commit();
		//Cerramos la transaccion
		em.close();
	}

	@Override
	public void ActualizarProducto(TblProducto tblproducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarProducto(TblProducto tblproducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblProducto> ListadoProducto() {
		// ESTBABLECEMOS CONEXION CON PERSISTENCE (PORQUE AHI ESTA LA BD)
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoEAJPAMaven");
		//Permite gestionar entidades
		EntityManager em=emf.createEntityManager();
		//Iniciamos la transaccion
		em.getTransaction().begin();
		//Recuperamos el listado de la base de datos
		List<TblProducto> listadoproductos=em.createQuery("SELECT p FROM TblProducto p",TblProducto.class).getResultList();
		//Confirmamos
		em.getTransaction().commit();
		//Cerramos
		em.close();
		//Retornamos el listado
		return listadoproductos;
	}

	@Override
	public TblProducto BuscarProducto(TblProducto tblproducto) {
		// TODO Auto-generated method stub
		return null;
	}

}
