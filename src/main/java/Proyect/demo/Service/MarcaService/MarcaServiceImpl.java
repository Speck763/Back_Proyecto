package Proyect.demo.Service.MarcaService;


import Proyect.demo.DTOs.DTODetalleFactura;
import Proyect.demo.DTOs.ProductoMarcaDTO;
import Proyect.demo.Entidades.Marca;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.MarcaRepository;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MarcaServiceImpl extends BaseServiceImpl<Marca,Long> implements MarcaService {
    @Autowired
    public MarcaRepository marcaRepository;
    public MarcaServiceImpl(BaseRepository<Marca, Long> baseRepository, MarcaRepository marcaRepository) {
        super(baseRepository); }

    @Override

    public List<Marca> search(String filtro) throws Exception {
        try {
            List<Marca> marcas = marcaRepository.search(filtro);
            return marcas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Marca> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Marca> marcas = marcaRepository.search(filtro, pageable);
            return marcas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<ProductoMarcaDTO> findAllProductosByMarca() throws Exception {
        try{
            List<ProductoMarcaDTO> productoMarcaDTOS = marcaRepository.findAllProductosByMarca();
            return productoMarcaDTOS;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}