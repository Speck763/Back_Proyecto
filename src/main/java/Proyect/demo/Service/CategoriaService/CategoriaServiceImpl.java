package Proyect.demo.Service.CategoriaService;

import Proyect.demo.Entidades.Categoria;
import Proyect.demo.Repository.BaseRepository;
import Proyect.demo.Repository.CategoriaRepository;
import Proyect.demo.Service.BaseService.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria, Long> implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;


    public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository, CategoriaRepository categoriaRepository) {
        super(baseRepository);
        this.categoriaRepository = categoriaRepository;
    }


    @Override
    public List<Categoria> search(String filtro) throws Exception {
        try {
            List<Categoria> categorias = CategoriaRepository.search(filtro);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public  Page<Categoria> findAll(Pageable pageable) throws Exception {
      try{
          Page<Categoria> categorias = CategoriaRepository.search(filtro);
    } catch (Exception e) {
        throw new Exception(e.getMessage());
    }
    }
}
