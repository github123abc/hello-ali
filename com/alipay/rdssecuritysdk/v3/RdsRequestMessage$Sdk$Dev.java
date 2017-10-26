package com.alipay.rdssecuritysdk.v3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RdsRequestMessage$Sdk$Dev extends Message {
    public static final String DEFAULT_APDID = "";
    public static final String DEFAULT_GSS = "";
    public static final String DEFAULT_GSS2 = "";
    public static final String DEFAULT_H = "";
    public static final String DEFAULT_IDFA = "";
    public static final String DEFAULT_IMEI = "";
    public static final String DEFAULT_IMSI = "";
    public static final String DEFAULT_MAC = "";
    public static final String DEFAULT_PX = "";
    public static final String DEFAULT_TID = "";
    public static final String DEFAULT_UMID = "";
    public static final String DEFAULT_USB = "";
    public static final String DEFAULT_UTDID = "";
    public static final String DEFAULT_W = "";
    public static final String DEFAULT_WI = "";
    public static final int TAG_APDID = 1;
    public static final int TAG_GSS = 2;
    public static final int TAG_GSS2 = 3;
    public static final int TAG_H = 4;
    public static final int TAG_IDFA = 5;
    public static final int TAG_IMEI = 6;
    public static final int TAG_IMSI = 7;
    public static final int TAG_MAC = 8;
    public static final int TAG_PX = 9;
    public static final int TAG_SENSOR = 10;
    public static final int TAG_TID = 11;
    public static final int TAG_UMID = 12;
    public static final int TAG_USB = 13;
    public static final int TAG_UTDID = 14;
    public static final int TAG_W = 15;
    public static final int TAG_WI = 16;
    @ProtoField(tag=1, type=Message.Datatype.STRING) public String apdid;
    @ProtoField(tag=2, type=Message.Datatype.STRING) public String gss;
    @ProtoField(tag=3, type=Message.Datatype.STRING) public String gss2;
    @ProtoField(tag=4, type=Message.Datatype.STRING) public String h;
    @ProtoField(tag=5, type=Message.Datatype.STRING) public String idfa;
    @ProtoField(tag=6, type=Message.Datatype.STRING) public String imei;
    @ProtoField(tag=7, type=Message.Datatype.STRING) public String imsi;
    @ProtoField(tag=8, type=Message.Datatype.STRING) public String mac;
    @ProtoField(tag=9, type=Message.Datatype.STRING) public String px;
    @ProtoField(tag=10) public RdsRequestMessage$Sdk$Dev$Sensor sensor;
    @ProtoField(tag=11, type=Message.Datatype.STRING) public String tid;
    @ProtoField(tag=12, type=Message.Datatype.STRING) public String umid;
    @ProtoField(tag=13, type=Message.Datatype.STRING) public String usb;
    @ProtoField(tag=14, type=Message.Datatype.STRING) public String utdid;
    @ProtoField(tag=15, type=Message.Datatype.STRING) public String w;
    @ProtoField(tag=16, type=Message.Datatype.STRING) public String wi;

    public RdsRequestMessage$Sdk$Dev() {
        super();
    }

    public RdsRequestMessage$Sdk$Dev(RdsRequestMessage$Sdk$Dev arg2) {
        if(arg2 != null) {
            this.apdid = arg2.apdid;
            this.gss = arg2.gss;
            this.gss2 = arg2.gss2;
            this.h = arg2.h;
            this.idfa = arg2.idfa;
            this.imei = arg2.imei;
            this.imsi = arg2.imsi;
            this.mac = arg2.mac;
            this.px = arg2.px;
            this.sensor = arg2.sensor;
            this.tid = arg2.tid;
            this.umid = arg2.umid;
            this.usb = arg2.usb;
            this.utdid = arg2.utdid;
            this.w = arg2.w;
            this.wi = arg2.wi;
        }

        if(Boolean.FALSE.booleanValue()) {
           // ClassVerifier.class.toString();
        }
    }

    public final boolean equals(Object arg5) {
        boolean v0 = true;
        if((((RdsRequestMessage$Sdk$Dev)arg5)) != this) {
            if(!(arg5 instanceof RdsRequestMessage$Sdk$Dev)) {
                v0 = false;
            }
            else {
                if((this.equals(this.apdid, ((RdsRequestMessage$Sdk$Dev)arg5).apdid)) && (this.equals(
                        this.gss, ((RdsRequestMessage$Sdk$Dev)arg5).gss)) && (this.equals(this.gss2, ((
                        RdsRequestMessage$Sdk$Dev)arg5).gss2)) && (this.equals(this.h, ((RdsRequestMessage$Sdk$Dev)
                        arg5).h)) && (this.equals(this.idfa, ((RdsRequestMessage$Sdk$Dev)arg5).idfa))
                         && (this.equals(this.imei, ((RdsRequestMessage$Sdk$Dev)arg5).imei)) && (this
                        .equals(this.imsi, ((RdsRequestMessage$Sdk$Dev)arg5).imsi)) && (this.equals(
                        this.mac, ((RdsRequestMessage$Sdk$Dev)arg5).mac)) && (this.equals(this.px, ((
                        RdsRequestMessage$Sdk$Dev)arg5).px)) && (this.equals(this.sensor, ((RdsRequestMessage$Sdk$Dev)
                        arg5).sensor)) && (this.equals(this.tid, ((RdsRequestMessage$Sdk$Dev)arg5).tid))
                         && (this.equals(this.umid, ((RdsRequestMessage$Sdk$Dev)arg5).umid)) && (this
                        .equals(this.usb, ((RdsRequestMessage$Sdk$Dev)arg5).usb)) && (this.equals(this
                        .utdid, ((RdsRequestMessage$Sdk$Dev)arg5).utdid)) && (this.equals(this.w, ((
                        RdsRequestMessage$Sdk$Dev)arg5).w)) && (this.equals(this.wi, ((RdsRequestMessage$Sdk$Dev)
                        arg5).wi))) {
                    return v0;
                }

                v0 = false;
            }
        }

        return v0;
    }

    public final RdsRequestMessage$Sdk$Dev fillTagValue(int arg1, Object arg2) {
        switch(arg1) {
            case 1: {
                this.apdid = ((String)arg2);
                break;
            }
            case 2: {
                this.gss = ((String)arg2);
                break;
            }
            case 3: {
                this.gss2 = ((String)arg2);
                break;
            }
            case 4: {
                this.h = ((String)arg2);
                break;
            }
            case 5: {
                this.idfa = ((String)arg2);
                break;
            }
            case 6: {
                this.imei = ((String)arg2);
                break;
            }
            case 7: {
                this.imsi = ((String)arg2);
                break;
            }
            case 8: {
                this.mac = ((String)arg2);
                break;
            }
            case 9: {
                this.px = ((String)arg2);
                break;
            }
            case 10: {
                this.sensor = ((RdsRequestMessage$Sdk$Dev$Sensor)arg2);
                break;
            }
            case 11: {
                this.tid = ((String)arg2);
                break;
            }
            case 12: {
                this.umid = ((String)arg2);
                break;
            }
            case 13: {
                this.usb = ((String)arg2);
                break;
            }
            case 14: {
                this.utdid = ((String)arg2);
                break;
            }
            case 15: {
                this.w = ((String)arg2);
                break;
            }
            case 16: {
                this.wi = ((String)arg2);
                break;
            }
        }

        return this;
    }

    public final int hashCode() {
        int v1 = 0;
        int v0 = this.hashCode;
        if(v0 == 0) {
            v0 = this.apdid != null ? this.apdid.hashCode() : 0;
            int v2 = v0 * 37;
            v0 = this.gss != null ? this.gss.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.gss2 != null ? this.gss2.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.h != null ? this.h.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.idfa != null ? this.idfa.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.imei != null ? this.imei.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.imsi != null ? this.imsi.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.mac != null ? this.mac.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.px != null ? this.px.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.sensor != null ? this.sensor.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.tid != null ? this.tid.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.umid != null ? this.umid.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.usb != null ? this.usb.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.utdid != null ? this.utdid.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.w != null ? this.w.hashCode() : 0;
            v0 = (v0 + v2) * 37;
            if(this.wi != null) {
                v1 = this.wi.hashCode();
            }

            v0 += v1;
            this.hashCode = v0;
        }

        return v0;
    }
}

