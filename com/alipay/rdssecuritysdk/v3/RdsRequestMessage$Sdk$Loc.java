package com.alipay.rdssecuritysdk.v3;

import java.util.Collections;
import java.util.List;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RdsRequestMessage$Sdk$Loc extends Message {
    public static final String DEFAULT_ACC = "";
    public static Boolean DEFAULT_ACTIVE = null;
    public static final String DEFAULT_BSSID = "";
    public static final String DEFAULT_CARRIER = "";
    public static final String DEFAULT_CID = "";
    public static final String DEFAULT_LA = "";
    public static final String DEFAULT_LAC = "";
    public static final String DEFAULT_LO = "";
    public static final String DEFAULT_MCC = "";
    public static final String DEFAULT_MNC = "";
    public static final String DEFAULT_NETTPYE = "";
    public static List DEFAULT_OMAC = null;
    public static final String DEFAULT_SSID = "";
    public static final String DEFAULT_STRENGTH = "";
    public static Long DEFAULT_T = null;
    public static final int TAG_ACC = 1;
    public static final int TAG_ACTIVE = 2;
    public static final int TAG_BSSID = 3;
    public static final int TAG_CARRIER = 4;
    public static final int TAG_CID = 5;
    public static final int TAG_LA = 6;
    public static final int TAG_LAC = 7;
    public static final int TAG_LO = 8;
    public static final int TAG_MCC = 9;
    public static final int TAG_MNC = 10;
    public static final int TAG_NETTPYE = 11;
    public static final int TAG_OMAC = 12;
    public static final int TAG_SSID = 13;
    public static final int TAG_STRENGTH = 14;
    public static final int TAG_T = 15;
    @ProtoField(tag=1, type=Message.Datatype.STRING) public String acc;
    @ProtoField(tag=2, type=Message.Datatype.BOOL) public Boolean active;
    @ProtoField(tag=3, type=Message.Datatype.STRING) public String bssid;
    @ProtoField(tag=4, type=Message.Datatype.STRING) public String carrier;
    @ProtoField(tag=5, type=Message.Datatype.STRING) public String cid;
    @ProtoField(tag=6, type=Message.Datatype.STRING) public String la;
    @ProtoField(tag=7, type=Message.Datatype.STRING) public String lac;
    @ProtoField(tag=8, type=Message.Datatype.STRING) public String lo;
    @ProtoField(tag=9, type=Message.Datatype.STRING) public String mcc;
    @ProtoField(tag=10, type=Message.Datatype.STRING) public String mnc;
    @ProtoField(tag=11, type=Message.Datatype.STRING) public String nettpye;
    @ProtoField(label=Message.Label.REPEATED, tag=12, type=Message.Datatype.STRING) public List omac;
    @ProtoField(tag=13, type=Message.Datatype.STRING) public String ssid;
    @ProtoField(tag=14, type=Message.Datatype.STRING) public String strength;
    @ProtoField(tag=15, type=Message.Datatype.INT64) public Long t;

    static {
        RdsRequestMessage$Sdk$Loc.DEFAULT_ACTIVE = Boolean.valueOf(false);
        RdsRequestMessage$Sdk$Loc.DEFAULT_OMAC = Collections.emptyList();
        RdsRequestMessage$Sdk$Loc.DEFAULT_T = Long.valueOf(0);
    }

    public RdsRequestMessage$Sdk$Loc() {
        super();
    }

    public RdsRequestMessage$Sdk$Loc(RdsRequestMessage$Sdk$Loc arg2) {
        if(arg2 != null) {
            this.acc = arg2.acc;
            this.active = arg2.active;
            this.bssid = arg2.bssid;
            this.carrier = arg2.carrier;
            this.cid = arg2.cid;
            this.la = arg2.la;
            this.lac = arg2.lac;
            this.lo = arg2.lo;
            this.mcc = arg2.mcc;
            this.mnc = arg2.mnc;
            this.nettpye = arg2.nettpye;
            this.omac = RdsRequestMessage$Sdk$Loc.copyOf(arg2.omac);
            this.ssid = arg2.ssid;
            this.strength = arg2.strength;
            this.t = arg2.t;
        }

        if(Boolean.FALSE.booleanValue()) {
          //  ClassVerifier.class.toString();
        }
    }

    public final boolean equals(Object arg5) {
        boolean v0 = true;
        if((((RdsRequestMessage$Sdk$Loc)arg5)) != this) {
            if(!(arg5 instanceof RdsRequestMessage$Sdk$Loc)) {
                v0 = false;
            }
            else {
                if((this.equals(this.acc, ((RdsRequestMessage$Sdk$Loc)arg5).acc)) && (this.equals(this
                        .active, ((RdsRequestMessage$Sdk$Loc)arg5).active)) && (this.equals(this.bssid, ((
                        RdsRequestMessage$Sdk$Loc)arg5).bssid)) && (this.equals(this.carrier, ((RdsRequestMessage$Sdk$Loc)
                        arg5).carrier)) && (this.equals(this.cid, ((RdsRequestMessage$Sdk$Loc)arg5).
                        cid)) && (this.equals(this.la, ((RdsRequestMessage$Sdk$Loc)arg5).la)) && (this
                        .equals(this.lac, ((RdsRequestMessage$Sdk$Loc)arg5).lac)) && (this.equals(this
                        .lo, ((RdsRequestMessage$Sdk$Loc)arg5).lo)) && (this.equals(this.mcc, ((RdsRequestMessage$Sdk$Loc)
                        arg5).mcc)) && (this.equals(this.mnc, ((RdsRequestMessage$Sdk$Loc)arg5).mnc))
                         && (this.equals(this.nettpye, ((RdsRequestMessage$Sdk$Loc)arg5).nettpye)) && (
                        this.equals(this.omac, ((RdsRequestMessage$Sdk$Loc)arg5).omac)) && (this.equals(
                        this.ssid, ((RdsRequestMessage$Sdk$Loc)arg5).ssid)) && (this.equals(this.strength, ((
                        RdsRequestMessage$Sdk$Loc)arg5).strength)) && (this.equals(this.t, ((RdsRequestMessage$Sdk$Loc)
                        arg5).t))) {
                    return v0;
                }

                v0 = false;
            }
        }

        return v0;
    }

    public final RdsRequestMessage$Sdk$Loc fillTagValue(int arg2, Object arg3) {
        switch(arg2) {
            case 1: {
                this.acc = ((String)arg3);
                break;
            }
            case 2: {
                this.active = ((Boolean)arg3);
                break;
            }
            case 3: {
                this.bssid = ((String)arg3);
                break;
            }
            case 4: {
                this.carrier = ((String)arg3);
                break;
            }
            case 5: {
                this.cid = ((String)arg3);
                break;
            }
            case 6: {
                this.la = ((String)arg3);
                break;
            }
            case 7: {
                this.lac = ((String)arg3);
                break;
            }
            case 8: {
                this.lo = ((String)arg3);
                break;
            }
            case 9: {
                this.mcc = ((String)arg3);
                break;
            }
            case 10: {
                this.mnc = ((String)arg3);
                break;
            }
            case 11: {
                this.nettpye = ((String)arg3);
                break;
            }
            case 12: {
                this.omac = RdsRequestMessage$Sdk$Loc.immutableCopyOf(((List)arg3));
                break;
            }
            case 13: {
                this.ssid = ((String)arg3);
                break;
            }
            case 14: {
                this.strength = ((String)arg3);
                break;
            }
            case 15: {
                this.t = ((Long)arg3);
                break;
            }
        }

        return this;
    }

    public final int hashCode() {
        int v1 = 0;
        int v0 = this.hashCode;
        if(v0 == 0) {
            v0 = this.acc != null ? this.acc.hashCode() : 0;
            int v2 = v0 * 37;
            v0 = this.active != null ? this.active.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.bssid != null ? this.bssid.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.carrier != null ? this.carrier.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.cid != null ? this.cid.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.la != null ? this.la.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.lac != null ? this.lac.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.lo != null ? this.lo.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.mcc != null ? this.mcc.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.mnc != null ? this.mnc.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.nettpye != null ? this.nettpye.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.omac != null ? this.omac.hashCode() : 1;
            v2 = (v0 + v2) * 37;
            v0 = this.ssid != null ? this.ssid.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.strength != null ? this.strength.hashCode() : 0;
            v0 = (v0 + v2) * 37;
            if(this.t != null) {
                v1 = this.t.hashCode();
            }

            v0 += v1;
            this.hashCode = v0;
        }

        return v0;
    }
}

