package io.renren.modules.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.app.dao.HorseDao;
import io.renren.modules.app.dto.HorseDTO;
import io.renren.modules.app.entity.HorseEntity;
import io.renren.modules.app.service.HorseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2023-04-11
 */
@Service
public class HorseServiceImpl extends CrudServiceImpl<HorseDao, HorseEntity, HorseDTO> implements HorseService {

    @Override
    public QueryWrapper<HorseEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");
        String horseName = (String)params.get("horseName");

        QueryWrapper<HorseEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);
        wrapper.eq(StringUtils.isNotBlank(horseName), "horse_name", horseName);

        return wrapper;
    }


}