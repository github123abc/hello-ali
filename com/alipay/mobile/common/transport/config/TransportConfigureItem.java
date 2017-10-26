package com.alipay.mobile.common.transport.config;

import com.alipay.mobile.common.utils.config.fmk.ConfigureItem;

public enum TransportConfigureItem implements ConfigureItem
{
	
	EXPORT_RES_DATA_LIMIT("EXPORT_RES_DATA_LIMIT", 165, "erdl", "2048");

	private String	b;
	private String	a;

	TransportConfigureItem(String arg1, int arg2, String arg3, String arg4) {
        this.b = arg4;
        this.a = arg3;
    }

    public final String getConfigName() {
        return this.a;
    }

    public final double getDoubleValue() {
        double v0_1;
        try {
            v0_1 = Double.parseDouble(this.b);
        }
        catch(Throwable v0) {
           // LogCatUtil.error("TransportConfigureItem", v0);
            v0_1 = -1;
        }

        return v0_1;
    }

    public final int getIntValue() {
        int v0_1;
        try {
            v0_1 = Integer.parseInt(this.b);
        }
        catch(Exception v0) {
           // LogCatUtil.warn("SpdyConfigItem", ((Throwable)v0));
            v0_1 = -1;
        }

        return v0_1;
    }

    public final long getLongValue() {
        long v0_1;
        try {
            v0_1 = Long.parseLong(this.b);
        }
        catch(Exception v0) {
           // LogCatUtil.warn("SpdyConfigItem", ((Throwable)v0));
            v0_1 = -1;
        }

        return v0_1;
    }

    public final String getStringValue() {
        return this.b;
    }

    public final void setValue(String arg1) {
        this.b = arg1;
    }

}
