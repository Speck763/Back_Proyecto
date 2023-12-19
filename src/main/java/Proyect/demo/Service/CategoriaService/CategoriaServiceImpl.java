package Proyect.demo.Service.CategoriaService;

import Proyect.demo.DTOs.ProductoCategoriaDTO;
import Proyect.demo.DTOs.ProductoMarcaDTO;
import Proyect.demo.Entidades.Categoria;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.CategoriaRepository;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria, Long> implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        super(categoriaRepository);
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public List<Categoria> search(String filtro) throws Exception {
        try {
            List<Categoria> categorias = categoriaRepository.search(filtro);
            return categorias;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public  Page<Categoria> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Categoria> categorias = categoriaRepository.search(filtro, pageable);
            return categorias;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<ProductoCategoriaDTO> findAllProductosByCategoria() throws Exception {
        try{
            List<ProductoCategoriaDTO> productoCategoriaDTOS = categoriaRepository.findAllProductosByCategoria();
            return productoCategoriaDTOS;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
