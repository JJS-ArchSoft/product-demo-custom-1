package com.jjsarchsoft.demo.dao.implementations;

import com.jjsarchsoft.demo.models.ModelObject1;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Log4j2
@Component
@Primary
public class ModelObject1DaoCustomImpl extends ModelObject1DaoImpl {

    public ModelObject1DaoCustomImpl() {
        super();
        log.info("Initialized dao customization");
        this.modelObject1Table.add(ModelObject1.builder().id(4L).property1("value4-1").property2("value4-2").build());
        this.modelObject1Table.add(ModelObject1.builder().id(5L).property1("value5-1").property2("value5-2").build());
        this.modelObject1Table.add(ModelObject1.builder().id(6L).property1("value6-1").property2("value6-2").build());
    }

    @Override
    public Collection<ModelObject1> getAll() {
        log.info("Call ModelObject1Custom extended class");
        return super.getAll();
    }

}
