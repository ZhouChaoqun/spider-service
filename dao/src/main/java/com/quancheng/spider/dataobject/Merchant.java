package com.quancheng.spider.dataobject;

import java.util.Date;

/**
 * 商家信息
 * @author Robert
 */
public class Merchant {
    private String merchantId;

    /**
     * 商家名称
     */
    private String name;

    /**
     * 门头图片
     */
    private String frontImg;

    /**
     * 地址
     */
    private String address;

    /**
     * 人均消费
     */
    private String price;

    /**
     * 总评论数
     */
    private String totalComment;

    /**
     * 评分
     */
    private String score;

    /**
     * 级别(星级)
     */
    private String starLevel;

    /**
     * 分类
     */
    private String category;

    /**
     * 城市
     */
    private String city;

    /**
     * 区域
     */
    private String area;

    /**
     * 商圈
     */
    private String businessCircle;

    /**
     * 数据来源(美团、点评)
     */
    private String dataSource;

    /**
     * 特色菜名
     */
    private String recommendedDishes;

    /**
     * 经度
     */
    private String longitude;
    private String latitude;
    private String telphone;
    private String officeHours;
    private boolean takeawayFlag;
    private boolean bookingFlag;
    private boolean parkingFlag;
    private boolean wifiFlag;
    private String featuredDishes;
    private String environment;

    private Date gmtCreated;

    private Date gmtModified;

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrontImg() {
        return frontImg;
    }

    public void setFrontImg(String frontImg) {
        this.frontImg = frontImg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(String starLevel) {
        this.starLevel = starLevel;
    }

    public String getTotalComment() {
        return totalComment;
    }

    public void setTotalComment(String totalComment) {
        this.totalComment = totalComment;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBusinessCircle() {
        return businessCircle;
    }

    public void setBusinessCircle(String businessCircle) {
        this.businessCircle = businessCircle;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getRecommendedDishes() {
        return recommendedDishes;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getFeaturedDishes() {
        return featuredDishes;
    }

    public void setFeaturedDishes(String featuredDishes) {
        this.featuredDishes = featuredDishes;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setRecommendedDishes(String recommendedDishes) {
        this.recommendedDishes = recommendedDishes;
    }

    public boolean isTakeawayFlag() {
        return takeawayFlag;
    }

    public void setTakeawayFlag(boolean takeawayFlag) {
        this.takeawayFlag = takeawayFlag;
    }

    public boolean isBookingFlag() {
        return bookingFlag;
    }

    public void setBookingFlag(boolean bookingFlag) {
        this.bookingFlag = bookingFlag;
    }

    public boolean isParkingFlag() {
        return parkingFlag;
    }

    public void setParkingFlag(boolean parkingFlag) {
        this.parkingFlag = parkingFlag;
    }

    public boolean isWifiFlag() {
        return wifiFlag;
    }

    public void setWifiFlag(boolean wifiFlag) {
        this.wifiFlag = wifiFlag;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}