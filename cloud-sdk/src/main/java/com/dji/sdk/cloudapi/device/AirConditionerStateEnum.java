package com.dji.sdk.cloudapi.device;

import com.dji.sdk.exception.CloudSDKException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

/**
 * @author sean
 * @version 1.7
 * @date 2023/6/30
 */
public enum AirConditionerStateEnum {

    IDLE(0),

    COOL(1),

    HEAT(2),

    DEHUMIDIFICATION(3),

    COOLING_EXIT(4),

    HEATING_EXIT(5),

    DEHUMIDIFICATION_EXIT(6),

    COOLING_PREPARATION(7),

    HEATING_PREPARATION(8),

    DEHUMIDIFICATION_PREPARATION(9),

    AIR_COOLING_PREPARATION(10),

    AIR_COOLING_IN_PROGRESS(11),

    AIR_COOLING_EXIT(12),

    DEFROGGER_PREPARATION(13),

    DEFROGGER_IN_PROGRESS(14),

    DEFROGGER_EXIT(15),

    DISCONNECTED(32767),
    ;

    private final int state;

    AirConditionerStateEnum(int state) {
        this.state = state;
    }

    @JsonValue
    public int getState() {
        return state;
    }

    @JsonCreator
    public static AirConditionerStateEnum find(int state) {
        return Arrays.stream(values()).filter(stateEnum -> stateEnum.state == state).findAny()
            .orElseThrow(() -> new CloudSDKException(AirConditionerStateEnum.class, state));
    }

}
