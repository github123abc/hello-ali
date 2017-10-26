package com.alipay.rdssecuritysdk.v3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RdsRequestMessage$Sdk extends Message {
    public static final int TAG_DEV = 1;
    public static final int TAG_ENV = 2;
    public static final int TAG_LOC = 3;
    public static final int TAG_USR = 4;
    @ProtoField(tag=1) public RdsRequestMessage$Sdk$Dev dev;
    @ProtoField(tag=2) public RdsRequestMessage$Sdk$Env env;
    @ProtoField(tag=3) public RdsRequestMessage$Sdk$Loc loc;
    @ProtoField(tag=4) public RdsRequestMessage$Sdk$Usr usr;

    public RdsRequestMessage$Sdk() {
        super();
    }

    public RdsRequestMessage$Sdk(RdsRequestMessage$Sdk arg2) {
        if(arg2 != null) {
            this.dev = arg2.dev;
            this.env = arg2.env;
            this.loc = arg2.loc;
            this.usr = arg2.usr;
        }

        if(Boolean.FALSE.booleanValue()) {
            //ClassVerifier.class.toString();
        }
    }

    public final boolean equals(Object arg5) {
        boolean v0 = true;
        if((((RdsRequestMessage$Sdk)arg5)) != this) {
            if(!(arg5 instanceof RdsRequestMessage$Sdk)) {
                v0 = false;
            }
            else {
                if((this.equals(this.dev, ((RdsRequestMessage$Sdk)arg5).dev)) && (this.equals(this.env, ((
                        RdsRequestMessage$Sdk)arg5).env)) && (this.equals(this.loc, ((RdsRequestMessage$Sdk)
                        arg5).loc)) && (this.equals(this.usr, ((RdsRequestMessage$Sdk)arg5).usr))) {
                    return v0;
                }

                v0 = false;
            }
        }

        return v0;
    }

    public final RdsRequestMessage$Sdk fillTagValue(int arg1, Object arg2) {
        switch(arg1) {
            case 1: {
                this.dev = ((RdsRequestMessage$Sdk$Dev)arg2);
                break;
            }
            case 2: {
                this.env = ((RdsRequestMessage$Sdk$Env)arg2);
                break;
            }
            case 3: {
                this.loc = ((RdsRequestMessage$Sdk$Loc)arg2);
                break;
            }
            case 4: {
                this.usr = ((RdsRequestMessage$Sdk$Usr)arg2);
                break;
            }
        }

        return this;
    }

    public final int hashCode() {
        int v1 = 0;
        int v0 = this.hashCode;
        if(v0 == 0) {
            v0 = this.dev != null ? this.dev.hashCode() : 0;
            int v2 = v0 * 37;
            v0 = this.env != null ? this.env.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.loc != null ? this.loc.hashCode() : 0;
            v0 = (v0 + v2) * 37;
            if(this.usr != null) {
                v1 = this.usr.hashCode();
            }

            v0 += v1;
            this.hashCode = v0;
        }

        return v0;
    }
}
