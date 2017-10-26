package com.alipay.rdssecuritysdk.v3;

import java.util.Collections;
import java.util.List;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RdsRequestMessage$Sdk$Usr$Ua extends Message {
    public static List DEFAULT_ACTION = null;
    public static final String DEFAULT_NUM = "";
    public static final String DEFAULT_T = "";
    public static final int TAG_ACTION = 1;
    public static final int TAG_NUM = 2;
    public static final int TAG_T = 3;
    @ProtoField(label=Message.Label.REPEATED, tag=1) public List action;
    @ProtoField(tag=2, type=Message.Datatype.STRING) public String num;
    @ProtoField(tag=3, type=Message.Datatype.STRING) public String t;

    static {
        RdsRequestMessage$Sdk$Usr$Ua.DEFAULT_ACTION = Collections.emptyList();
    }

    public RdsRequestMessage$Sdk$Usr$Ua() {
        super();
    }

    public RdsRequestMessage$Sdk$Usr$Ua(RdsRequestMessage$Sdk$Usr$Ua arg2) {
        if(arg2 != null) {
            this.action = RdsRequestMessage$Sdk$Usr$Ua.copyOf(arg2.action);
            this.num = arg2.num;
            this.t = arg2.t;
        }

        if(Boolean.FALSE.booleanValue()) {
          //  ClassVerifier.class.toString();
        }
    }

    public final boolean equals(Object arg5) {
        boolean v0 = true;
        if((((RdsRequestMessage$Sdk$Usr$Ua)arg5)) != this) {
            if(!(arg5 instanceof RdsRequestMessage$Sdk$Usr$Ua)) {
                v0 = false;
            }
            else {
                if((this.equals(this.action, ((RdsRequestMessage$Sdk$Usr$Ua)arg5).action)) && (this.
                        equals(this.num, ((RdsRequestMessage$Sdk$Usr$Ua)arg5).num)) && (this.equals(
                        this.t, ((RdsRequestMessage$Sdk$Usr$Ua)arg5).t))) {
                    return v0;
                }

                v0 = false;
            }
        }

        return v0;
    }

    public final RdsRequestMessage$Sdk$Usr$Ua fillTagValue(int arg2, Object arg3) {
        switch(arg2) {
            case 1: {
                this.action = RdsRequestMessage$Sdk$Usr$Ua.immutableCopyOf(((List)arg3));
                break;
            }
            case 2: {
                this.num = ((String)arg3);
                break;
            }
            case 3: {
                this.t = ((String)arg3);
                break;
            }
        }

        return this;
    }

    public final int hashCode() {
        int v1 = 0;
        int v0 = this.hashCode;
        if(v0 == 0) {
            v0 = this.action != null ? this.action.hashCode() : 1;
            int v2 = v0 * 37;
            v0 = this.num != null ? this.num.hashCode() : 0;
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

