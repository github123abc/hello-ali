package com.alipay.rdssecuritysdk.v3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RdsRequestMessage$Sdk$Env extends Message {
    public static final String DEFAULT_ASDK = "";
    public static final String DEFAULT_BOARD = "";
    public static final String DEFAULT_BRAND = "";
    public static final String DEFAULT_DEVICE = "";
    public static final String DEFAULT_DISPLAYID = "";
    public static Boolean DEFAULT_EM = null;
    public static final String DEFAULT_INCREMENTAL = "";
    public static final String DEFAULT_KERVER = "";
    public static final String DEFAULT_MANUFACTURER = "";
    public static final String DEFAULT_MODEL = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_OS = "";
    public static final String DEFAULT_OSRELEASE = "";
    public static final String DEFAULT_PF = "";
    public static final String DEFAULT_PM = "";
    public static final String DEFAULT_PN = "";
    public static final String DEFAULT_PROCESSOR = "";
    public static final String DEFAULT_QEMU = "";
    public static Boolean DEFAULT_ROOT = null;
    public static final String DEFAULT_TAGS = "";
    public static final int TAG_ASDK = 1;
    public static final int TAG_BOARD = 2;
    public static final int TAG_BRAND = 3;
    public static final int TAG_DEVICE = 20;
    public static final int TAG_DISPLAYID = 4;
    public static final int TAG_EM = 5;
    public static final int TAG_INCREMENTAL = 6;
    public static final int TAG_KERVER = 7;
    public static final int TAG_MANUFACTURER = 8;
    public static final int TAG_MODEL = 9;
    public static final int TAG_NAME = 10;
    public static final int TAG_OS = 11;
    public static final int TAG_OSRELEASE = 17;
    public static final int TAG_PF = 12;
    public static final int TAG_PM = 13;
    public static final int TAG_PN = 14;
    public static final int TAG_PROCESSOR = 15;
    public static final int TAG_QEMU = 16;
    public static final int TAG_ROOT = 18;
    public static final int TAG_TAGS = 19;
    @ProtoField(tag=1, type=Message.Datatype.STRING) public String asdk;
    @ProtoField(tag=2, type=Message.Datatype.STRING) public String board;
    @ProtoField(tag=3, type=Message.Datatype.STRING) public String brand;
    @ProtoField(tag=20, type=Message.Datatype.STRING) public String device;
    @ProtoField(tag=4, type=Message.Datatype.STRING) public String displayid;
    @ProtoField(tag=5, type=Message.Datatype.BOOL) public Boolean em;
    @ProtoField(tag=6, type=Message.Datatype.STRING) public String incremental;
    @ProtoField(tag=7, type=Message.Datatype.STRING) public String kerver;
    @ProtoField(tag=8, type=Message.Datatype.STRING) public String manufacturer;
    @ProtoField(tag=9, type=Message.Datatype.STRING) public String model;
    @ProtoField(tag=10, type=Message.Datatype.STRING) public String name;
    @ProtoField(tag=11, type=Message.Datatype.STRING) public String os;
    @ProtoField(tag=17, type=Message.Datatype.STRING) public String osRelease;
    @ProtoField(tag=12, type=Message.Datatype.STRING) public String pf;
    @ProtoField(tag=13, type=Message.Datatype.STRING) public String pm;
    @ProtoField(tag=14, type=Message.Datatype.STRING) public String pn;
    @ProtoField(tag=15, type=Message.Datatype.STRING) public String processor;
    @ProtoField(tag=16, type=Message.Datatype.STRING) public String qemu;
    @ProtoField(tag=18, type=Message.Datatype.BOOL) public Boolean root;
    @ProtoField(tag=19, type=Message.Datatype.STRING) public String tags;

    static {
        RdsRequestMessage$Sdk$Env.DEFAULT_EM = Boolean.valueOf(false);
        RdsRequestMessage$Sdk$Env.DEFAULT_ROOT = Boolean.valueOf(false);
    }

    public RdsRequestMessage$Sdk$Env() {
        super();
    }

    public RdsRequestMessage$Sdk$Env(RdsRequestMessage$Sdk$Env arg2) {
        if(arg2 != null) {
            this.asdk = arg2.asdk;
            this.board = arg2.board;
            this.brand = arg2.brand;
            this.displayid = arg2.displayid;
            this.em = arg2.em;
            this.incremental = arg2.incremental;
            this.kerver = arg2.kerver;
            this.manufacturer = arg2.manufacturer;
            this.model = arg2.model;
            this.name = arg2.name;
            this.os = arg2.os;
            this.pf = arg2.pf;
            this.pm = arg2.pm;
            this.pn = arg2.pn;
            this.processor = arg2.processor;
            this.qemu = arg2.qemu;
            this.osRelease = arg2.osRelease;
            this.root = arg2.root;
            this.tags = arg2.tags;
            this.device = arg2.device;
        }

        if(Boolean.FALSE.booleanValue()) {
           // ClassVerifier.class.toString();
        }
    }

    public final boolean equals(Object arg5) {
        boolean v0 = true;
        if((((RdsRequestMessage$Sdk$Env)arg5)) != this) {
            if(!(arg5 instanceof RdsRequestMessage$Sdk$Env)) {
                v0 = false;
            }
            else {
                if((this.equals(this.asdk, ((RdsRequestMessage$Sdk$Env)arg5).asdk)) && (this.equals(
                        this.board, ((RdsRequestMessage$Sdk$Env)arg5).board)) && (this.equals(this.brand, ((
                        RdsRequestMessage$Sdk$Env)arg5).brand)) && (this.equals(this.displayid, ((RdsRequestMessage$Sdk$Env)
                        arg5).displayid)) && (this.equals(this.em, ((RdsRequestMessage$Sdk$Env)arg5)
                        .em)) && (this.equals(this.incremental, ((RdsRequestMessage$Sdk$Env)arg5).incremental))
                         && (this.equals(this.kerver, ((RdsRequestMessage$Sdk$Env)arg5).kerver)) && (
                        this.equals(this.manufacturer, ((RdsRequestMessage$Sdk$Env)arg5).manufacturer))
                         && (this.equals(this.model, ((RdsRequestMessage$Sdk$Env)arg5).model)) && (this
                        .equals(this.name, ((RdsRequestMessage$Sdk$Env)arg5).name)) && (this.equals(
                        this.os, ((RdsRequestMessage$Sdk$Env)arg5).os)) && (this.equals(this.pf, ((RdsRequestMessage$Sdk$Env)
                        arg5).pf)) && (this.equals(this.pm, ((RdsRequestMessage$Sdk$Env)arg5).pm)) && (
                        this.equals(this.pn, ((RdsRequestMessage$Sdk$Env)arg5).pn)) && (this.equals(
                        this.processor, ((RdsRequestMessage$Sdk$Env)arg5).processor)) && (this.equals(
                        this.qemu, ((RdsRequestMessage$Sdk$Env)arg5).qemu)) && (this.equals(this.osRelease, ((
                        RdsRequestMessage$Sdk$Env)arg5).osRelease)) && (this.equals(this.root, ((RdsRequestMessage$Sdk$Env)
                        arg5).root)) && (this.equals(this.tags, ((RdsRequestMessage$Sdk$Env)arg5).tags))
                         && (this.equals(this.device, ((RdsRequestMessage$Sdk$Env)arg5).device))) {
                    return v0;
                }

                v0 = false;
            }
        }

        return v0;
    }

    public final RdsRequestMessage$Sdk$Env fillTagValue(int arg1, Object arg2) {
        switch(arg1) {
            case 1: {
                this.asdk = ((String)arg2);
                break;
            }
            case 2: {
                this.board = ((String)arg2);
                break;
            }
            case 3: {
                this.brand = ((String)arg2);
                break;
            }
            case 4: {
                this.displayid = ((String)arg2);
                break;
            }
            case 5: {
                this.em = ((Boolean)arg2);
                break;
            }
            case 6: {
                this.incremental = ((String)arg2);
                break;
            }
            case 7: {
                this.kerver = ((String)arg2);
                break;
            }
            case 8: {
                this.manufacturer = ((String)arg2);
                break;
            }
            case 9: {
                this.model = ((String)arg2);
                break;
            }
            case 10: {
                this.name = ((String)arg2);
                break;
            }
            case 11: {
                this.os = ((String)arg2);
                break;
            }
            case 12: {
                this.pf = ((String)arg2);
                break;
            }
            case 13: {
                this.pm = ((String)arg2);
                break;
            }
            case 14: {
                this.pn = ((String)arg2);
                break;
            }
            case 15: {
                this.processor = ((String)arg2);
                break;
            }
            case 16: {
                this.qemu = ((String)arg2);
                break;
            }
            case 17: {
                this.osRelease = ((String)arg2);
                break;
            }
            case 18: {
                this.root = ((Boolean)arg2);
                break;
            }
            case 19: {
                this.tags = ((String)arg2);
                break;
            }
            case 20: {
                this.device = ((String)arg2);
                break;
            }
        }

        return this;
    }

    public final int hashCode() {
        int v1 = 0;
        int v0 = this.hashCode;
        if(v0 == 0) {
            v0 = this.asdk != null ? this.asdk.hashCode() : 0;
            int v2 = v0 * 37;
            v0 = this.board != null ? this.board.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.brand != null ? this.brand.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.displayid != null ? this.displayid.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.em != null ? this.em.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.incremental != null ? this.incremental.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.kerver != null ? this.kerver.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.manufacturer != null ? this.manufacturer.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.model != null ? this.model.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.name != null ? this.name.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.os != null ? this.os.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.pf != null ? this.pf.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.pm != null ? this.pm.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.pn != null ? this.pn.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.processor != null ? this.processor.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.qemu != null ? this.qemu.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.osRelease != null ? this.osRelease.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.root != null ? this.root.hashCode() : 0;
            v2 = (v0 + v2) * 37;
            v0 = this.tags != null ? this.tags.hashCode() : 0;
            v0 = (v0 + v2) * 37;
            if(this.device != null) {
                v1 = this.device.hashCode();
            }

            v0 += v1;
            this.hashCode = v0;
        }

        return v0;
    }
}