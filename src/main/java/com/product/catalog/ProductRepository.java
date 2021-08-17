package com.product.catalog;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import java.util.List;
import java.util.Optional;


public interface ProductRepository extends CrudRepository<Product, Long> {

    @Override
    @RestResource(exported = false)
     void deleteById(Long id);

    @Override
    <S extends Product> S save(S s);

    @Override
    <S extends Product> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    @RestResource(exported = false)
    void delete(Product entity);

    @Override
    List<Product> findAll();

    @Override
    Optional<Product> findById(Long aLong);



    @Configuration
    static class RepositoryConfig implements RepositoryRestConfigurer {
        @Override
        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry corsRegistry) {
            config.exposeIdsFor(Product.class);
        }
    }

}
