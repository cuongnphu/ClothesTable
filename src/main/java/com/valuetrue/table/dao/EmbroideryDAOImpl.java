package com.valuetrue.table.dao;

import com.valuetrue.table.model.Embroidery;
import com.valuetrue.table.repository.EmbroideryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;



@Repository
public class EmbroideryDAOImpl implements EmbroideryDAO {

    private EmbroideryRepository embroideryRepository;

    // Spring will instance and inject it into the class that declared it
    @Autowired
    public void setEmbroideryRepository(EmbroideryRepository embroideryRepository) {
        this.embroideryRepository = embroideryRepository;
    }

    // SAVE a Embroidery
    @Override
    public void saveEmbroidery(Embroidery embroidery) {
        embroideryRepository.save(embroidery);
    }

    // UPDATE a particular Embroidery
    @Override
    public void updateEmbroidery(Embroidery embroidery) {
        Embroidery emb = embroideryRepository.getOne(embroidery.getId());
        emb.setName(embroidery.getName());
        emb.setTableId(embroidery.getTableId());
        emb.setPrice(embroidery.getPrice());
        emb.setQuantity(embroidery.getQuantity());
        emb.setTotal(embroidery.getTotal());
        embroideryRepository.save(emb);
    }

    // DELETE a particular Embroidery by Id
    @Override
    public void deleteEmbroidery(int id) {
        embroideryRepository.deleteById(id);
    }

    // GET a Embroidery by Id
    @Override
    public Embroidery getEmbroideryById(int id) {
        return embroideryRepository.findById(id);
    }

    // GET all Embroideries
    @Override
    public List<Embroidery> getAllEmbroideries() {
        return embroideryRepository.findAll();
    }

    // GET all Embroideries by Table_Id
    @Override
    public List<Embroidery> getAllEmbroideriesByTableId(int table_id) {
        return embroideryRepository.findByTableId(table_id);
    }

    // GET all Embroideries by Name
    @Override
    public List<Embroidery> getAllEmbroideriesByName(String name) {
        return embroideryRepository.findByName(name);
    }

    @Override
    public List<Embroidery> getAllEmbroideriesByNameOrderByTableId(String name) {
        return embroideryRepository.findByNameOrderByTableId(name);
    }
}
