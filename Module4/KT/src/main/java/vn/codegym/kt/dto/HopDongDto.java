package vn.codegym.kt.dto;

import vn.codegym.kt.model.Hotel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

public class HopDongDto {
    private int idHopDong;
    @NotNull
    private String name;
    @NotNull
    private String idCard;

    private String date;
    private String thoiGianThue;
    private String tongTien;
    private Set<Hotel> hotels;


}
