package orz.mmp.app.pojo;


import java.util.Date;

public class AdPromotion {

  private Long id;//主键ID
  private Long appId;//appId
  private String adPicPath;//广告图片存储路径
  private Long adPV;//广告点击量
  private Long carouselPosition;//轮播位（1-n）
  private Date startTime;//广告起效时间
  private Date endTime;//广告失效时间
  private Long createdBy;//创建者
  private Date creationDate;//创建时间
  private Long modifyBy;//更新者
  private Date modifyDate;//更新时间


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getAppId() {
    return appId;
  }

  public void setAppId(Long appId) {
    this.appId = appId;
  }


  public String getAdPicPath() {
    return adPicPath;
  }

  public void setAdPicPath(String adPicPath) {
    this.adPicPath = adPicPath;
  }


  public Long getAdPv() {
    return adPV;
  }

  public void setAdPv(Long adPv) {
    this.adPV = adPv;
  }


  public Long getCarouselPosition() {
    return carouselPosition;
  }

  public void setCarouselPosition(Long carouselPosition) {
    this.carouselPosition = carouselPosition;
  }


  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }


  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }


  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }


  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }


  public Long getModifyBy() {
    return modifyBy;
  }

  public void setModifyBy(Long modifyBy) {
    this.modifyBy = modifyBy;
  }


  public Date getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

}
