package lpa.inventarios.service;

import lpa.inventarios.model.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> listarProductos();

    public Producto buscarProductoPorId(Integer idProducto);

    public Producto guardarProducto(Producto producto);

    public void eliminarProductoPorId(Integer idProducto);

}
