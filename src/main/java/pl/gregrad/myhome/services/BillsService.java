package pl.gregrad.myhome.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.myhome.dto.BillsDTO;
import pl.gregrad.myhome.entity.Bills;
import pl.gregrad.myhome.repositories.BillsRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BillsService {

    @Autowired
    private BillsRepository billsRepository;

    public List<BillsDTO> findAllBills() {
        List<Bills> bills = billsRepository.findAll();
        List<BillsDTO> billsList = new ArrayList<>();
        for (Bills b : bills) {
            BillsDTO allBills = new BillsDTO();
            allBills.setId(b.getId());
            allBills.setName(b.getName());
            allBills.setValue(b.getValue());
            allBills.setPaymentDate(b.getPaymentDate());
            billsList.add(allBills);
        }
        return billsList;
    }

    public void delete(Long id){
        billsRepository.delete(billsRepository.findOne(id));
    }
    public void edit(BillsDTO bill) {
        Bills editBill = billsRepository.findOne(bill.getId());
        editBill.setName(bill.getName());
        editBill.setValue(bill.getValue());
        editBill.setPaymentDate(bill.getPaymentDate());
        billsRepository.save(editBill);

    }
}