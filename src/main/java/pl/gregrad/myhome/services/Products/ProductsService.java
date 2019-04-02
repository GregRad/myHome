package pl.gregrad.myhome.services.Products;

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
            allProducts.setCategory(s.getCategory());
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
        findProduct.setCategory(products.getCategory());
        return findProduct;

    }
    public List<ProductsDTO> findProductByCategory(String category) {
        List<Products> products = productsRepository.findProductsByCategory(category);
        List<ProductsDTO> productsByCategory = new ArrayList<>();
        for (Products p : products) {
            ProductsDTO productCategory = new ProductsDTO();
            productCategory.setPrice(p.getPrice());
            productsByCategory.add(productCategory);
        }
        return productsByCategory;
    }
    public List<ProductsDTO> findProductByDate(Integer month, Integer year) {
        List<Products> products = productsRepository.findProductsByDate(month, year);
        List<ProductsDTO> productsByDate = new ArrayList<>();
        for (Products p : products) {
            ProductsDTO productsDate = new ProductsDTO();
            productsDate.setId(p.getId());
            productsDate.setName(p.getName());
            productsDate.setPrice(p.getPrice());
            productsDate.setCategory(p.getCategory());
            productsDate.setDate(p.getDate());
            productsByDate.add(productsDate);
        }
        return productsByDate;
    }
    public List<ProductsDTO> findProductsByYear (Integer year) {
    	List<Products> products = productsRepository.findProductsByYear(year);
    	List<ProductsDTO> productsByYear = new ArrayList<>();
    	for(Products p : products) {
    	ProductsDTO productsYear = new ProductsDTO();
    	productsYear.setName(p.getName());
    	productsYear.setDate(p.getDate());
    	productsYear.setPrice(p.getPrice());
    	productsYear.setCategory(p.getCategory());
    	productsByYear.add(productsYear);
    	}
    	return productsByYear;
    }
    
//    public List<ProductsDTO> findCategorizedProduct(Integer year, Integer month, String category) {
//    	List <Products> products = productsRepository.findCategorizeProducts(year, month, category);
//    	List <ProductsDTO> findCategorizedProducts = new ArrayList<ProductsDTO>();
//    	for (Products p : products) {
//    		ProductsDTO categorizedProducts = new ProductsDTO();
//    		categorizedProducts.setCategory(p.getCategory());
//    		categorizedProducts.setName(p.getName());
//    		categorizedProducts.setPrice(p.getPrice());
//    		categorizedProducts.setId(p.getId());
//    		findCategorizedProducts.add(categorizedProducts);
//    	}
//    	return findCategorizedProducts;
//    }

    public void delete(Long id) {
        productsRepository.delete(productsRepository.findOne(id));
    }

    public void edit(ProductsDTO product) {
        Products editProduct = productsRepository.findOne(product.getId());
        editProduct.setDate(product.getDate());
        editProduct.setName(product.getName());
        editProduct.setPrice(product.getPrice());
        editProduct.setCategory(product.getCategory());
        productsRepository.save(editProduct);

    }


}