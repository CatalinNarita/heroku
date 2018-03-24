package com.edu.control.service;

import com.edu.control.dao.ItemDAO;
import com.edu.control.dao.ProductDAO;
import com.edu.control.dto.ProductDTO;
import com.edu.control.dto.mapper.ProductDTOMapper;
import com.edu.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private ItemDAO itemDAO;

    private ProductDTOMapper mapper = ProductDTOMapper.INSTANCE;

    public ProductDTO findById(Long id) {
        return mapper.mapToDto(productDAO.findOne(id));
    }

    public List<ProductDTO> getAllProducts() {
        return productDAO.findAll()
                .stream()
                .map(product -> mapper.mapToDto(product))
                .collect(Collectors.toList());
    }

    public void addproduct(ProductDTO productDTO) {
        Product product = mapper.mapToEntity(productDTO);
        productDAO.save(product);
    }

    public void updateProduct(ProductDTO productDTO) {
        Product product = productDAO.findOne(productDTO.getId());

        ProductSpec productSpec = product.getProductSpec();

        MonitorSpec monitorSpec = productSpec.getMonitorSpec();
        LaptopSpec laptopSpec = productSpec.getLaptopSpec();
        SmartphoneSpec smartphoneSpec = productSpec.getSmartphoneSpec();

        setMonitorSpec(monitorSpec, productDTO.getProductSpec().getMonitorSpec());
        setLaptopSepc(laptopSpec, productDTO.getProductSpec().getLaptopSpec());
        setSmartphoneSpec(smartphoneSpec, productDTO.getProductSpec().getSmartphoneSpec());

        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setQuantity(productDTO.getQuantity());
    }

    public void deleteProduct(Long id) {
        Product product = productDAO.getOne(id);
        itemDAO.deleteItemByProductId(product.getId());
        productDAO.delete(id);
    }

    private void setMonitorSpec(MonitorSpec monitorSpec, MonitorSpec monitorSpecDTO) {
        if(monitorSpec != null) {
            monitorSpec.setGuarantee(monitorSpecDTO.getGuarantee());
        }
    }

    private void setLaptopSepc(LaptopSpec laptopSpec, LaptopSpec laptopSpecDTO) {
        if(laptopSpec != null) {
            laptopSpec.setGuarantee(laptopSpecDTO.getGuarantee());
            laptopSpec.setHddCapacity(laptopSpecDTO.getHddCapacity());
            laptopSpec.setRam(laptopSpecDTO.getRam());
        }
    }

    private void setSmartphoneSpec(SmartphoneSpec smartphoneSpec, SmartphoneSpec smartphoneSpecDTO) {
        if(smartphoneSpec != null) {
            smartphoneSpec.setGuarantee(smartphoneSpecDTO.getGuarantee());
        }
    }

}
