package com.alipay.rdssecuritysdk.v3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RdsRequestMessage$Taobao extends Message {
    public static final String DEFAULT_APPKEY = "";
    public static final String DEFAULT_T = "";
    public static final String DEFAULT_VERSION = "";
    public static final String DEFAULT_WUA = "";
    public static final int TAG_APPKEY = 1;
    public static final int TAG_T = 2;
    public static final int TAG_VERSION = 3;
    public static final int TAG_WUA = 4;
    @ProtoField(tag=1, type=Message.Datatype.STRING) public String appKey;
    @ProtoField(tag=2, type=Message.Datatype.STRING) public String t;
    @ProtoField(tag=3, type=Message.Datatype.STRING) public String version;
    @ProtoField(tag=4, type=Message.Datatype.STRING) public String wua;

    public RdsRequestMessage$Taobao() {
        super();
    }

    public RdsRequestMessage$Taobao(RdsRequestMessage$Taobao arg2) {
        if(arg2 != null) {
            this.appKey = arg2.appKey;
            this.t = arg2.t;
            this.version = arg2.version;
            this.wua = arg2.wua;
        }

        if(Boolean.FALSE.booleanValue()) {
          //  ClassVerifier.class.toString();
        }
    }

    public final boolean equals(Object arg5) {
        boolean v0 = true;
        if((((RdsRequestMessage$Taobao)arg5)) != this) {
            if(!(arg5 instanceof RdsRequestMessage$Taobao)) {
                v0 = false;
            }
            else {
                if((this.equals(this.appKey, ((RdsRequestMessage$Taobao)arg5).appKey)) && (this.equals(
                        this.t, ((RdsRequestMessage$Taobao)arg5).t)) && (this.equals(this.version, ((
                        RdsRequestMessage$Taobao)arg5).version)) && (this.equals(this.wua, ((RdsRequestMessage$Taobao)
                        arg5).wua))) {
                    return v0;
                }

                v0 = false;
            }
        }

        return v0;
    }

    public final RdsRequestMessage$Taobao fillTagValue(int arg1, Object arg2) {
        switch(arg1) {
            case 1: {
                this.appKey = ((String)arg2);
                break;
            }
            case 2: {
                this.t = ((String)arg2);
                break;
            }
            case 3: {
                this.version = ((String)arg2);
                break;
            }
            case 4: {
                this.wua = ((String)arg2);
                break;
            }
        }

        return this;
    }

    public final int hashCode() {
        int v1 = 0;
        int v0 = this.hashCode;
        if(v0 == 0) {
            v0 = this.appKey != null ? this.appKey.hashCode() : 0;
            int v2 = v0 * 37;
            v0 = this.t != null ? this.t.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.version != null ? this.version.hashCode() : 0;
            v0 = (v0 + v2) * 37;
            if(this.wua != null) {
                v1 = this.wua.hashCode();
            }

            v0 += v1;
            this.hashCode = v0;
        }

        return v0;
    }
}