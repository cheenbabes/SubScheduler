/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cheenbabes.googlegeocoder;

import com.google.code.geocoder.model.GeocodeResponse;

/**
 *
 * @author ebaibourine
 */
public class BookScore {
    private int rank;
    private String temple;
    private String zone;
    private double totalPoints;
    private int months;
    private double percentChange;
    private long mahaBigBooks;
    private long bigBooks;
    private long mediumBooks;
    private long smallBooks;
    private long Mags;
    private long btgSubs;
    private long sets;
    private String longitude;
    private String latitude;
    private boolean betterThanLastYear;
    private GeocodeResponse response;

    /**
     * @return the rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * @return the temple
     */
    public String getTemple() {
        return temple;
    }

    /**
     * @param temple the temple to set
     */
    public void setTemple(String temple) {
        this.temple = temple;
    }

    /**
     * @return the zone
     */
    public String getZone() {
        return zone;
    }

    /**
     * @param zone the zone to set
     */
    public void setZone(String zone) {
        this.zone = zone;
    }

    /**
     * @return the totalPoints
     */
    public double getTotalPoints() {
        return totalPoints;
    }

    /**
     * @param totalPoints the totalPoints to set
     */
    public void setTotalPoints(double totalPoints) {
        this.totalPoints = totalPoints;
    }

    /**
     * @return the months
     */
    public int getMonths() {
        return months;
    }

    /**
     * @param months the months to set
     */
    public void setMonths(int months) {
        this.months = months;
    }

    /**
     * @return the percentChange
     */
    public double getPercentChange() {
        return percentChange;
    }

    /**
     * @param percentChange the percentChange to set
     */
    public void setPercentChange(double percentChange) {
        this.percentChange = percentChange;
    }

    /**
     * @return the mahaBigBooks
     */
    public long getMahaBigBooks() {
        return mahaBigBooks;
    }

    /**
     * @param mahaBigBooks the mahaBigBooks to set
     */
    public void setMahaBigBooks(long mahaBigBooks) {
        this.mahaBigBooks = mahaBigBooks;
    }

    /**
     * @return the bigBooks
     */
    public long getBigBooks() {
        return bigBooks;
    }

    /**
     * @param bigBooks the bigBooks to set
     */
    public void setBigBooks(long bigBooks) {
        this.bigBooks = bigBooks;
    }

    /**
     * @return the mediumBooks
     */
    public long getMediumBooks() {
        return mediumBooks;
    }

    /**
     * @param mediumBooks the mediumBooks to set
     */
    public void setMediumBooks(long mediumBooks) {
        this.mediumBooks = mediumBooks;
    }

    /**
     * @return the smallBooks
     */
    public long getSmallBooks() {
        return smallBooks;
    }

    /**
     * @param smallBooks the smallBooks to set
     */
    public void setSmallBooks(long smallBooks) {
        this.smallBooks = smallBooks;
    }

    /**
     * @return the Mags
     */
    public long getMags() {
        return Mags;
    }

    /**
     * @param Mags the Mags to set
     */
    public void setMags(long Mags) {
        this.Mags = Mags;
    }

    /**
     * @return the btgSubs
     */
    public long getBtgSubs() {
        return btgSubs;
    }

    /**
     * @param btgSubs the btgSubs to set
     */
    public void setBtgSubs(long btgSubs) {
        this.btgSubs = btgSubs;
    }

    /**
     * @return the sets
     */
    public long getSets() {
        return sets;
    }

    /**
     * @param sets the sets to set
     */
    public void setSets(long sets) {
        this.sets = sets;
    }

    /**
     * @return the longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the betterThanLastYear
     */
    public boolean isBetterThanLastYear() {
        return betterThanLastYear;
    }

    /**
     * @param betterThanLastYear the betterThanLastYear to set
     */
    public void setBetterThanLastYear(boolean betterThanLastYear) {
        this.betterThanLastYear = betterThanLastYear;
    }

    /**
     * @return the response
     */
    public GeocodeResponse getResponse() {
        return response;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(GeocodeResponse response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "BookScore{" + "rank=" + rank + ", temple=" + temple + ", zone=" + zone + ", totalPoints=" + totalPoints + ", months=" + months + ", percentChange=" + percentChange + ", mahaBigBooks=" + mahaBigBooks + ", bigBooks=" + bigBooks + ", mediumBooks=" + mediumBooks + ", smallBooks=" + smallBooks + ", Mags=" + Mags + ", btgSubs=" + btgSubs + ", sets=" + sets + ", longitude=" + longitude + ", latitude=" + latitude + ", betterThanLastYear=" + betterThanLastYear + ", response=" + response + '}';
    }
    
    
}
