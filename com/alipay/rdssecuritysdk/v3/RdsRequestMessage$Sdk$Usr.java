package com.alipay.rdssecuritysdk.v3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RdsRequestMessage$Sdk$Usr extends Message {
    public static final String DEFAULT_APPKEY = "";
    public static final String DEFAULT_APPNAME = "";
    public static final String DEFAULT_APPVER = "";
    public static final String DEFAULT_PUBKEY = "";
    public static final String DEFAULT_SDKNAME = "";
    public static final String DEFAULT_SDKVER = "";
    public static final String DEFAULT_USER = "";
    public static final int TAG_APPKEY = 1;
    public static final int TAG_APPNAME = 2;
    public static final int TAG_APPVER = 3;
    public static final int TAG_PUBKEY = 4;
    public static final int TAG_SDKNAME = 5;
    public static final int TAG_SDKVER = 6;
    public static final int TAG_UA = 7;
    public static final int TAG_USER = 8;
    @ProtoField(tag=1, type=Message.Datatype.STRING) public String appkey;
    @ProtoField(tag=2, type=Message.Datatype.STRING) public String appname;
    @ProtoField(tag=3, type=Message.Datatype.STRING) public String appver;
    @ProtoField(tag=4, type=Message.Datatype.STRING) public String pubkey;
    @ProtoField(tag=5, type=Message.Datatype.STRING) public String sdkname;
    @ProtoField(tag=6, type=Message.Datatype.STRING) public String sdkver;
    @ProtoField(tag=7) public RdsRequestMessage$Sdk$Usr$Ua ua;
    @ProtoField(tag=8, type=Message.Datatype.STRING) public String user;

    public RdsRequestMessage$Sdk$Usr() {
        super();
    }

    public RdsRequestMessage$Sdk$Usr(RdsRequestMessage$Sdk$Usr arg2) {
        if(arg2 != null) {
            this.appkey = arg2.appkey;
            this.appname = arg2.appname;
            this.appver = arg2.appver;
            this.pubkey = arg2.pubkey;
            this.sdkname = arg2.sdkname;
            this.sdkver = arg2.sdkver;
            this.ua = arg2.ua;
            this.user = arg2.user;
        }

        if(Boolean.FALSE.booleanValue()) {
         //   ClassVerifier.class.toString();
        }
    }

    public final boolean equals(Object arg5) {
        boolean v0 = true;
        if((((RdsRequestMessage$Sdk$Usr)arg5)) != this) {
            if(!(arg5 instanceof RdsRequestMessage$Sdk$Usr)) {
                return false;
            }

            if((this.equals(this.appkey, ((RdsRequestMessage$Sdk$Usr)arg5).appkey)) && (this.equals(
                    this.appname, ((RdsRequestMessage$Sdk$Usr)arg5).appname)) && (this.equals(this.appver, ((
                    RdsRequestMessage$Sdk$Usr)arg5).appver)) && (this.equals(this.pubkey, ((RdsRequestMessage$Sdk$Usr)
                    arg5).pubkey)) && (this.equals(this.sdkname, ((RdsRequestMessage$Sdk$Usr)arg5).sdkname))
                     && (this.equals(this.sdkver, ((RdsRequestMessage$Sdk$Usr)arg5).sdkver)) && (this
                    .equals(this.ua, ((RdsRequestMessage$Sdk$Usr)arg5).ua)) && (this.equals(this.user, ((
                    RdsRequestMessage$Sdk$Usr)arg5).user))) {
                return v0;
            }

            v0 = false;
        }

        return v0;
    }

    public final RdsRequestMessage$Sdk$Usr fillTagValue(int arg1, Object arg2) {
        switch(arg1) {
            case 1: {
                this.appkey = ((String)arg2);
                break;
            }
            case 2: {
                this.appname = ((String)arg2);
                break;
            }
            case 3: {
                this.appver = ((String)arg2);
                break;
            }
            case 4: {
                this.pubkey = ((String)arg2);
                break;
            }
            case 5: {
                this.sdkname = ((String)arg2);
                break;
            }
            case 6: {
                this.sdkver = ((String)arg2);
                break;
            }
            case 7: {
                this.ua = ((RdsRequestMessage$Sdk$Usr$Ua)arg2);
                break;
            }
            case 8: {
                this.user = ((String)arg2);
                break;
            }
        }

        return this;
    }

    public final int hashCode() {
        int v1 = 0;
        int v0 = this.hashCode;
        if(v0 == 0) {
            v0 = this.appkey != null ? this.appkey.hashCode() : 0;
            int v2 = v0 * 37;
            v0 = this.appname != null ? this.appname.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.appver != null ? this.appver.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.pubkey != null ? this.pubkey.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.sdkname != null ? this.sdkname.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.sdkver != null ? this.sdkver.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.ua != null ? this.ua.hashCode() : 0;
            v0 = (v0 + v2) * 37;
            if(this.user != null) {
                v1 = this.user.hashCode();
            }

            v0 += v1;
            this.hashCode = v0;
        }

        return v0;
    }
}
