package orz.mmp.app.service.backend;

import orz.mmp.app.pojo.DataDictionary;

import java.util.List;

public interface DataDictionaryService {
    List<DataDictionary>showDataDictionaryList(String typeCode);
}
