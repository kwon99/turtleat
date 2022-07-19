package com.kwon99.turtleat.service;

import org.springframework.stereotype.Component;

@Component
public class RegisterDTO {
    private String placeName, placeDisc; // 장소의 이름과 설명

    // placeName getter
    public String getPlaceName() {
        return placeName;
    }

    // placeName setter
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    // placeDisc getter
    public String getPlaceDisc() {
        return placeDisc;
    }

    // placeDisc setter
    public void setPlaceDisc(String placeDisc) {
        this.placeDisc = placeDisc;
    }
}
