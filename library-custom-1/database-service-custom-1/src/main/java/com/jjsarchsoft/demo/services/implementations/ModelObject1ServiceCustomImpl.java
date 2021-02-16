package com.jjsarchsoft.demo.services.implementations;

import com.jjsarchsoft.demo.dao.interfaces.ModelObject1Dao;
import com.jjsarchsoft.demo.models.ModelObject1;
import com.jjsarchsoft.demo.services.interfaces.ModelObject1Service;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Log4j2
@Service
@Primary
public class ModelObject1ServiceCustomImpl implements ModelObject1Service {

    private ModelObject1Dao dao;

    public ModelObject1ServiceCustomImpl(ModelObject1Dao dao) {
        log.info("Initializing customization for database service");
        this.dao = dao;
    }

    @Override
    public ModelObject1 getOne(long id) {
        throw new NotImplementedException("getOne not yet implemented");
    }

    @Override
    public Collection<ModelObject1> getAll() {
        return dao.getAll();
    }

    @Override
    public ModelObject1 update(ModelObject1 object) {
        throw new NotImplementedException("update not yet implemented");
    }

    @Override
    public boolean delete(long id) {
        throw new NotImplementedException("delete not yet implemented");
    }
}
