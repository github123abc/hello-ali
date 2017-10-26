package com.alipay.rdssecuritysdk.v3;

import java.awt.TrayIcon.MessageType;
import java.util.Collections;
import java.util.List;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RdsRequestMessage$Native$Env extends Message {
    public static final String DEFAULT_BINARYHASH = "";
    public static Boolean DEFAULT_EM = null;
    public static Boolean DEFAULT_INS = null;
    public static Boolean DEFAULT_INSEX = null;
    public static List DEFAULT_MAL = null;
    public static Boolean DEFAULT_REP = null;
    public static List DEFAULT_REPIE = null;
    public static final String DEFAULT_REPIEHASH = "";
    public static Boolean DEFAULT_ROOT = null;
    public static final String DEFAULT_SAFE = "";
    public static final String DEFAULT_SIGN = "";
    public static final String DEFAULT_SIGNHASH = "";
    public static final int TAG_BINARYHASH = 7;
    public static final int TAG_EM = 1;
    public static final int TAG_INS = 2;
    public static final int TAG_INSEX = 3;
    public static final int TAG_MAL = 4;
    public static final int TAG_REP = 5;
    public static final int TAG_REPIE = 12;
    public static final int TAG_REPIEHASH = 8;
    public static final int TAG_ROOT = 6;
    public static final int TAG_SAFE = 9;
    public static final int TAG_SIGN = 10;
    public static final int TAG_SIGNHASH = 11;
    @ProtoField(tag=7, type=Message.Datatype.STRING) public String binaryhash;
    @ProtoField(tag=1, type=Message.Datatype.BOOL) public Boolean em;
    @ProtoField(tag=2, type=Message.Datatype.BOOL) public Boolean ins;
    @ProtoField(tag=3, type=Message.Datatype.BOOL) public Boolean insEx;
    @ProtoField(label=Message.Label.REPEATED, tag=4, type=Message.Datatype.STRING) public List mal;
    @ProtoField(tag=5, type=Message.Datatype.BOOL) public Boolean rep;
    @ProtoField(label=Message.Label.REPEATED, tag=12, type=Message.Datatype.STRING) public List repie;
    @ProtoField(tag=8, type=Message.Datatype.STRING) public String repiehash;
    @ProtoField(tag=6, type=Message.Datatype.BOOL) public Boolean root;
    @ProtoField(tag=9, type=Message.Datatype.STRING) public String safe;
    @ProtoField(tag=10, type=Message.Datatype.STRING) public String sign;
    @ProtoField(tag=11, type=Message.Datatype.STRING) public String signhash;

    static {
        RdsRequestMessage$Native$Env.DEFAULT_EM = Boolean.valueOf(false);
        RdsRequestMessage$Native$Env.DEFAULT_INS = Boolean.valueOf(false);
        RdsRequestMessage$Native$Env.DEFAULT_INSEX = Boolean.valueOf(false);
        RdsRequestMessage$Native$Env.DEFAULT_MAL = Collections.emptyList();
        RdsRequestMessage$Native$Env.DEFAULT_REP = Boolean.valueOf(false);
        RdsRequestMessage$Native$Env.DEFAULT_ROOT = Boolean.valueOf(false);
        RdsRequestMessage$Native$Env.DEFAULT_REPIE = Collections.emptyList();
    }

    public RdsRequestMessage$Native$Env() {
        super();
    }

    public RdsRequestMessage$Native$Env(RdsRequestMessage$Native$Env arg2) {
        if(arg2 != null) {
            this.em = arg2.em;
            this.ins = arg2.ins;
            this.insEx = arg2.insEx;
            this.mal = RdsRequestMessage$Native$Env.copyOf(arg2.mal);
            this.rep = arg2.rep;
            this.root = arg2.root;
            this.binaryhash = arg2.binaryhash;
            this.repiehash = arg2.repiehash;
            this.safe = arg2.safe;
            this.sign = arg2.sign;
            this.signhash = arg2.signhash;
            this.repie = RdsRequestMessage$Native$Env.copyOf(arg2.repie);
        }

        if(Boolean.FALSE.booleanValue()) {
           // ClassVerifier.class.toString();
        }
    }

    public final boolean equals(Object arg5) {
        boolean v0 = true;
        if((((RdsRequestMessage$Native$Env)arg5)) != this) {
            if(!(arg5 instanceof RdsRequestMessage$Native$Env)) {
                v0 = false;
            }
            else {
                if((this.equals(this.em, ((RdsRequestMessage$Native$Env)arg5).em)) && (this.equals(this
                        .ins, ((RdsRequestMessage$Native$Env)arg5).ins)) && (this.equals(this.insEx, ((
                        RdsRequestMessage$Native$Env)arg5).insEx)) && (this.equals(this.mal, ((RdsRequestMessage$Native$Env)
                        arg5).mal)) && (this.equals(this.rep, ((RdsRequestMessage$Native$Env)arg5).rep))
                         && (this.equals(this.root, ((RdsRequestMessage$Native$Env)arg5).root)) && (
                        this.equals(this.binaryhash, ((RdsRequestMessage$Native$Env)arg5).binaryhash))
                         && (this.equals(this.repiehash, ((RdsRequestMessage$Native$Env)arg5).repiehash))
                         && (this.equals(this.safe, ((RdsRequestMessage$Native$Env)arg5).safe)) && (
                        this.equals(this.sign, ((RdsRequestMessage$Native$Env)arg5).sign)) && (this.
                        equals(this.signhash, ((RdsRequestMessage$Native$Env)arg5).signhash)) && (this
                        .equals(this.repie, ((RdsRequestMessage$Native$Env)arg5).repie))) {
                    return v0;
                }

                v0 = false;
            }
        }

        return v0;
    }

    public final RdsRequestMessage$Native$Env fillTagValue(int arg2, Object arg3) {
        switch(arg2) {
            case 1: {
                this.em = ((Boolean)arg3);
                break;
            }
            case 2: {
                this.ins = ((Boolean)arg3);
                break;
            }
            case 3: {
                this.insEx = ((Boolean)arg3);
                break;
            }
            case 4: {
                this.mal = RdsRequestMessage$Native$Env.immutableCopyOf(((List)arg3));
                break;
            }
            case 5: {
                this.rep = ((Boolean)arg3);
                break;
            }
            case 6: {
                this.root = ((Boolean)arg3);
                break;
            }
            case 7: {
                this.binaryhash = ((String)arg3);
                break;
            }
            case 8: {
                this.repiehash = ((String)arg3);
                break;
            }
            case 9: {
                this.safe = ((String)arg3);
                break;
            }
            case 10: {
                this.sign = ((String)arg3);
                break;
            }
            case 11: {
                this.signhash = ((String)arg3);
                break;
            }
            case 12: {
                this.repie = RdsRequestMessage$Native$Env.immutableCopyOf(((List)arg3));
                break;
            }
        }

        return this;
    }

    public final int hashCode() {
        int v2 = 1;
        int v1 = 0;
        int v0 = this.hashCode;
        if(v0 == 0) {
            v0 = this.em != null ? this.em.hashCode() : 0;
            int v3 = v0 * 37;
            v0 = this.ins != null ? this.ins.hashCode() : 0;
            v3 = (v0 + v3) * 37;
            v0 = this.insEx != null ? this.insEx.hashCode() : 0;
            v3 = (v0 + v3) * 37;
            v0 = this.mal != null ? this.mal.hashCode() : 1;
            v3 = (v0 + v3) * 37;
            v0 = this.rep != null ? this.rep.hashCode() : 0;
            v3 = (v0 + v3) * 37;
            v0 = this.root != null ? this.root.hashCode() : 0;
            v3 = (v0 + v3) * 37;
            v0 = this.binaryhash != null ? this.binaryhash.hashCode() : 0;
            v3 = (v0 + v3) * 37;
            v0 = this.repiehash != null ? this.repiehash.hashCode() : 0;
            v3 = (v0 + v3) * 37;
            v0 = this.safe != null ? this.safe.hashCode() : 0;
            v3 = (v0 + v3) * 37;
            v0 = this.sign != null ? this.sign.hashCode() : 0;
            v0 = (v0 + v3) * 37;
            if(this.signhash != null) {
                v1 = this.signhash.hashCode();
            }

            v0 = (v0 + v1) * 37;
            if(this.repie != null) {
                v2 = this.repie.hashCode();
            }

            v0 += v2;
            this.hashCode = v0;
        }

        return v0;
    }
}