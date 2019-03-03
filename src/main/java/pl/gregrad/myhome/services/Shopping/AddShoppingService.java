package pl.gregrad.myhome.services.Shopping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.myhome.dto.ShoppingDTO;
import pl.gregrad.myhome.entity.Shopping;
import pl.gregrad.myhome.repositories.ShoppingRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class AddShoppingService {

    @Autowired
    ShoppingRepository shoppingRepository;

    public void addProduct(ShoppingDTO productForm) {
        Shopping product = new Shopping();
        product.setName(productForm.getName());
        product.setPrice(productForm.getPrice());
        product.setDate(productForm.getDate());
        shoppingRepository.save(product);
    }

}
