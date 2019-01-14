package orz.mmp.app.service.backend.impl;

import org.springframework.stereotype.Service;
import orz.mmp.app.dao.DataDictionaryMapper;
import orz.mmp.app.pojo.DataDictionary;
import orz.mmp.app.service.backend.DataDictionaryService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {
    @Resource
    private DataDictionaryMapper dataDictionaryMapper;
    public List<DataDictionary> showDataDictionaryList(String typeCode) {
        return dataDictionaryMapper.getDataDictionaryList(typeCode);
    }
}
