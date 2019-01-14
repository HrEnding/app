package orz.mmp.app.pojo;

public class AppInfoExt extends AppInfo {
    private String devName;//开发者名称
    private String statusName;//app状态名称
    private String categoryLevel3Name;//所属三级分类名称
    private String flatformName;//app所属平台名称
    private String categoryLevel1Name;//所属一级分类名称
    private String categoryLevel2Name;//所属二级分类名称
    private String versionNo;//最新的版本号

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getCategoryLevel3Name() {
        return categoryLevel3Name;
    }

    public void setCategoryLevel3Name(String categoryLevel3Name) {
        this.categoryLevel3Name = categoryLevel3Name;
    }

    public String getFlatformName() {
        return flatformName;
    }

    public void setFlatformName(String flatformName) {
        this.flatformName = flatformName;
    }

    public String getCategoryLevel1Name() {
        return categoryLevel1Name;
    }

    public void setCategoryLevel1Name(String categoryLevel1Name) {
        this.categoryLevel1Name = categoryLevel1Name;
    }

    public String getCategoryLevel2Name() {
        return categoryLevel2Name;
    }

    public void setCategoryLevel2Name(String categoryLevel2Name) {
        this.categoryLevel2Name = categoryLevel2Name;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }
}
