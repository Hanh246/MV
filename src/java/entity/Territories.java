/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author nguye
 */
public class Territories {

    private String TerritoryID, TerritoryDescription;
    private int RegionID, TerritoryStatus;

    public Territories() {
    }

    public Territories(String TerritoryID, String TerritoryDescription, int RegionID, int TerritoryStatus) {
        this.TerritoryID = TerritoryID;
        this.TerritoryDescription = TerritoryDescription;
        this.RegionID = RegionID;
        this.TerritoryStatus = TerritoryStatus;
    }

    public String getTerritoryID() {
        return TerritoryID;
    }

    public void setTerritoryID(String TerritoryID) {
        this.TerritoryID = TerritoryID;
    }

    public String getTerritoryDescription() {
        return TerritoryDescription;
    }

    public void setTerritoryDescription(String TerritoryDescription) {
        this.TerritoryDescription = TerritoryDescription;
    }

    public int getRegionID() {
        return RegionID;
    }

    public void setRegionID(int RegionID) {
        this.RegionID = RegionID;
    }

    public int getTerritoryStatus() {
        return TerritoryStatus;
    }

    public void setTerritoryStatus(int TerritoryStatus) {
        this.TerritoryStatus = TerritoryStatus;
    }

    @Override
    public String toString() {
        return "Territories{" + "TerritoryID=" + TerritoryID + ", TerritoryDescription=" + TerritoryDescription + ", RegionID=" + RegionID + ", TerritoryStatus=" + TerritoryStatus + '}';
    }
    

    



}
