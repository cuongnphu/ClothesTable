package com.valuetrue.table.dao;

import com.valuetrue.table.model.Sewing;
import com.valuetrue.table.repository.SewingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public class SewingDAOImpl implements SewingDAO {

    private SewingRepository sewingRepository;

    // SPRING will instace and inject it when declare class
    @Autowired
    public void setSewingRepository(SewingRepository sewingRepository) {
        this.sewingRepository = sewingRepository;
    }

    // SAVE a sewing
    @Override
    public void saveSewing(Sewing sewing) {
        sewingRepository.save(sewing);
    }

    // UPDATE a sewing
    @Override
    public void updateSewing(Sewing sewing) {
        Sewing sew  = sewingRepository.getOne(sewing.getId());
        sew.setName(sewing.getName());
        sew.setTableId(sewing.getTableId());
        sew.setPrice(sewing.getPrice());
        sew.setQuantity(sewing.getQuantity());
        sew.setTotal(sewing.getTotal());
        sewingRepository.save(sew);
    }

    // DELETE a sewing by Id
    @Override
    public void deleteSewing(int id) {
        sewingRepository.deleteById(id);
    }

    // GET a Sewing by Id
    @Override
    public Sewing getSewingById(int id) {
        return sewingRepository.findById(id);
    }

    // GET all Sewings
    @Override
    public List<Sewing> getAllSewings() {
        return sewingRepository.findAll();
    }

    // GET all Sewings by TableId
    @Override
    public List<Sewing> getAllSewingsByTableId(int table_id) {
        return sewingRepository.findByTableId(table_id);
    }

    // GET all Sewings by Name
    @Override
    public List<Sewing> getAllSewingByName(String name) {
        return sewingRepository.findByName(name);
    }

    @Override
    public List<Sewing> getAllSewingByNameOrderByTableId(String name) {
        return sewingRepository.findByNameOrderByTableId(name);
    }
}
