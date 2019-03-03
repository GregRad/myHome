package pl.gregrad.myhome.services.Shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.myhome.dto.ShoppingDTO;
import pl.gregrad.myhome.entity.Shopping;
import pl.gregrad.myhome.repositories.ShoppingRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ShoppingService {

    @Autowired
    private ShoppingRepository shoppingRepository;

    public List<ShoppingDTO> findAllproducts() {
        List<Shopping> products = shoppingRepository.findAll();
        List<ShoppingDTO> productList = new ArrayList<>();
        for (Shopping s : products) {
            ShoppingDTO allProducts = new ShoppingDTO();
            allProducts.setName(s.getName());
            allProducts.setPrice(s.getPrice());
            allProducts.setDate(s.getDate());
            productList.add(allProducts);
        }
        return productList;
    }
    public ShoppingDTO findProduct(Long id) {
        Shopping shopping = shoppingRepository.findOne(id);
        ShoppingDTO findProduct = new ShoppingDTO();
        findProduct.setName(shopping.getName());
        findProduct.setPrice(shopping.getPrice());
        findProduct.setDate(shopping.getDate());
        return findProduct;

    }
    public void delete(Long id) {
        shoppingRepository.delete(shoppingRepository.findOne(id));
    }

    public void edit(ShoppingDTO product) {
        Shopping editProduct = shoppingRepository.findOne(product.getId());
        editProduct.setDate(product.getDate());
        editProduct.setName(product.getName());
        editProduct.setPrice(product.getPrice());
        shoppingRepository.save(editProduct);

    }


}