package com.alipay.mobileapp.biz.rpc.unifylogin.vo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ExternParams extends Message {
    public static final String DEFAULT_KEY = "";
    public static final String DEFAULT_VALUE = "";
    public static final int TAG_KEY = 1;
    public static final int TAG_VALUE = 2;
    @ProtoField(tag=1, type=Message.Datatype.STRING) public String key;
    @ProtoField(tag=2, type=Message.Datatype.STRING) public String value;

    public ExternParams() {
        super();
    }

    public ExternParams(String key,String value)
    {
    	this.key = key;
        this.value = value;
    }
    public ExternParams(ExternParams arg2) {
        if(arg2 != null) {
            this.key = arg2.key;
            this.value = arg2.value;
        }
    }

    public final boolean equals(Object arg5) {
        boolean v0 = true;
        if((((ExternParams)arg5)) != this) {
            if(!(arg5 instanceof ExternParams)) {
                v0 = false;
            }
            else {
                if((this.equals(this.key, ((ExternParams)arg5).key)) && (this.equals(this.value, ((ExternParams)
                        arg5).value))) {
                    return v0;
                }

                v0 = false;
            }
        }

        return v0;
    }

    public final ExternParams fillTagValue(int arg1, Object arg2) {
        switch(arg1) {
            case 1: {
                this.key = ((String)arg2);
                break;
            }
            case 2: {
                this.value = ((String)arg2);
                break;
            }
        }

        return this;
    }

    public final int hashCode() {
        int v1 = 0;
        int v0 = this.hashCode;
        if(v0 == 0) {
            v0 = this.key != null ? this.key.hashCode() : 0;
            v0 *= 37;
            if(this.value != null) {
                v1 = this.value.hashCode();
            }

            v0 += v1;
            this.hashCode = v0;
        }

        return v0;
    }
}
