package com.valuetrue.table.dao;

import com.valuetrue.table.model.Printer;
import com.valuetrue.table.repository.PrinterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PrinterDAOImpl implements PrinterDAO {

    private PrinterRepository printerRepository;

    // SPRING will instance and inject it when declare class
    @Autowired
    public void setPrinterRepository(PrinterRepository printerRepository) {
        this.printerRepository = printerRepository;
    }

    // SAVE a printer
    @Override
    public void savePrinter(Printer printer) {
        printerRepository.save(printer);
    }

    // UPDATE a printer
    @Override
    public void updatePrinter(Printer printer) {
        Printer print = printerRepository.getOne(printer.getId());
        print.setName(printer.getName());
        print.setTableId(printer.getTableId());
        print.setPrice(printer.getPrice());
        print.setQuantity(printer.getQuantity());
        print.setTotal(printer.getTotal());
        printerRepository.save(print);
    }

    // DELETE a Printer by Id
    @Override
    public void deletePrinter(int id) {
        printerRepository.deleteById(id);
    }

    // GET a particular Printer by Id
    @Override
    public Printer getPrinterById(int id) {
        return printerRepository.findById(id);
    }

    // GET all printers
    @Override
    public List<Printer> getAllPrinters() {
        return printerRepository.findAll();
    }

    // GET all printers by TableId
    @Override
    public List<Printer> getAllPrintersByTableId(int table_id) {
        return printerRepository.findByTableId(table_id);
    }

    // GET all printers by Name
    @Override
    public List<Printer> getAllPrinterByName(String name) {
        return printerRepository.findByName(name);
    }
}
