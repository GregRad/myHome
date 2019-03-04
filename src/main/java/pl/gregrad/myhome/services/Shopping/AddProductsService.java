package pl.gregrad.myhome.services.Shopping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.myhome.dto.ProductsDTO;
import pl.gregrad.myhome.entity.Products;
import pl.gregrad.myhome.repositories.ProductsRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class AddShoppingService {

    @Autowired
    ProductsRepository shoppingRepository;

    public void addProduct(ProductsDTO productForm) {
        Products product = new Products();
        product.setName(productForm.getName());
        product.setPrice(productForm.getPrice());
        product.setDate(productForm.getDate());
        shoppingRepository.save(product);
    }

}
