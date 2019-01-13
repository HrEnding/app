package orz.mmp.app.pojo;

public class BackendUserExt extends BackendUser{
    private  DataDictionary dataDictionary;

    public DataDictionary getDataDictionary() {
        return dataDictionary;
    }

    public void setDataDictionary(DataDictionary dataDictionary) {
        this.dataDictionary = dataDictionary;
    }
}
