package com.alipay.rdssecuritysdk.v3;

import java.util.Collections;
import java.util.List;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RdsRequestMessage$Sdk$Dev$Sensor$Data extends Message {
    @ProtoField(label=Message.Label.REPEATED, tag=1, type=Message.Datatype.STRING) public List Accelerometer;
    public static List DEFAULT_ACCELEROMETER = null;
    public static List DEFAULT_GRAVITY = null;
    public static List DEFAULT_GYROSCOPE = null;
    public static List DEFAULT_MAGNETOMETER = null;
    @ProtoField(label=Message.Label.REPEATED, tag=2, type=Message.Datatype.STRING) public List Gravity;
    @ProtoField(label=Message.Label.REPEATED, tag=3, type=Message.Datatype.STRING) public List Gyroscope;
    @ProtoField(label=Message.Label.REPEATED, tag=4, type=Message.Datatype.STRING) public List Magnetometer;
    public static final int TAG_ACCELEROMETER = 1;
    public static final int TAG_GRAVITY = 2;
    public static final int TAG_GYROSCOPE = 3;
    public static final int TAG_MAGNETOMETER = 4;

    static {
        RdsRequestMessage$Sdk$Dev$Sensor$Data.DEFAULT_ACCELEROMETER = Collections.emptyList();
        RdsRequestMessage$Sdk$Dev$Sensor$Data.DEFAULT_GRAVITY = Collections.emptyList();
        RdsRequestMessage$Sdk$Dev$Sensor$Data.DEFAULT_GYROSCOPE = Collections.emptyList();
        RdsRequestMessage$Sdk$Dev$Sensor$Data.DEFAULT_MAGNETOMETER = Collections.emptyList();
    }

    public RdsRequestMessage$Sdk$Dev$Sensor$Data() {
        super();
    }

    public RdsRequestMessage$Sdk$Dev$Sensor$Data(RdsRequestMessage$Sdk$Dev$Sensor$Data arg2) {
        if(arg2 != null) {
            this.Accelerometer = RdsRequestMessage$Sdk$Dev$Sensor$Data.copyOf(arg2.Accelerometer);
            this.Gravity = RdsRequestMessage$Sdk$Dev$Sensor$Data.copyOf(arg2.Gravity);
            this.Gyroscope = RdsRequestMessage$Sdk$Dev$Sensor$Data.copyOf(arg2.Gyroscope);
            this.Magnetometer = RdsRequestMessage$Sdk$Dev$Sensor$Data.copyOf(arg2.Magnetometer);
        }

        if(Boolean.FALSE.booleanValue()) {
          //  ClassVerifier.class.toString();
        }
    }

    public final boolean equals(Object arg5) {
        boolean v0 = true;
        if((((RdsRequestMessage$Sdk$Dev$Sensor$Data)arg5)) != this) {
            if(!(arg5 instanceof RdsRequestMessage$Sdk$Dev$Sensor$Data)) {
                v0 = false;
            }
            else {
                if((this.equals(this.Accelerometer, ((RdsRequestMessage$Sdk$Dev$Sensor$Data)arg5).Accelerometer))
                         && (this.equals(this.Gravity, ((RdsRequestMessage$Sdk$Dev$Sensor$Data)arg5)
                        .Gravity)) && (this.equals(this.Gyroscope, ((RdsRequestMessage$Sdk$Dev$Sensor$Data)
                        arg5).Gyroscope)) && (this.equals(this.Magnetometer, ((RdsRequestMessage$Sdk$Dev$Sensor$Data)
                        arg5).Magnetometer))) {
                    return v0;
                }

                v0 = false;
            }
        }

        return v0;
    }

    public final RdsRequestMessage$Sdk$Dev$Sensor$Data fillTagValue(int arg2, Object arg3) {
        switch(arg2) {
            case 1: {
                this.Accelerometer = RdsRequestMessage$Sdk$Dev$Sensor$Data.immutableCopyOf(((List)arg3));
                break;
            }
            case 2: {
                this.Gravity = RdsRequestMessage$Sdk$Dev$Sensor$Data.immutableCopyOf(((List)arg3));
                break;
            }
            case 3: {
                this.Gyroscope = RdsRequestMessage$Sdk$Dev$Sensor$Data.immutableCopyOf(((List)arg3));
                break;
            }
            case 4: {
                this.Magnetometer = RdsRequestMessage$Sdk$Dev$Sensor$Data.immutableCopyOf(((List)arg3));
                break;
            }
        }

        return this;
    }

    public final int hashCode() {
        int v1 = 1;
        int v0 = this.hashCode;
        if(v0 == 0) {
            v0 = this.Accelerometer != null ? this.Accelerometer.hashCode() : 1;
            int v2 = v0 * 37;
            v0 = this.Gravity != null ? this.Gravity.hashCode() : 1;
            v2 = (v0 + v2) * 37;
            v0 = this.Gyroscope != null ? this.Gyroscope.hashCode() : 1;
            v0 = (v0 + v2) * 37;
            if(this.Magnetometer != null) {
                v1 = this.Magnetometer.hashCode();
            }

            v0 += v1;
            this.hashCode = v0;
        }

        return v0;
    }
}
