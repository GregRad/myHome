package pl.gregrad.myhome.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.myhome.dto.BillsDTO;
import pl.gregrad.myhome.entity.Bills;
import pl.gregrad.myhome.repositories.BillsRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class AddBillService {

    @Autowired
    private BillsRepository billsRepository;

    public void addBill (BillsDTO billForm) {

        Bills bill = new Bills();
        bill.setName(billForm.getName());
        bill.setValue(billForm.getValue());
        bill.setPaymentDate(billForm.getPaymentDate());
        billsRepository.save(bill);


    }
}
