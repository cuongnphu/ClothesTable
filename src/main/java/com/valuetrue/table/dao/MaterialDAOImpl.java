package com.valuetrue.table.dao;

import com.valuetrue.table.model.Material;
import com.valuetrue.table.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;




@Repository
public class MaterialDAOImpl implements MaterialDAO {

    private MaterialRepository materialRepository;

    @Autowired
    public void setMaterialRepository(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    // SAVE a new material
    @Override
    public void saveMaterial(Material material) {
        materialRepository.save(material);
    }

    // UPDATE a particular material
    @Override
    public void updateMaterial(Material material) {
        Material mate = materialRepository.getOne(material.getId());
        mate.setName(material.getName());
        mate.setTableId(material.getTableId());
        mate.setWeight((material.getWeight()));
        mate.setNumClass(material.getNumClass());
        mate.setQuantity(material.getQuantity());
        materialRepository.save(mate);
    }

    // DELETE a particular material by Id
    @Override
    public void deleteMaterial(int id) {
        materialRepository.deleteById(id);
    }

    // GET a paticular by Id
    @Override
    public Material getMaterialById(int id) {
        return materialRepository.findById(id);
    }

    // GET all materials
    @Override
    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    // GET all materials by Table_id
    @Override
    public List<Material> getAllMaterialsByTableId(int table_id) {
        return materialRepository.findByTableId(table_id);
    }
}
