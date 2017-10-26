package com.alipay.rdssecuritysdk.v3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RdsRequestMessage$Native extends Message {
    public static final int TAG_ENV = 1;
    @ProtoField(tag=1) public RdsRequestMessage$Native$Env env;

    public RdsRequestMessage$Native() {
        super();
    }

    public RdsRequestMessage$Native(RdsRequestMessage$Native arg2) {
        if(arg2 != null) {
            this.env = arg2.env;
        }

        if(Boolean.FALSE.booleanValue()) {
           // ClassVerifier.class.toString();
        }
    }

    public final boolean equals(Object arg3) {
        if((((RdsRequestMessage$Native)arg3)) == this) {
            boolean v0 = true;
            return v0;
        }

        return !(arg3 instanceof RdsRequestMessage$Native) ? false : this.equals(this.env, ((RdsRequestMessage$Native)
                arg3).env);
    }

    public final RdsRequestMessage$Native fillTagValue(int arg1, Object arg2) {
        switch(arg1) {
            case 1: {
            	this.env = ((RdsRequestMessage$Native$Env)arg2);
                return this;
            }
        }

        return this;
        
    }

    public final int hashCode() {
        int v0 = this.hashCode;
        if(v0 == 0) {
            v0 = this.env != null ? this.env.hashCode() : 0;
            this.hashCode = v0;
        }

        return v0;
    }
}