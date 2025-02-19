package com.example.musicapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Playlist implements Serializable {
    @SerializedName("IDPlaylist")
    @Expose
    private String iDPlaylist;
    @SerializedName("TenPlaylist")
    @Expose
    private String tenPlaylist;
    @SerializedName("HinhNen")
    @Expose
    private String hinhNen;
    @SerializedName("Icon")
    @Expose
    private String icon;

    public String getIDPlaylist() {
        return iDPlaylist;
    }

    public void setIDPlaylist(String iDPlaylist) {
        this.iDPlaylist = iDPlaylist;
    }

    public String getTenPlaylist() {
        return tenPlaylist;
    }

    public void setTenPlaylist(String tenPlaylist) {
        this.tenPlaylist = tenPlaylist;
    }

    public String getHinhNen() {
        return hinhNen;
    }

    public void setHinhNen(String hinhNen) {
        this.hinhNen = hinhNen;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
