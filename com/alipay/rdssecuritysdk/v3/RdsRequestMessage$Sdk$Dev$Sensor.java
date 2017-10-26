package com.alipay.rdssecuritysdk.v3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RdsRequestMessage$Sdk$Dev$Sensor extends Message {
    public static Long DEFAULT_T = null;
    public static final int TAG_DATA = 1;
    public static final int TAG_T = 2;
    @ProtoField(tag=1) public RdsRequestMessage$Sdk$Dev$Sensor$Data data;
    @ProtoField(tag=2, type=Message.Datatype.INT64) public Long t;

    static {
        RdsRequestMessage$Sdk$Dev$Sensor.DEFAULT_T = Long.valueOf(0);
    }

    public RdsRequestMessage$Sdk$Dev$Sensor() {
        super();
    }

    public RdsRequestMessage$Sdk$Dev$Sensor(RdsRequestMessage$Sdk$Dev$Sensor arg2) {
        if(arg2 != null) {
            this.data = arg2.data;
            this.t = arg2.t;
        }

        if(Boolean.FALSE.booleanValue()) {
           // ClassVerifier.class.toString();
        }
    }

    public final boolean equals(Object arg5) {
        boolean v0 = true;
        if((((RdsRequestMessage$Sdk$Dev$Sensor)arg5)) != this) {
            if(!(arg5 instanceof RdsRequestMessage$Sdk$Dev$Sensor)) {
                v0 = false;
            }
            else {
                if((this.equals(this.data, ((RdsRequestMessage$Sdk$Dev$Sensor)arg5).data)) && (this.
                        equals(this.t, ((RdsRequestMessage$Sdk$Dev$Sensor)arg5).t))) {
                    return v0;
                }

                v0 = false;
            }
        }

        return v0;
    }

    public final RdsRequestMessage$Sdk$Dev$Sensor fillTagValue(int arg1, Object arg2) {
        switch(arg1) {
            case 1: {
                this.data = ((RdsRequestMessage$Sdk$Dev$Sensor$Data)arg2);
                break;
            }
            case 2: {
                this.t = ((Long)arg2);
                break;
            }
        }

        return this;
    }

    public final int hashCode() {
        int v1 = 0;
        int v0 = this.hashCode;
        if(v0 == 0) {
            v0 = this.data != null ? this.data.hashCode() : 0;
            v0 *= 37;
            if(this.t != null) {
                v1 = this.t.hashCode();
            }

            v0 += v1;
            this.hashCode = v0;
        }

        return v0;
    }
}

