package orz.mmp.app.dao;

import org.apache.ibatis.annotations.Param;
import orz.mmp.app.pojo.DataDictionary;

import java.util.List;

public interface DataDictionaryMapper {
    List<DataDictionary>getDataDictionaryList(@Param("typeCode") String typeCode);
}
