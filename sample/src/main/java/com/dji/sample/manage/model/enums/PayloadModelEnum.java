package com.dji.sample.manage.model.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sean
 * @version 1.0
 * @date 2022/4/29
 */
public enum PayloadModelEnum {

    Z30("Z30", "20-0"),

    XT2("XT2", "26-0"),

    XTS("XTS", "41-0"),

    H20("H20", "42-0"),

    H20T("H20T", "43-0"),

    P1("P1", "50-65535"),

    M30("M30", "52-0"),

    M30T("M30T", "53-0"),

    H20N("H20N", "61-0"),

    M3E("M3E", "66-0"),

    M3T("M3T","67-0"),

    M3D("M3D","80-0"),

    M3TD("M3TD","81-0"),

    M4E("M4E","88-0"),
  
    M4T("M4T","89-0"),

    M4D("M4D","98-0"),
  
    M4TD("M4TD","99-0"),

    DOCK("DOCK", "165-0"),

    L1("L1", "90742-0");

    private String model;

    private String index;

    PayloadModelEnum(String model, String index) {
        this.model = model;
        this.index = index;
    }

    public String getModel() {
        return model;
    }

    public String getIndex() {
        return index;
    }

    public static List<String> getAllModel() {
        return Arrays.stream(PayloadModelEnum.values()).map(PayloadModelEnum::getModel).collect(Collectors.toList());
    }

    public static List<String> getAllIndex() {
        return Arrays.stream(PayloadModelEnum.values()).map(PayloadModelEnum::getIndex).collect(Collectors.toList());
    }

}
