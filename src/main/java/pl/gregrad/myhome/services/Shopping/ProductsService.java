package pl.gregrad.myhome.services.Shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.myhome.dto.ProductsDTO;
import pl.gregrad.myhome.entity.Products;
import pl.gregrad.myhome.repositories.ProductsRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<ProductsDTO> findAllProducts() {
        List<Products> products = productsRepository.findAll();
        List<ProductsDTO> productList = new ArrayList<>();
        for (Products s : products) {
            ProductsDTO allProducts = new ProductsDTO();
            allProducts.setId(s.getId());
            allProducts.setName(s.getName());
            allProducts.setPrice(s.getPrice());
            allProducts.setDate(s.getDate());
            productList.add(allProducts);
        }
        return productList;
    }
    public ProductsDTO findProduct(Long id) {
        Products products = productsRepository.findOne(id);
        ProductsDTO findProduct = new ProductsDTO();
        findProduct.setId(products.getId());
        findProduct.setName(products.getName());
        findProduct.setPrice(products.getPrice());
        findProduct.setDate(products.getDate());
        return findProduct;

    }
    public void delete(Long id) {
        productsRepository.delete(productsRepository.findOne(id));
    }

    public void edit(ProductsDTO product) {
        Products editProduct = productsRepository.findOne(product.getId());
        editProduct.setDate(product.getDate());
        editProduct.setName(product.getName());
        editProduct.setPrice(product.getPrice());
        productsRepository.save(editProduct);

    }


}